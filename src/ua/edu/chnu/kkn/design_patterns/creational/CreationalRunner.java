package ua.edu.chnu.kkn.design_patterns.creational;

import ua.edu.chnu.kkn.design_patterns.creational.abstract_factory.Kingdom;
import ua.edu.chnu.kkn.design_patterns.creational.abstract_factory.KingdomFactory;
import ua.edu.chnu.kkn.design_patterns.creational.abstract_factory.KingdomType;
import ua.edu.chnu.kkn.design_patterns.creational.builder.*;
import ua.edu.chnu.kkn.design_patterns.creational.builder.Class;
import ua.edu.chnu.kkn.design_patterns.creational.factory.CoinFactory;
import ua.edu.chnu.kkn.design_patterns.creational.factory.CoinType;
import ua.edu.chnu.kkn.design_patterns.creational.factory_method.Blacksmith;
import ua.edu.chnu.kkn.design_patterns.creational.factory_method.ElfBlacksmith;
import ua.edu.chnu.kkn.design_patterns.creational.factory_method.OrcBlacksmith;
import ua.edu.chnu.kkn.design_patterns.creational.factory_method.WeaponType;
import ua.edu.chnu.kkn.design_patterns.creational.prototype.HumanMage;
import ua.edu.chnu.kkn.design_patterns.creational.singleton.IvoryTower;

public class CreationalRunner {

    public static void main(String[] args) { run(); }

    public static void run() {
        System.out.println("----------Abstract factory begin---------");
        KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(KingdomType.ELF);
        var elfKingdom = new Kingdom(
                kingdomFactory.createKing(),
                kingdomFactory.createCastle(),
                kingdomFactory.createArmy()
        );
        System.out.println(elfKingdom.army().description());
        System.out.println(elfKingdom.castle().description());
        System.out.println(elfKingdom.king().description());
        kingdomFactory = Kingdom.FactoryMaker.makeFactory(KingdomType.ORC);
        var orcKingdom = new Kingdom(
                kingdomFactory.createKing(),
                kingdomFactory.createCastle(),
                kingdomFactory.createArmy()
        );
        System.out.println(orcKingdom.army().description());
        System.out.println(orcKingdom.castle().description());
        System.out.println(orcKingdom.king().description());
        System.out.println("-----------Abstract factory end----------");
        System.out.println();

        System.out.println("----------Builder begin---------");
        var mage = new Hero.Builder(Class.MAGE, "Medivh")
                .withHairColor(HairColor.BLACK)
                .withArmor(Armor.CLOTHES)
                .withWeapon(Weapon.STAFF)
                .build();
        System.out.println(mage.toString());
        var warrior = new Hero.Builder(Class.WARRIOR, "Varian")
                .withHairColor(HairColor.BLACK)
                .withHairType(HairType.LONG_STRAIGHT)
                .withArmor(Armor.PLATE_MAIL)
                .withWeapon(Weapon.SWORD)
                .build();
        System.out.println(warrior.toString());
        var thief = new Hero.Builder(Class.ROGUE, "Valeera")
                .withHairType(HairType.LONG_CURLY)
                .withArmor(Armor.LEATHER)
                .withWeapon(Weapon.DAGGER)
                .build();
        System.out.println(thief.toString());
        System.out.println("----------Builder end----------");
        System.out.println();

        System.out.println("----------Factory start----------");
        System.out.println("Coin factory begin to work.");
        var cooperCoin = CoinFactory.createCoin(CoinType.COOPER);
        var silverCoin = CoinFactory.createCoin(CoinType.SILVER);
        var goldCoin = CoinFactory.createCoin(CoinType.GOLD);
        System.out.println(cooperCoin.getDescription());
        System.out.println(silverCoin.getDescription());
        System.out.println(goldCoin.getDescription());
        System.out.println("----------Factory end----------");
        System.out.println();

        System.out.println("----------Factory method begin----------");
        Blacksmith blacksmith = new OrcBlacksmith();
        ua.edu.chnu.kkn.design_patterns.creational.factory_method.Weapon weapon
                = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(blacksmith + "manufactured" + weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(blacksmith + "manufactured" + weapon);
        blacksmith = new ElfBlacksmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(blacksmith + "manufactured" + weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(blacksmith + "manufactured" + weapon);
        System.out.println("----------Factory method end----------");
        System.out.println();

        System.out.println("----------Prototype begin----------");
        HumanMage medivh = new HumanMage("Medivh", 100);
        HumanMage medivhClone = (HumanMage) medivh.doClone();
        if (medivh != medivhClone) {
            System.out.println("Objects are not the same! Yeah!");
        }
        if (medivh.equals(medivhClone)) {
            System.out.println("Objects are identical! Yeah!");
        }
        System.out.println("----------Prototype end----------");
        System.out.println();

        System.out.println("----------Singleton begin----------");
        IvoryTower ivoryTower = IvoryTower.getInstance();
        System.out.println(ivoryTower.hashCode());
        System.out.println(ivoryTower.mage());
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        System.out.println(ivoryTower1.hashCode());
        System.out.println("----------Singleton end----------");
        System.out.println();
    }
}
