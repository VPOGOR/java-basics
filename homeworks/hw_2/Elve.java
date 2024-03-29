package homeworks.hw_2;

public class Elve extends Character {
    private Weapon weapon;

    public Elve(String name, int health, int armor, Weapon weapon) {
        super(name, health, armor);
        this.weapon = weapon;
    }

    public void attack(Character enemy) {
        int damageDealt = this.weapon.getDamage() - enemy.getArmor();

        if (damageDealt < 0) {
            damageDealt = 0;
        }
        enemy.setHealth(enemy.getHealth() - damageDealt);
    }
}
