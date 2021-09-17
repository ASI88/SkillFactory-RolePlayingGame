public class Battle {
    public void fight(Character hero, Character monster){
        System.out.println("FIGHT!");
        while (hero.getHealth() >0 && monster.getHealth()>0) {

            monster.setHealth(monster.getHealth()-hero.attack());
            if (monster.getHealth()<=0){
                hero.setExperience(hero.getExperience()+1);
                hero.setGold(hero.getGold() + monster.getGold());
                System.out.println("Ваш герой выиграл. Здоровье: " + hero.getHealth() + "; Опыт: " + hero.getExperience() + "; Золото:" + hero.getGold());
                break;
            }
            System.out.println("Monster health: " + monster.getHealth());
            hero.setHealth(hero.getHealth()- monster.attack());
            if(hero.getHealth()<=0){
                System.out.println("Ваш герой погиб в битве.");
                break;
            }

                System.out.println("Hero health: " + hero.getHealth());

        }
    }
}
