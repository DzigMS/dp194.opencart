package pages;

import driver.Driver;
import model.ProductReview;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.Radio;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

import java.awt.*;

public class ProductPage extends BasePage {
    private ProductReview productReview;
    @FindBy(id = "input-quantity")
    private TextInput quantityTextBox;
    @FindBy(id = "button-cart")
    private Button addToCardButton;
    @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    private Button addToWishListButton;
    @FindBy(xpath = "//div[@id='content']//h1")
    private TextBlock productName;
    @FindBy(xpath = "//ul[@class='list-unstyled']//h2")
    private TextBlock productPrice;
    @FindBy(xpath = "//*[contains(text(),'Reviews')]")
    private Link reviews;

    public ProductPage(Driver driver) {
        super(driver);
    }

    public ProductReview getProductReview() {
        return productReview;
    }

    public void goToModelProductReview() {
        reviews.click();
    }
}
