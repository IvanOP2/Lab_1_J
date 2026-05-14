package ua.edu.chnu.kkn.design_patterns.creational.factory;

public class CoinFactory {

    public static Coin createCoin(CoinType coinType) {
        switch (coinType) {
            case COOPER -> { return new CooperCoin(); }
            case SILVER ->  { return new SilverCoin(); }
            case GOLD ->  { return new GoldCoin(); }
            default -> throw new IllegalArgumentException("Unknown CoinType");
        }
    }
}
