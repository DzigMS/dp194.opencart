package steps;

import driver.Driver;
import pages.CheckoutPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutPageAsGuestStep extends BaseStep{
    private CheckoutPage checkoutPage;

    public CheckoutPageAsGuestStep(Driver driver) {
        super(driver);
        this.checkoutPage = new CheckoutPage(this.getDriver());
    }

    public CheckoutPageAsGuestStep step1CheckoutPage(){
        checkoutPage.getFirstStepOfCheckoutPage().clickGuestCheckoutRadio();
        checkoutPage.getFirstStepOfCheckoutPage().clickContinueBillingDetailsButton();
        return this;
    }

    public CheckoutPageAsGuestStep step2CheckoutPage(String name,String surname,String email,String phone,String address, String city, String postCode, int countryIndex, String regionIndex){
        checkoutPage.getSecondStepOfCheckoutPage().fillNameField(name);
        checkoutPage.getSecondStepOfCheckoutPage().fillLastNameField(surname);
        checkoutPage.getSecondStepOfCheckoutPage().fillEmailField(email);
        checkoutPage.getSecondStepOfCheckoutPage().fillPhoneField(phone);
        checkoutPage.getSecondStepOfCheckoutPage().fillAddressField(address);
        checkoutPage.getSecondStepOfCheckoutPage().fillCityField(city);
        checkoutPage.getSecondStepOfCheckoutPage().fillPostCodeField(postCode);
        checkoutPage.getSecondStepOfCheckoutPage().selectCountry(countryIndex);
        checkoutPage.getSecondStepOfCheckoutPage().selectRegion(regionIndex);
        checkoutPage.getSecondStepOfCheckoutPage().clickContinueButton();


        return this;
    }

    public CheckoutPageAsGuestStep step4CheckoutPage(){
        checkoutPage.getFourthStepOfCheckoutPage().clickContinueButton();
        return this;
    }

    public CheckoutPageAsGuestStep step5CheckoutPage(){
        checkoutPage.getFifthStepOfCHeckoutPage().clickCheckBox();
        checkoutPage.getFifthStepOfCHeckoutPage().clickButton();
        return this;
    }

    public CheckoutPageAsGuestStep step6CheckoutPage(){
        checkoutPage.getSixthStepOfCheckoutPage().clickConfirmOrderButton();
        return this;
    }


    public CheckoutPageAsGuestStep verifyCurrentPage(String expectedUrl) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actual = this.getDriver().getLinkUrl();
        assertEquals(expectedUrl, actual);
        return this;
    }

}
