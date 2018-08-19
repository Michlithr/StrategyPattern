package price_calculator.pricing_strategy;

public class SalePrice implements PricingStrategy{
    @Override
    public void calculatePrice(double price, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter)
            System.out.println("Actual price: " + price * 0.5);
        else {
            System.out.println("This product isn't signed up for newsletter.");
            System.out.println("Actual price: " + price);
        }
    }
}
