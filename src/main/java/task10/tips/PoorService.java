package task10.tips;


public class PoorService implements Tips {
    public double tipsAmount(int amount) {
        return amount * 0.05;
    }
}
