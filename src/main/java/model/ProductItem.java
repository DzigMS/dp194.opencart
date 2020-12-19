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
    public Link productImage;
    @FindBy(xpath = "//*[@class='caption']/h4/a")
    public Link productName;
    @FindBy(xpath = "//*[@class='price']")
    public Double productPrice;
    @FindBy(xpath = "//*[@id='price-tax']")
    public Double productTax;
    @FindBy(xpath = "//*[@class='button-group']/button[1]")
    public Button addToCartButton;
    @FindBy(xpath = "//*[@class='button-group']/button[2]")
    public Button addToWishListButton;
    @FindBy(xpath = "//*[@class='button-group']/button[3]")
    public Button addToCompareButton;

    public void clickAddToCart(){
        addToCartButton.click();
    }

    public void clickAddToWishList(){
        addToWishListButton.click();
    }

    public void clickAddToComparePage(){
        addToCompareButton.click();
    }

    public String getImageName(){
        return productImage.getText();
    }

    public String getPrice(){
        return price.getText();
    }

}