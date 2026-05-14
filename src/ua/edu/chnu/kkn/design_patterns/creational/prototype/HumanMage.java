package ua.edu.chnu.kkn.design_patterns.creational.prototype;

import java.util.Objects;

public class HumanMage implements Prototype {

    private final String name;

    private final int level;

    public HumanMage(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HumanMage humanMage = (HumanMage) o;
        return level == humanMage.level && Objects.equals(name, humanMage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }

    @Override
    public Prototype doClone() {
        return new HumanMage(name, level);
    }
}
