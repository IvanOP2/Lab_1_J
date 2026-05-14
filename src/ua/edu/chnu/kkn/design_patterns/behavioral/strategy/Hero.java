package ua.edu.chnu.kkn.design_patterns.behavioral.strategy;

public class Hero {

    private DragonSlayingStrategy strategy;

    public Hero(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }
}
