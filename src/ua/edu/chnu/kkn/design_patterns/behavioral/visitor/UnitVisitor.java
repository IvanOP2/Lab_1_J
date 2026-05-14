package ua.edu.chnu.kkn.design_patterns.behavioral.visitor;

public interface UnitVisitor {

    void visit(Soldier soldier);

    void visit(Sergeant sergeant);

    void visit(Commander commander);
}
