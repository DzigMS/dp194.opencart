package checkoutTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.CategoryPageStep;
import steps.CheckoutPageAsGuestStep;
import steps.CheckoutPageRegisterStep;
import steps.HomePageStep;

public class TC_DP194_50 extends CommonConditionTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/RegisterValuesCheckoutPage.csv",numLinesToSkip = 1)
    public void checkoutRegister(String name, String surname, String email, String phone, String password, String address, String city, String postCode, int countryIndex, String regionIndex) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.clickAddToCartButton();
        CheckoutPageRegisterStep checkoutPageStep = categoryPageStep.clickOnCheckoutLink(new CheckoutPageRegisterStep(this.driver));
        checkoutPageStep.step1CheckoutPage()
                .step2CheckoutPage(name, phone, email, phone,password,address,city,postCode,countryIndex, regionIndex)
                .step3CheckoutPage()
                .step4CheckoutPage()
                .step5CheckoutPage()
                .step6CheckoutPage()
                .verifyCurrentPage(PagesURL.SUCCESS_CHECKOUT_PAGE);
    }
}
