package steps;

import driver.Driver;
import pages.CheckoutPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutPageAsLoggedUserStep extends BaseStep{
        private CheckoutPage checkoutPage;
    public CheckoutPageAsLoggedUserStep(Driver driver) {
        super(driver);
        this.checkoutPage = new CheckoutPage(this.getDriver());
    }

    public CheckoutPageAsLoggedUserStep step1CheckoutPage(String email,String password){
        checkoutPage.getFirstStepOfCheckoutPage().fillEmailField(email);
        checkoutPage.getFirstStepOfCheckoutPage().fillPasswordField(password);
        checkoutPage.getFirstStepOfCheckoutPage().clickContinueLoggedUser();
        return this;
    }

    public CheckoutPageAsLoggedUserStep step2CheckoutPage(){
        checkoutPage.getSecondStepOfCheckoutPage().clickContinueLoggedButton();


        return this;
    }

    public CheckoutPageAsLoggedUserStep step3CheckoutPage(){
        checkoutPage.getThirdStepOfCheckoutPage().clickContinueButton();
        return this;
    }

    public CheckoutPageAsLoggedUserStep step4CheckoutPage(){
        checkoutPage.getFourthStepOfCheckoutPage().clickContinueButton();
        return this;
    }

    public CheckoutPageAsLoggedUserStep step5CheckoutPage(){
        checkoutPage.getFifthStepOfCHeckoutPage().clickCheckBox();
        checkoutPage.getFifthStepOfCHeckoutPage().clickButton();
        return this;
    }

    public CheckoutPageAsLoggedUserStep step6CheckoutPage(){
        checkoutPage.getSixthStepOfCheckoutPage().clickConfirmOrderButton();
        return this;
    }



    public CheckoutPageAsLoggedUserStep verifyCurrentPage(String expectedUrl) {

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
