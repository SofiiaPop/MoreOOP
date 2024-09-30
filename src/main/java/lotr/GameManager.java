package lotr;

import java.util.Random;

public class GameManager {
    private Random random = new Random();

    public void fight(Character c1, Character c2) {
        System.out.println("The fight is between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName() + "!");
        
        while (c1.isAlive() && c2.isAlive()) {
            int damage2 = random.nextInt(c1.getPower()) + 1;
            c2.setHp(c2.getHp() - damage2);
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName() + " with " + damage2 + " damage!");

            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " was defeated!");
                break;
            }

            int damage1 = random.nextInt(c2.getPower()) + 1;
            c1.setHp(c1.getHp() - damage1);
            System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName() + " with " + damage1 + " damage!");

            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " has been defeated!");
            }
        }

        System.out.println("The fight is over!");
    }
}

