package ua.edu.chnu.kkn.design_patterns.creational.factory;

public class GoldCoin implements Coin {

    @Override
    public String getDescription() {
        return "It's a Gold Coin. 100 silver coins can be exchanged to 1 gold coin.";
    }
}
