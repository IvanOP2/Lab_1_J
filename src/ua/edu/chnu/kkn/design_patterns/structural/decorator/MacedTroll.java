package ua.edu.chnu.kkn.design_patterns.structural.decorator;

public class MacedTroll implements Troll {

    private final Troll decorated;

    public MacedTroll(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        System.out.println("The troll swings on you with a mace!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 5;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
