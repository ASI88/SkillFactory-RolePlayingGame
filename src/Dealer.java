import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dealer {
    private int healthPrice = 1;

    public void BuyHealth(Character hero) throws IOException {

        System.out.println("У вас есть " + hero.getGold() + " золота. Сколько здоровья вы хотите купить?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String buyHealth = reader.readLine();
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(buyHealth);
        buyHealth = "";
        while(m.find()){
            buyHealth += m.group();
        }
        System.out.println(buyHealth);
        int buyHealthCount = Integer.parseInt(buyHealth);

        System.out.println("Будет списано " + buyHealthCount * healthPrice);

        if(hero.getGold() >= buyHealthCount){
            hero.setHealth(hero.getHealth() + buyHealthCount);
            hero.setGold(hero.getGold()-buyHealthCount);
            if(hero.getGold()<0){
                hero.setGold(0);
            }
            if(hero.getHealth()>100){
                hero.setHealth(100);
            }
            System.out.println("Вы купили здоровье. Здоровье: " + hero.getHealth() + "; Золото:" + hero.getGold());
        } else {
            System.out.println("У вас недостаточно золота для покупки здоровья");
        }
    }

}
