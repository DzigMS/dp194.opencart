package checkout;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.CategoryPageStep;
import steps.CheckoutPageAsGuestStep;
import steps.CheckoutPageAsLoggedUserStep;
import steps.HomePageStep;

public class TC_DP194_51 extends CommonConditionTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/LoginValuesCheckoutPage.csv",numLinesToSkip = 1)
    public void checkoutAsLoggedUser(String email, String password){

        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.clickAddToCartButton();
        CheckoutPageAsLoggedUserStep checkoutPageStep = categoryPageStep.clickOnCheckoutLink(new CheckoutPageAsLoggedUserStep(this.driver));
        checkoutPageStep.step1CheckoutPage(email,password)
                .step2CheckoutPage()
                .step3CheckoutPage()
                .step4CheckoutPage()
                .step5CheckoutPage()
                .step6CheckoutPage()
                .verifyCurrentPage(PagesURL.SUCCESS_CHECKOUT_PAGE);
    }


}
