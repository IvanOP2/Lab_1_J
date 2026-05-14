package ua.edu.chnu.kkn.design_patterns.structural.decorator;

public class SimpleTroll implements Troll {

    @Override
    public void attack() {
        System.out.println("The troll is attacking you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll is scared and runs away!");
    }
}
