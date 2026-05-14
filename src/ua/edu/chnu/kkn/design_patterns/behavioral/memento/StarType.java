package ua.edu.chnu.kkn.design_patterns.behavioral.memento;

public enum StarType {

    SUN("sun"),
    RED_GIANT("red giant"),
    WHITE_DWARF("white dwarf"),
    SUPERNOVA("supernova"),
    DEAD("dead star");

    private final String type;

    StarType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
