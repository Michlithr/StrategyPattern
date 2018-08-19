package price_calculator.pricing_strategy;

public interface PricingStrategy {
    void calculatePrice(double price, boolean isSignedUpForNewsletter);
}
