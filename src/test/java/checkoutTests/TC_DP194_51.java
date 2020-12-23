package checkoutTests;

import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.CategoryPageStep;
import steps.CheckoutPageAsLoggedUserStep;
import steps.HomePageStep;

public class TC_DP194_51 extends CommonConditionTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/LoginValuesCheckoutPage.csv",numLinesToSkip = 1)
    public void checkoutAsLoggedUser(String email, String password){

        String contactPageUrl = "http://34.121.117.87/index.php?route=checkout/success";

        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.clickAddToCartButton();
        CheckoutPageAsLoggedUserStep checkoutPageStep = homePageStep.clickOnCheckoutLinkLogged();
        checkoutPageStep.step1CheckoutPage(email,password)
                .step2CheckoutPage()
                .step3CheckoutPage()
                .step4CheckoutPage()
                .step5CheckoutPage()
                .step6CheckoutPage()
                .verifyCurrentPage(contactPageUrl);

    }


}
