package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

@FindBy(xpath = "//*[@id='accordion']/div[5]")
public class FifthStepOfCHeckoutPage extends HtmlElement {
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

   public void clickButton(){
       continuePaymentButton.click();
   }


   public void clickCheckBox(){
       agreeCheckBox.select();
   }
}

