package ua.edu.chnu.kkn.design_patterns.creational.singleton;

public class IvoryTower {

    private volatile static IvoryTower ivoryTower = null;

    private IvoryTower() {}

    public static IvoryTower getInstance() {
        if (ivoryTower == null) {
            synchronized (IvoryTower.class) {
                if (ivoryTower == null) {
                    ivoryTower = new IvoryTower();
                }
            }
        }
        return ivoryTower;
    }

    public String mage() {
        return "Saruman";
    }
}
