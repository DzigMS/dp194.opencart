package pages;

import driver.Driver;
import model.Coupon;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

public class ShoppingCartPage extends BasePage {
    private Coupon coupon;
    @FindBy(xpath = "//div[@class='table-responsive']")
    private Table shoppingCarTable;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    private Link productName;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[5]")
    private TextBlock productPrice;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[6]")
    private TextBlock totalPrice;
    @FindBy(xpath = "//input[contains(@name,'quantity')]")
    private TextInput productQuantity;
    @FindBy(xpath = "//button[@data-original-title='Update']")
    private Button updateButton;
    @FindBy(xpath = "//button[@data-original-title='Remove']")
    private Button removeButton;
    @FindBy(linkText = "Continue Shopping")
    private Button continueShopping;
    @FindBy(linkText = "Continue")
    private Link continueButton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private TextBlock successMessageModified;
    @FindBy(linkText = "Checkout")
    private Link checkoutLink;

    public ShoppingCartPage(Driver driver) {
        super(driver);
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public String getProductName() {
        return productName.getText();
    }

    public void clickLinkProductName() {
        productName.click();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public String getTotalPrice() {
        return productPrice.getText();
    }

    public String getProductQuantity() {
        return productQuantity.getText();
    }

    public void clearFieldProductQuantity() {
        productQuantity.clear();
    }

    public void fillProductQuantity(String quantity) {
        productQuantity.sendKeys(quantity);
    }

    public void clickUpdateButton() {
        updateButton.click();
    }

    public void clickRemoveButton() {
        removeButton.click();
    }

    public void clickContinueShoppingButton() {
        continueShopping.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public String getSuccessMessageModified() {
        return successMessageModified.getText();
    }

    public void clickCheckoutLink() {
        checkoutLink.click();
    }

}
