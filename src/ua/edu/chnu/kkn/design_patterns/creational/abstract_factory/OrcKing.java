package ua.edu.chnu.kkn.design_patterns.creational.abstract_factory;

public class OrcKing implements King {

    private static final String DESCRIPTION = "This is the elven king!";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
