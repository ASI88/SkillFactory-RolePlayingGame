abstract class Character {
    private String name;
    private int dexterity;
    private int health;
    private int experience;
    private int gold;
    private int force;

    public Character(String name, int dexterity, int health, int experience, int gold, int force) {
        this.name = name;
        this.dexterity = dexterity;
        this.health = health;
        this.experience = experience;
        this.gold = gold;
        this.force = force;
    }

    public int attack(){
        if(dexterity * 3 > (Math.random()*100)) {
            return dexterity;
        } else return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public int getGold() {
        return gold;
    }

    public int getForce() {
        return force;
    }
}
