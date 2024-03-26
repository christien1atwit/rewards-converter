
public class RewardValue {

    private double cashValue;
    private int mileValue;
    private static double M_TO_C_FACTOR = 0.0035;

    public RewardValue(double cashAmount) {
        this.cashValue = cashAmount;
        this.mileValue = (int) (cashAmount * (1 / M_TO_C_FACTOR));
    }

    public RewardValue(int mileAmount) {
        this.mileValue = mileAmount;
        this.cashValue = mileAmount * M_TO_C_FACTOR;
    }

    public int getMilesValue() {
        return mileValue;
    }

    public double getCashValue() {
        return cashValue;
    }
}