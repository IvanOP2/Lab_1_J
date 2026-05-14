package ua.edu.chnu.kkn.design_patterns.structural.bridge;

public class SoulEatingEnchantment implements Enchantment {

    @Override
    public void activate() {
        System.out.println("The item starts bleeding.");
    }

    @Override
    public void apply() {
        System.out.println("The item eats the soul of enemies.");
    }

    @Override
    public void deactivate() {
        System.out.println("The item stops bleeding.");
    }
}
