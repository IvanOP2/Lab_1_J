package ua.edu.chnu.kkn.design_patterns.creational.builder;

public enum Weapon {

    DAGGER, SWORD, AXE, WAR_HAMMER, BOW, STAFF;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
