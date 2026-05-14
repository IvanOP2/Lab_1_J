package ua.edu.chnu.kkn.design_patterns.behavioral.strategy;

public class MeleeStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("With your Thunderfury you sever the dragon's head!");
    }
}
