package discount;

import java.util.List;

public class DiscountCalculator {

    private final List<IDiscountRule> rules;

    public DiscountCalculator(List<IDiscountRule> rules) {
        this.rules = rules;
    }

    public double applyDiscount(double total) {
        double result = total;
        for (IDiscountRule rule : rules) {
            result = rule.apply(result);
        }
        return result;
    }
}
