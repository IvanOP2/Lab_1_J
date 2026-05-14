package ua.edu.chnu.kkn.design_patterns.creational.abstract_factory;

public class OrcArmy implements Army {

    private static final String DESCRIPTION = "This is the orc army!";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
