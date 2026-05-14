package ua.edu.chnu.kkn.design_patterns.behavioral.visitor;

public class CommanderVisitor implements UnitVisitor {

    @Override
    public void visit(Soldier soldier) {
        System.out.println("*******");
    }

    @Override
    public void visit(Sergeant sergeant) {
        System.out.println("=======");
    }

    @Override
    public void visit(Commander commander) {
        System.out.println("Good to see you " + commander);
    }
}
