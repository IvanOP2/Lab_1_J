package ua.edu.chnu.kkn.design_patterns.structural.bridge;

public class Sword implements Weapon {

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The sword is wielded.");
        enchantment.activate();
    }

    @Override
    public void swing() {
        System.out.println("The sword is swung.");
        enchantment.apply();
    }

    @Override
    public void unWield() {
        System.out.println("The sword is unwielded.");
        enchantment.deactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
