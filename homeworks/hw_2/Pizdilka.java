package homeworks.hw_2;

public class Pizdilka {

    public static void main(String[] args) {
        Elve elfic = new Elve("Elfic", 100, 10, new Knife("Zatochka"));
        Elve orchick = new Elve("Orchick", 100, 5, new Sword("Machete"));

        elfic.attack(orchick);
        System.out.println("Elfic attacks Orchick");
        System.out.println("Orchick health: " + orchick.getHealth());

        orchick.attack(elfic);
        System.out.println("Orchick attacks Elfic");
        System.out.println("Elfic health: " + orchick.getHealth());
    }
}
