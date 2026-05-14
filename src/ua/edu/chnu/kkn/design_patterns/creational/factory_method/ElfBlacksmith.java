package ua.edu.chnu.kkn.design_patterns.creational.factory_method;

import java.util.EnumMap;
import java.util.Map;

public class ElfBlacksmith implements Blacksmith {

    private static final Map<WeaponType, ElfWeapon> ELF_ARSENAL;

    static {
        ELF_ARSENAL = new EnumMap<>(WeaponType.class);
        for(WeaponType type : WeaponType.values()){
            ELF_ARSENAL.put(type, new ElfWeapon(type));
        }
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ELF_ARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The Elf Blacksmith";
    }
}
