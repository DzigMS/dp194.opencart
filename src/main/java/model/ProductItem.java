package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextBlock;
@FindBy(className = "product-thumb")
public class ProductItem extends HtmlElement {
    @FindBy(className = "price")
    private TextBlock price;

    @FindBy(className = "img-responsive")
    private Link productImage;
    @FindBy(xpath = "//*[@class='caption']/h4/a")
    private Link productName;
    @FindBy(xpath = "//*[@class='price']")
    private TextBlock productPrice;
    @FindBy(xpath = "//*[@id='price-tax']")
    private TextBlock productTax;
    @FindBy(xpath = "//*[@class='button-group']/button[1]")
    private Button addToCartButton;
    @FindBy(xpath = "//*[@class='button-group']/button[2]")
    private Button addToWishListButton;
    @FindBy(xpath = "//*[@class='button-group']/button[3]")
    private Button addToCompareButton;

    public void clickAddToCart(){
        addToCartButton.click();
    }

    public void clickAddToWishList(){
        addToWishListButton.click();
    }

    public void clickAddToComparePage(){
        addToCompareButton.click();
    }


    public String getPrice(){
        return productPrice.getText();
    }

    public String getProductTax(){
        return productTax.getText();
    }

}