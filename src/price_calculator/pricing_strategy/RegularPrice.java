package price_calculator.pricing_strategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(double price, boolean isSignedUpForNewsletter) {
        if(!isSignedUpForNewsletter)
            System.out.println("Actual price: " + price);
        else {
            System.out.println("This product is signed up for newsletter!!!");
            new SalePrice().calculatePrice(price, true);
        }
    }
}
