package pages;

import driver.Driver;
import model.checkoutPageModels.*;

public class CheckoutPage extends BasePage{
    private FirstStepOfCheckoutPage firstStepOfCheckoutPage;
    private SecondStepOfCheckoutPage secondStepOfCheckoutPage;
    private ThirdStepOfCheckoutPage thirdStepOfCheckoutPage;
    private FourthStepOfCheckoutPage fourthStepOfCheckoutPage;
    private FifthStepOfCHeckoutPage fifthStepOfCHeckoutPage;
    private SixthStepOfCheckoutPage sixthStepOfCheckoutPage;




    public CheckoutPage(Driver driver) {
        super(driver);
    }

    public FirstStepOfCheckoutPage getFirstStepOfCheckoutPage() {
        return this.firstStepOfCheckoutPage;
    }

    public SecondStepOfCheckoutPage getSecondStepOfCheckoutPage() {
        return secondStepOfCheckoutPage;
    }

    public ThirdStepOfCheckoutPage getThirdStepOfCheckoutPage() {
        return thirdStepOfCheckoutPage;
    }

    public FourthStepOfCheckoutPage getFourthStepOfCheckoutPage() {
        return fourthStepOfCheckoutPage;
    }

    public FifthStepOfCHeckoutPage getFifthStepOfCHeckoutPage() {
        return fifthStepOfCHeckoutPage;
    }

    public SixthStepOfCheckoutPage getSixthStepOfCheckoutPage() {
        return sixthStepOfCheckoutPage;
    }

}
