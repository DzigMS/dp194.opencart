package ShoppingCartTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation changing quantity of items in cart to correct value
public class TC_DP194_21 extends CommonConditionTest {

    private String successMessage = "Success: You have modified your shopping cart!\n×";

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/cartQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_21(String quantity) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(this.driver)
                .clearFieldQuantityProductInShoppingCartStep()
                .fillQuantityProductInShoppingCartStep(quantity)
                .updateQuantityInShoppingCartStep()
                .getSuccessMessageModifiedShoppingCartStep();

        assertEquals(successMessage, actual);
    }
}
