package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Radio;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class FourthStepOfCheckoutPage {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement checkoutOptionsPanel;
    @FindBy(xpath = "//*[@class='radio']/label/input")
    private Radio shippingMethodRadio;
    @FindBy(xpath = "//*[@id='collapse-shipping-method']/div/p[4]/textarea")
    private TextInput commentToOrderInput;
    @FindBy(id = "button-shipping-method")
    private Button continueShippingButton;

    public WebElement getCheckoutOptionsPanel() {
        return checkoutOptionsPanel;
    }

    public Radio getShippingMethodRadio() {
        return shippingMethodRadio;
    }

    public TextInput getCommentToOrderInput() {
        return commentToOrderInput;
    }

    public Button getContinueShippingButton() {
        return continueShippingButton;
    }
}
