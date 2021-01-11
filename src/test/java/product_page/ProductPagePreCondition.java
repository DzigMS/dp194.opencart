package product_page;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;

public class ProductPagePreCondition extends CommonConditionTest {
    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

}
