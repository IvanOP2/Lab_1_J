package ua.edu.chnu.kkn.design_patterns.creational.abstract_factory;

public class ElfCastle implements Castle{

    private static final String DESCRIPTION = "This is the elven castle!";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
