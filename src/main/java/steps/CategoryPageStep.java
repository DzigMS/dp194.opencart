package steps;

import driver.Driver;
import model.ProductItem;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CategoryPage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryPageStep extends BaseStep {
    private CategoryPage categoryPage;

    public CategoryPageStep(Driver driver) {
        super(driver);
        this.categoryPage = new CategoryPage(driver);
    }

    public CategoryPageStep clickProduct() {
        categoryPage.getProductItemList().get(0).clickOnProductLink();
        return this;
    }

    public CategoryPageStep selectShowValueNameAZStep() {
        categoryPage.getProductActions().selectSortByIndex(1);
        return this;
    }

    public CategoryPageStep selectShowValueNameZAStep() {
        categoryPage.getProductActions().selectSortByIndex(2);
        return this;
    }

    public CategoryPageStep selectShowValueNamePriceLowHigh() {
        categoryPage.getProductActions().selectSortByIndex(3);
        return this;
    }

    public CategoryPageStep selectShowValueNamePriceHighLow() {
        categoryPage.getProductActions().selectSortByIndex(4);
        return this;
    }

    public CategoryPageStep selectShowValueNameHighestRatingStep() {
        categoryPage.getProductActions().selectSortByIndex(5);
        return this;
    }

    public CategoryPageStep selectShowValueNameLowestRatingStep() {
        categoryPage.getProductActions().selectSortByIndex(6);
        return this;
    }

    public CategoryPageStep compareResult(List<String> expected) {
        assertEquals(expected, this.getItemNames());
        return this;
    }

    public CategoryPageStep verifyCurrentPage(String expectedUrl) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actual = this.getDriver().getLinkUrl();
        assertEquals(expectedUrl, actual);
        return this;
    }


    private List<String> getItemNames() {
        List<String> names = new ArrayList<>();
        for (ProductItem item :
                this.categoryPage.getProductItemList()) {
            names.add(item.getProductName());

        }
        return names;
    }

    public void clickAddToCartButton() {
        for (ProductItem item :
                this.categoryPage.getProductItemList()) {
            WebDriverWait wait =new WebDriverWait(this.getDriver().getWebDriver(), 90);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]")));
            this.getDriver().getWebDriver().findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]")).click();
            item.clickAddToCart();
        }
    }

    public void clickAddToCompareButton() {
        for (ProductItem item :
                this.categoryPage.getProductItemList()) {
            item.clickAddToComparePage();
        }
    }

    public void clickAddToShoppingCartButton() {
        for (ProductItem item :
                this.categoryPage.getProductItemList()) {
            item.clickAddToCart();
        }
    }

    public <T> T clickOnCheckoutLink(T t) {
        categoryPage.getTopNavBar().clickCheckoutLink();
        return t;
    }

}
