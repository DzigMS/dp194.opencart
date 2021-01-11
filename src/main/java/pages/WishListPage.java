package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextBlock;

public class WishListPage extends BasePage {
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    private Link productNameFromWishList;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[5]")
    private TextBlock productPriceFromWishList;
    @FindBy(xpath = "//a[@data-original-title='Remove']")
    private Button removeButtonFromWishList;
    @FindBy(xpath = "//button[@data-original-title='Add to Cart']")
    private Button addToCartButtonFromWishList;
    public WishListPage(Driver driver) {
        super(driver);
    }
}
