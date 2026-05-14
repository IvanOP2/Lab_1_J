package ua.edu.chnu.kkn.design_patterns.structural.flyweight;

public class StrengthPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You feel strong. (Potion=" + System.identityHashCode(this) + ")");
    }
}
