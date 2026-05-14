package ua.edu.chnu.kkn.design_patterns.behavioral;

import ua.edu.chnu.kkn.design_patterns.behavioral.chainofresponsibility.*;
import ua.edu.chnu.kkn.design_patterns.behavioral.command.*;
import ua.edu.chnu.kkn.design_patterns.behavioral.iterator.Item;
import ua.edu.chnu.kkn.design_patterns.behavioral.iterator.ItemType;
import ua.edu.chnu.kkn.design_patterns.behavioral.iterator.TreasureChest;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.Action;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.Party;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.PartyImpl;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.members.Hobbit;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.members.Hunter;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.members.Rogue;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.members.Wizard;
import ua.edu.chnu.kkn.design_patterns.behavioral.memento.Star;
import ua.edu.chnu.kkn.design_patterns.behavioral.memento.StarMemento;
import ua.edu.chnu.kkn.design_patterns.behavioral.memento.StarType;
import ua.edu.chnu.kkn.design_patterns.behavioral.observer.Hobbits;
import ua.edu.chnu.kkn.design_patterns.behavioral.observer.Orcs;
import ua.edu.chnu.kkn.design_patterns.behavioral.observer.Weather;
import ua.edu.chnu.kkn.design_patterns.behavioral.state.Mammoth;
import ua.edu.chnu.kkn.design_patterns.behavioral.strategy.Hero;
import ua.edu.chnu.kkn.design_patterns.behavioral.strategy.MeleeStrategy;
import ua.edu.chnu.kkn.design_patterns.behavioral.strategy.ProjectileStrategy;
import ua.edu.chnu.kkn.design_patterns.behavioral.strategy.SpellStrategy;
import ua.edu.chnu.kkn.design_patterns.behavioral.templatemethod.HitAndRunMethod;
import ua.edu.chnu.kkn.design_patterns.behavioral.templatemethod.SubtleMethod;
import ua.edu.chnu.kkn.design_patterns.behavioral.templatemethod.Thief;
import ua.edu.chnu.kkn.design_patterns.behavioral.visitor.*;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BehavioralRunner {

    public static void main(String[] args) {run();}

    public static void run() {
        System.out.println("----------Strategy start----------");
        System.out.println("Green dragon spotted ahead!");
        var hero = new Hero(new MeleeStrategy());
        hero.goToBattle();
        System.out.println("Red dragon emerges.");
        hero.changeStrategy(new ProjectileStrategy());
        hero.goToBattle();
        System.out.println("Black dragon lands behind you.");
        hero.changeStrategy(new SpellStrategy());
        hero.goToBattle();
        System.out.println("----------Strategy end----------");
        System.out.println();

        System.out.println("----------Observer start----------");
        var weather = new Weather();
        var orcs = new Orcs();
        var hobbits = new Hobbits();
        weather.addObserver(orcs);
        weather.addObserver(hobbits);
        weather.timePasses();
        weather.timePasses();
        System.out.println("Hobbits move away.");
        weather.removeObserver(hobbits);
        weather.timePasses();
        weather.timePasses();
        System.out.println("----------Observer end----------");
        System.out.println();

        System.out.println("----------State start----------");
        var mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        System.out.println("----------State end----------");
        System.out.println();

        System.out.println("----------Mediator start----------");
        Party party = new PartyImpl();
        var hobbit = new Hobbit();
        var wizard = new Wizard();
        var rogue = new Rogue();
        var hunter = new Hunter();
        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);
        hobbit.act(Action.ENEMY);
        wizard.act(Action.TALE);
        rogue.act(Action.GOLD);
        hunter.act(Action.HUNT);
        System.out.println("----------Mediator end----------");
        System.out.println();

        System.out.println("----------Chain of responsibility start----------");
        var kingHandlers = Arrays.asList(new OrcOfficer(), new OrcSoldier(), new OrcCommander());
        var orcKing = new OrcKing(kingHandlers);
        orcKing.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        orcKing.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
        orcKing.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        System.out.println("----------Chain of responsibility end----------");
        System.out.println();

        System.out.println("----------Command start----------");
        Lunch lunch = new Lunch();
        Command lunchCommand = new LunchCommand(lunch);
        Dinner dinner = new Dinner();
        Command dinnerCommand = new DinnerCommand(dinner);
        MealInvoker mealInvoker = new MealInvoker(lunchCommand);
        mealInvoker.invoke();
        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();
        System.out.println("----------Command end----------");
        System.out.println();

        System.out.println("----------Iterator start----------");
        var items = List.of(
                new Item(ItemType.POTION, "Potion of courage"),
                new Item(ItemType.RING, "Ring of shadows"),
                new Item(ItemType.POTION, "Potion of wisdom"),
                new Item(ItemType.POTION, "Potion of blood"),
                new Item(ItemType.WEAPON, "Sword of silver +1"),
                new Item(ItemType.POTION, "Potion of rust"),
                new Item(ItemType.POTION, "Potion of healing"),
                new Item(ItemType.RING, "Ring of armor"),
                new Item(ItemType.WEAPON, "Steel halberd"),
                new Item(ItemType.WEAPON, "Dagger of poison")
        );
        TreasureChest chest = new TreasureChest(items);
        var itemIterator = chest.iterator(ItemType.WEAPON);
        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next());
        }
        System.out.println("----------Iterator end----------");
        System.out.println();

        System.out.println("----------Memento start----------");
        var states = new Stack<StarMemento>();
        var star = new Star(StarType.SUN, 10000000, 500000);
        System.out.println(star);
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star);
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star);
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star);
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star);
        while (!states.isEmpty()) {
            star.setMemento(states.pop());
            System.out.println(star);
        }
        System.out.println("----------Memento end----------");
        System.out.println();

        System.out.println("----------Template method start----------");
        var thief = new Thief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
        System.out.println("----------Template method end----------");
        System.out.println();

        System.out.println("----------Visitor start----------");
        var commander = new Commander(
                new Sergeant(new Soldier(), new Soldier(), new Soldier()),
                new Sergeant(new Soldier(), new Soldier(), new Soldier())
        );
        commander.accept(new SoldierVisitor());
        System.out.println("--------------------");
        commander.accept(new SergeantVisitor());
        System.out.println("--------------------");
        commander.accept(new CommanderVisitor());
        System.out.println("----------Visitor end----------");
        System.out.println();
    }
}
