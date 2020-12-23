package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Radio;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(xpath = "//*[@id='accordion']/div[4]")
public class FourthStepOfCheckoutPage extends HtmlElement {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement checkoutOptionsPanel;
    @FindBy(xpath = "//*[@class='radio']/label/input")
    private Radio shippingMethodRadio;
    @FindBy(xpath = "//*[@id='collapse-shipping-method']/div/p[4]/textarea")
    private TextInput commentToOrderInput;
    @FindBy(id = "button-shipping-method")
    private Button continueShippingButton;


    public void clickContinueButton(){
        continueShippingButton.click();
    }
}
