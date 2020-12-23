package steps;

import driver.Driver;
import pages.CheckoutPage;


public class CheckoutStep extends BaseStep {
    private CheckoutPage checkoutPage;

    public CheckoutStep(Driver driver) {
        super(driver);
        this.checkoutPage = new CheckoutPage(this.getDriver());
    }
}
