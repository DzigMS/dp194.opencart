package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.Radio;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class FifthStepOfCHeckoutPage {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement checkoutOptionsPanel;
    @FindBy(xpath = "//*[@class='radio']/label/input")
    private Radio paymentMethodRadio;
    @FindBy(xpath = "//*[@id='collapse-shipping-method']/div/p[4]/textarea")
    private TextInput commentAboutOrderInput;
    @FindBy(xpath = "//*[@id='collapse-payment-method']/div/div[2]/div/input[1]")
    private CheckBox agreeCheckBox;
    @FindBy(id = "button-payment-method")
    private Button continuePaymentButton;

    public WebElement getCheckoutOptionsPanel() {
        return checkoutOptionsPanel;
    }

    public Radio getPaymentMethodRadio() {
        return paymentMethodRadio;
    }

    public TextInput getCommentAboutOrderInput() {
        return commentAboutOrderInput;
    }

    public CheckBox getAgreeCheckBox() {
        return agreeCheckBox;
    }

    public Button getContinuePaymentButton() {
        return continuePaymentButton;
    }
}
