
public class RewardValue {

    private double cashValue;
    private double mileValue;
    private static double M_TO_C_FACTOR = 0.0035;

    public RewardValue(double cashAmount) {
        this.cashValue = cashAmount;
        this.mileValue = cashAmount * (1 / M_TO_C_FACTOR);
    }

    public RewardValue(double mileAmount, boolean mile) {
        this.mileValue = mileAmount;
        this.cashValue = mileAmount * M_TO_C_FACTOR;
    }

    public double getMilesValue() {
        return mileValue;
    }

    public double getCashValue() {
        return cashValue;
    }
}