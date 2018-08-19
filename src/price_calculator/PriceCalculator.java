package price_calculator;

import price_calculator.pricing_strategy.PricingStrategy;
import price_calculator.pricing_strategy.RegularPrice;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    public void calculate(double price, boolean isSignedUpForNewsletter){
        try{
            pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
        } catch(NullPointerException e){
            System.out.println("Pricing strategy wasn't set up. It's basically regular price!");
            pricingStrategy = new RegularPrice();
            pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
        }
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
