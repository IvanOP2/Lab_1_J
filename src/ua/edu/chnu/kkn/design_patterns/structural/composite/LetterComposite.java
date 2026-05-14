package ua.edu.chnu.kkn.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class LetterComposite {

    private final List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    public void print() {
        printThisBefore();
        children.forEach(LetterComposite::print);
        printThisAfter();
    }
}
