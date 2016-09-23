package task10.tips;


public class GoodService implements Tips {
    public double tipsAmount(int amount) {
        return amount * 0.1;
    }
}
