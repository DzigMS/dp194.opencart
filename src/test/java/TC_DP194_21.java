import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation changing quantity of items in cart to correct value
public class TC_DP194_21 extends CommonConditionTest {

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

        assertEquals( "Success: You have modified your shopping cart!\n×",actual);
    }
}
