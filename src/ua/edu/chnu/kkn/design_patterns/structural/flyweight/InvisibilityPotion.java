package ua.edu.chnu.kkn.design_patterns.structural.flyweight;

public class InvisibilityPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You become invisible. (Potion=" + System.identityHashCode(this) + ")");
    }
}
