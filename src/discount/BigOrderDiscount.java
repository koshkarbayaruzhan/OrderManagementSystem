package discount;

public class BigOrderDiscount implements IDiscountRule {
    public double apply(double total) {
        if (total > 100000) return total * 0.85;
        return total;
    }
}
