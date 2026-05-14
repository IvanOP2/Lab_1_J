package ua.edu.chnu.kkn.design_patterns.structural.proxy;

public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower.");
    }
}
