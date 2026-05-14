package ua.edu.chnu.kkn.design_patterns.creational.factory_method;

public record ElfWeapon(WeaponType weaponType) implements Weapon {

    @Override
    public String toString() {
        return "an elven " + weaponType;
    }
}
