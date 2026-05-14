package ua.edu.chnu.kkn.design_patterns.creational.factory_method;

public record OrcWeapon(WeaponType weaponType) implements Weapon {

    @Override
    public String toString() {
        return "an orcish " + weaponType;
    }
}
