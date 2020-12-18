package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Radio;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(id="form-review")
public class ProductReview extends HtmlElement {

    @FindBy(id = "input-name")
    private TextInput nameTexBox;
    @FindBy(id = "input-review")
    private TextInput reviewTextBox;
    @FindBy(id = "button-review")
    private TextInput continueButtonReview;
    @FindBy(xpath = "//*[@name='rating'and@value='5']")
    private Radio ratingRadio;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private TextBlock messageSuccess;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private TextBlock messageNotSuccess;

    public void fillNameTexBox(String name){
        nameTexBox.sendKeys(name);
    }
    public void fillReviewTextBox(String review){
        reviewTextBox.sendKeys(review);
    }

    public void murkDownProductRatingRadio(){
        ratingRadio.click();
    }

    public void clickContinueButtonReview(){
        continueButtonReview.click();
      }

    public String getMessageSuccess(){
        return messageSuccess.getText();
    }

}
