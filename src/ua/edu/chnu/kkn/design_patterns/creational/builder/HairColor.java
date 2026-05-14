package ua.edu.chnu.kkn.design_patterns.creational.builder;

public enum HairColor {

    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
