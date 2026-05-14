package ua.edu.chnu.kkn.design_patterns.creational.factory;

public class SilverCoin implements Coin {

    @Override
    public String getDescription() {
        return "It's a Silver Coin. 100 cooper coins can be exchanged to 1 silver coin.";
    }
}
