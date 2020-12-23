package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Table;

@FindBy(xpath = "//*[@id='accordion']/div[6]")
public class SixthStepOfCheckoutPage extends HtmlElement {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement checkoutOptionsPanel;
    @FindBy(xpath = "//*[@class='table-responsive']/table")
    private Table finalTable;
    @FindBy(id = "button-confirm")
    private Button confirmOrderButton;

    public void clickConfirmOrderButton(){
        confirmOrderButton.click();
    }
}
