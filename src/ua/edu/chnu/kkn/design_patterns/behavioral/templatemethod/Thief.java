package ua.edu.chnu.kkn.design_patterns.behavioral.templatemethod;

public class Thief {

    private StealingMethod stealingMethod;

    public Thief(StealingMethod stealingMethod) {
        this.stealingMethod = stealingMethod;
    }

    public void steal() {
        stealingMethod.steal();
    }

    public void changeMethod(StealingMethod stealingMethod) {
        this.stealingMethod = stealingMethod;
    }
}
