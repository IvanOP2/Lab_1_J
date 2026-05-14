package ua.edu.chnu.kkn.design_patterns.structural.flyweight;

import java.util.List;

public class AlchemistShop {

    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    public AlchemistShop(List<Potion> topShelf, List<Potion> bottomShelf) {
        this.topShelf = topShelf;
        this.bottomShelf = bottomShelf;
    }

    public final List<Potion> getTopShelf() {
        return List.copyOf(this.topShelf);
    }

    public final List<Potion> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    public void drinkPotions() {
        topShelf.forEach(Potion::drink);
        bottomShelf.forEach(Potion::drink);
    }
}
