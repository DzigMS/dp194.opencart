package pages;

import driver.Driver;
import model.ProductReview;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class ProductPage extends BasePage {
    private ProductReview productReview;
    @FindBy(id = "input-quantity")
    private TextInput productQuantity;
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
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private TextBlock successMessage;

    public ProductPage(Driver driver) {
        super(driver);
    }

    public ProductReview getProductReview() {
        return productReview;
    }

    public void clearFieldProductQuantity(){
        productQuantity.clear();
    }
    public void fillFieldProductQuantity(String quantity) {
        productQuantity.sendKeys(quantity);
    }

    public String getProductQuantity() {
        return productQuantity.getText();
    }

    public void addProductToShoppingCart() {
        addToCardButton.click();
    }

    public void addProductToWishList() {
        addToWishListButton.click();
    }

    public String getProductName() {
        return productName.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public void goToModelProductReview() {
        reviews.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
