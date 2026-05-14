package ua.edu.chnu.kkn.design_patterns.structural;

import ua.edu.chnu.kkn.design_patterns.structural.adapter.Captain;
import ua.edu.chnu.kkn.design_patterns.structural.adapter.FishingBoatAdapter;
import ua.edu.chnu.kkn.design_patterns.structural.bridge.FlyingEnchantment;
import ua.edu.chnu.kkn.design_patterns.structural.bridge.Hammer;
import ua.edu.chnu.kkn.design_patterns.structural.bridge.SoulEatingEnchantment;
import ua.edu.chnu.kkn.design_patterns.structural.bridge.Sword;
import ua.edu.chnu.kkn.design_patterns.structural.composite.Messenger;
import ua.edu.chnu.kkn.design_patterns.structural.decorator.MacedTroll;
import ua.edu.chnu.kkn.design_patterns.structural.decorator.SimpleTroll;
import ua.edu.chnu.kkn.design_patterns.structural.facade.*;
import ua.edu.chnu.kkn.design_patterns.structural.flyweight.AlchemistShop;
import ua.edu.chnu.kkn.design_patterns.structural.flyweight.PotionFactory;
import ua.edu.chnu.kkn.design_patterns.structural.flyweight.PotionType;
import ua.edu.chnu.kkn.design_patterns.structural.proxy.IvoryTower;
import ua.edu.chnu.kkn.design_patterns.structural.proxy.Wizard;
import ua.edu.chnu.kkn.design_patterns.structural.proxy.WizardTowerProxy;

import java.util.List;

public class StructuralRunner {

    public static void main(String[] args) { run(); }

    public static void run() {
        System.out.println("----------Adapter start----------");
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
        System.out.println("----------Adapter end----------");
        System.out.println();

        System.out.println("----------Bridge start----------");
        System.out.println("The death knight receives an enchanted sword.");
        var enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unWield();
        System.out.println("The Thor receives an enchanted hammer.");
        var hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unWield();
        System.out.println("----------Bridge end----------");
        System.out.println();

        System.out.println("----------Composite start----------");
        var messenger = new Messenger();
        System.out.println("Message from the orcs: ");
        messenger.messageFromOrcs().print();
        System.out.println();
        System.out.println("Message from the elves: ");
        messenger.messageFromElves().print();
        System.out.println();
        System.out.println("----------Composite end----------");
        System.out.println();

        System.out.println("----------Decorator start----------");
        var simpleTroll = new SimpleTroll();
        simpleTroll.attack();
        simpleTroll.fleeBattle();
        System.out.println("Simple troll power: " + simpleTroll.getAttackPower());
        var macedTroll = new MacedTroll(simpleTroll);
        macedTroll.attack();
        macedTroll.fleeBattle();
        System.out.println("Maced troll power: " + macedTroll.getAttackPower());
        System.out.println("----------Decorator end----------");
        System.out.println();

        System.out.println("----------Facade start----------");
        var facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
        System.out.println("----------Facade end----------");
        System.out.println();

        System.out.println("----------Flyweight start----------");
        var factory = new PotionFactory();
        var topShelf = List.of(
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.STRENGTH),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.STRENGTH),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING)
        );
        var bottomShelf = List.of(
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER)
        );
        var alchemistShop = new AlchemistShop(topShelf, bottomShelf);
        alchemistShop.drinkPotions();
        System.out.println("----------Flyweight end----------");
        System.out.println();

        System.out.println("----------Proxy start----------");
        var proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Brown wizard"));
        System.out.println("----------Proxy end----------");
        System.out.println();
    }
}
