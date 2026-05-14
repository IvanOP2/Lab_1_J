package ua.edu.chnu.kkn.design_patterns.structural.bridge;

public class Hammer implements Weapon {

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The hammer is wielded.");
        enchantment.activate();
    }

    @Override
    public void swing() {
        System.out.println("The hammer is swung.");
        enchantment.apply();
    }

    @Override
    public void unWield() {
        System.out.println("The hammer is un wielded.");
        enchantment.deactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
