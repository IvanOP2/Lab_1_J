package ua.edu.chnu.kkn.design_patterns.behavioral.memento;

public class Star {

    private StarType type;
    private int ageYears;
    private int massTons;

    public Star(StarType startType, int startAge, int startMass) {
        this.type = startType;
        this.ageYears = startAge;
        this.massTons = startMass;
    }

    public void timePasses() {
        ageYears *= 2;
        massTons *= 8;
        switch (type) {
            case RED_GIANT -> type = StarType.WHITE_DWARF;
            case SUN -> type = StarType.RED_GIANT;
            case SUPERNOVA -> type = StarType.DEAD;
            case WHITE_DWARF -> type = StarType.SUPERNOVA;
            case DEAD -> {
                ageYears *= 2;
                massTons = 0;
            }
            default -> {
            }
        }
    }

    public StarMemento getMemento() {
        return new StarMementoInternal(type, ageYears, massTons);
    }

    public void setMemento(StarMemento memento) {
        var state = (StarMementoInternal) memento;
        this.type = state.type();
        this.ageYears = state.ageYears();
        this.massTons = state.massTons();
    }

    @Override
    public String toString() {
        return String.format("%s age: %d years mass: %d tons", type.toString(), ageYears, massTons);
    }

    private record StarMementoInternal(StarType type, int ageYears, int massTons) implements StarMemento {

    }
}
