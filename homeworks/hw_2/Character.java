package homeworks.hw_2;

public class Character {
    private String name;
    private int health;
    private int armor;

    public Character(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int currentHealth) {
        this.health = currentHealth;
    }

    public int getArmor() {
        return armor;
    }
}
