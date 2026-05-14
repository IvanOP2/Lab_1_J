package ua.edu.chnu.kkn.design_patterns.structural.adapter;

public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat boat = new FishingBoat();

    @Override
    public void row() {
        boat.sail();
    }
}
