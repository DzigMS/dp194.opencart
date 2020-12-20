package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Table;

public class SixthStepOfCheckoutPage {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement checkoutOptionsPanel;
    @FindBy(xpath = "//*[@class='table-responsive']/table")
    private Table finalTable;
    @FindBy(id = "button-confirm")
    private Button confirmOrderButton;

    public WebElement getCheckoutOptionsPanel() {
        return checkoutOptionsPanel;
    }

    public Table getFinalTable() {
        return finalTable;
    }

    public Button getConfirmOrderButton() {
        return confirmOrderButton;
    }
}
