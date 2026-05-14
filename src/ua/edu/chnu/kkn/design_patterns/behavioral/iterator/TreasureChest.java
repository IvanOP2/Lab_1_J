package ua.edu.chnu.kkn.design_patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public record TreasureChest(List<Item> items) {

    public Iterator<Item> iterator(ItemType itemType) {
        return new TreasureChestItemIterator(this, itemType);
    }

    @Override
    public List<Item> items() {
        return new ArrayList<>(items);
    }
}
