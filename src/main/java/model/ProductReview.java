package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Radio;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class ProductReview extends HtmlElement {
    @FindBy(id = "input-name")
    private TextInput nameTexBox;
    @FindBy(id = "input-review")
    private TextInput reviewTextBox;
    @FindBy(id = "button-review")
    private TextInput continueButtonReview;
    @FindBy(xpath = "//*[@name='rating'and@value='5']")
    private Radio ratingRadio;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/i")
    private TextBlock messageSuccess;
    @FindBy(xpath = "/div[@class='alert alert-danger alert-dismissible']/i")
    private TextBlock messageNotSuccess;
}
