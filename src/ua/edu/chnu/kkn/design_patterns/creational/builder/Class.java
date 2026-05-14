package ua.edu.chnu.kkn.design_patterns.creational.builder;

public enum Class {

    WARRIOR, ROGUE, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
