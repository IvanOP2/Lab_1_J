package ua.edu.chnu.kkn.design_patterns.creational.factory_method;

import java.util.EnumMap;
import java.util.Map;

public class OrcBlacksmith implements Blacksmith {

    private static final Map<WeaponType, OrcWeapon> ORC_ARSENAL;

    static {
        ORC_ARSENAL = new EnumMap<>(WeaponType.class);
        for(WeaponType type : WeaponType.values()){
            ORC_ARSENAL.put(type, new OrcWeapon(type));
        }
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORC_ARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The Orc Blacksmith";
    }
}
