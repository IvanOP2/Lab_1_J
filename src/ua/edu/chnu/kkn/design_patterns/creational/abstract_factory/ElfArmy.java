package ua.edu.chnu.kkn.design_patterns.creational.abstract_factory;

public class ElfArmy implements Army {

    private static final String DESCRIPTION = "This is the elven army!";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
