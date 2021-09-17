import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Math.random() > 0.5 ? 1: 2);
        System.out.println("Создание персонажа");
        System.out.println("Напишите имя персонажа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String heroName = reader.readLine();

        Hero hero = new Hero(heroName, (int) (Math.random() * 100), 100, 0, 0, (int) (Math.random() * 100));
        System.out.println("Персонаж успешно создан:");
        System.out.println("Имя: " + hero.getName() + "; Ловкость: " + hero.getDexterity() + "; Сила: " + hero.getForce() + "; Здоровье: " + hero.getHealth() + "; Опыт: " + hero.getExperience() + "; Золото:" + hero.getGold());



        Boolean exit = false;
        while (!exit) {
            System.out.println("Куда вы хотите пойти?");
            System.out.println("1. К торговцу");
            System.out.println("2. В тёмный лес");
            System.out.println("3. На выход");

            String moveChoice = reader.readLine();
            switch (moveChoice) {
                case "1":
                    Dealer dealer = new Dealer();
                    dealer.BuyHealth(hero);

                    break;
                case "2":
                    Battle battle = new Battle();
                    Goblin monster = new Goblin("Org", (int) (Math.random() * 100), 100, 0, (int) (Math.random() * 100), (int) (Math.random() * 100));
                    battle.fight(hero, monster);
                    break;
                case "3":
                    System.out.println("Пока");
                    exit = true;
                    break;
            }
        }

    }




}
