package checkoutTests;

import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.CategoryPageStep;
import steps.CheckoutPageRegisterStep;
import steps.HomePageStep;

public class TC_DP194_50 extends CommonConditionTest {

    String contactPageUrl = "http://34.121.117.87/index.php?route=checkout/success";


    @ParameterizedTest
    @CsvFileSource(resources = "/RegisterValuesCheckoutPage.csv",numLinesToSkip = 1)
    public void checkoutRegister(String name, String surname, String email, String phone, String password, String address, String city, String postCode, int countryIndex, String regionIndex) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.clickAddToCartButton();
        CheckoutPageRegisterStep checkoutPageStep = homePageStep.clickOnCheckoutLinkRegister();
        checkoutPageStep.step1CheckoutPage()
                .step2CheckoutPage(name, phone, email, phone,password,address,city,postCode,countryIndex, regionIndex)
                .step3CheckoutPage()
                .step4CheckoutPage()
                .step5CheckoutPage()
                .step6CheckoutPage()
                .verifyCurrentPage(contactPageUrl);
    }
}
