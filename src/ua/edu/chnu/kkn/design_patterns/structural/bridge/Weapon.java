package ua.edu.chnu.kkn.design_patterns.structural.bridge;

public interface Weapon {
    void wield();

    void swing();

    void unWield();

    Enchantment getEnchantment();
}
