package discount;

public class SeasonDiscount implements IDiscountRule {
    public double apply(double total) {
        return total * 0.9;
    }
}
