package ua.edu.chnu.kkn.design_patterns.structural.bridge;

public class FlyingEnchantment implements Enchantment {

    @Override
    public void activate() {
        System.out.println("The item begins to glow.");
    }

    @Override
    public void apply() {
        System.out.println("The item flies and strikes the enemies finally returning to owner's hand.");
    }

    @Override
    public void deactivate() {
        System.out.println("The item's glow fades.");
    }
}
