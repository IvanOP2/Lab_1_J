package ua.edu.chnu.kkn.design_patterns.behavioral.strategy;

public class SpellStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("You cast the Pyroblast spell and the dragon transforms in a pile of dust!");
    }
}
