package steps;

import driver.Driver;
import pages.CheckoutPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutPageRegisterStep extends BaseStep{
    private CheckoutPage checkoutPage;

    public CheckoutPageRegisterStep(Driver driver) {
        super(driver);
        this.checkoutPage = new CheckoutPage(this.getDriver());
    }

    public CheckoutPageRegisterStep step1CheckoutPage(){
        checkoutPage.getFirstStepOfCheckoutPage().clickRegisterCheckoutRadio();
        checkoutPage.getFirstStepOfCheckoutPage().clickContinueBillingDetailsButton();
        return this;
    }

    public CheckoutPageRegisterStep step2CheckoutPage(String name,String surname,String email,String phone,String password ,String address, String city, String postCode, int countryIndex, String regionIndex){
        checkoutPage.getSecondStepOfCheckoutPage().fillNameField(name);
        checkoutPage.getSecondStepOfCheckoutPage().fillLastNameField(surname);
        checkoutPage.getSecondStepOfCheckoutPage().fillEmailField(email);
        checkoutPage.getSecondStepOfCheckoutPage().fillPhoneField(phone);
        checkoutPage.getSecondStepOfCheckoutPage().fillPasswordField(password);
        checkoutPage.getSecondStepOfCheckoutPage().fillConfirmPasswordField(password);
        checkoutPage.getSecondStepOfCheckoutPage().fillAddressField(address);
        checkoutPage.getSecondStepOfCheckoutPage().fillCityField(city);
        checkoutPage.getSecondStepOfCheckoutPage().fillPostCodeField(postCode);
        checkoutPage.getSecondStepOfCheckoutPage().selectCountry(countryIndex);
        checkoutPage.getSecondStepOfCheckoutPage().selectRegion(regionIndex);
        checkoutPage.getSecondStepOfCheckoutPage().checkCheckBox();
        checkoutPage.getSecondStepOfCheckoutPage().clickContinueRegisterButton();
        return this;
    }

    public CheckoutPageRegisterStep step3CheckoutPage(){
        checkoutPage.getThirdStepOfCheckoutPage().clickContinueButton();
        return this;
    }

    public CheckoutPageRegisterStep step4CheckoutPage(){
        checkoutPage.getFourthStepOfCheckoutPage().clickContinueButton();
        return this;
    }

    public CheckoutPageRegisterStep step5CheckoutPage(){
        checkoutPage.getFifthStepOfCHeckoutPage().clickCheckBox();
        checkoutPage.getFifthStepOfCHeckoutPage().clickButton();
        return this;
    }

    public CheckoutPageRegisterStep step6CheckoutPage(){
        checkoutPage.getSixthStepOfCheckoutPage().clickConfirmOrderButton();
        return this;
    }

    public CheckoutPageRegisterStep verifyCurrentPage(String expectedUrl) {

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
