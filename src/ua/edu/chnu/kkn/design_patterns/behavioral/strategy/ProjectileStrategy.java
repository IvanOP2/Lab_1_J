package ua.edu.chnu.kkn.design_patterns.behavioral.strategy;

public class ProjectileStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("You shoot the dragon with the Thori'dal bow and it falls dead on the ground!");
    }
}
