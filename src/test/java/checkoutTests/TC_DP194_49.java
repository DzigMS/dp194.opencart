package checkoutTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.CategoryPageStep;
import steps.CheckoutPageAsGuestStep;
import steps.HomePageStep;

public class TC_DP194_49 extends CommonConditionTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/GuestValuesCheckoutPage.csv",numLinesToSkip = 1)
    public void checkoutAsGuest(String name, String surname, String email, String phone, String address, String city, String postCode, int countryIndex, String regionIndex){

        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();

        categoryPageStep.clickAddToCartButton();

        CheckoutPageAsGuestStep checkoutPageStep = categoryPageStep.clickOnCheckoutLink(new CheckoutPageAsGuestStep(this.driver));
        checkoutPageStep.step1CheckoutPage()
        .step2CheckoutPage(name,surname,email,phone,address,city,postCode, countryIndex,regionIndex)
                .step4CheckoutPage()
                .step5CheckoutPage()
                .step6CheckoutPage()
                .verifyCurrentPage(PagesURL.SUCCESS_CHECKOUT_PAGE);

    }

}
