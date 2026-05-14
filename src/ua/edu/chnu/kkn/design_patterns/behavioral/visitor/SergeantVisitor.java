package ua.edu.chnu.kkn.design_patterns.behavioral.visitor;

public class SergeantVisitor implements UnitVisitor {

    @Override
    public void visit(Soldier soldier) {
        System.out.println("*******");
    }

    @Override
    public void visit(Sergeant sergeant) {
        System.out.println("Hello " + sergeant);
    }

    @Override
    public void visit(Commander commander) {
        System.out.println("------");
    }
}
