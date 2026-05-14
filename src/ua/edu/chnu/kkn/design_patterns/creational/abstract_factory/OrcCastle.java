package ua.edu.chnu.kkn.design_patterns.creational.abstract_factory;

public class OrcCastle implements Castle {

    private static final String DESCRIPTION = "This is the orc castle!";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
