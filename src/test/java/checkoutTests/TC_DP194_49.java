package checkoutTests;

import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.CategoryPageStep;
import steps.CheckoutPageAsGuestStep;
import steps.HomePageStep;

public class TC_DP194_49 extends CommonConditionTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/GuestValuesCheckoutPage.csv",numLinesToSkip = 1)
    public void checkoutAsGuest(String name, String surname, String email, String phone, String address, String city, String postCode, int countryIndex, String regionIndex){
        String contactPageUrl = "http://34.121.117.87/index.php?route=checkout/success";

        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.clickAddToCartButton();
        CheckoutPageAsGuestStep checkoutPageStep = homePageStep.clickOnCheckoutLinkAsGuest();
        checkoutPageStep.step1CheckoutPage()
        .step2CheckoutPage(name,surname,email,phone,address,city,postCode, countryIndex,regionIndex)
                .step4CheckoutPage()
                .step5CheckoutPage()
                .step6CheckoutPage()
                .verifyCurrentPage(contactPageUrl);

    }

}
