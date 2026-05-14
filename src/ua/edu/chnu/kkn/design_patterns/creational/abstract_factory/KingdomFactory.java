package ua.edu.chnu.kkn.design_patterns.creational.abstract_factory;

public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();
}
