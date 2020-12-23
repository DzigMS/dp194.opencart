package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

@FindBy(id = "collapse-checkout-option")
public class FirstStepOfCheckoutPage extends HtmlElement {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement checkoutOptionsPanel;
    @FindBy(xpath = "//*[@class='radio'][1]")
    private Radio registerAccountRadio;
    @FindBy(xpath = "div/div/div[1]/div[2]/label/input")
    private Radio guestCheckoutRadio;
    @FindBy(id = "button-account")
    private Button continueButton;
    @FindBy(id = "input-email")
    private TextInput emailInput;
    @FindBy(id = "input-password")
    private TextInput passwordInput;
    @FindBy(id = "button-login")
    private Button loginButton;
    @FindBy(id = "input-payment-company")
    private TextInput companyPaymentInput;
    @FindBy(id = "input-payment-address-1")
    private TextInput address1PaymentInput;
    @FindBy(id = "input-payment-address-2")
    private TextInput address2PaymentInput;
    @FindBy(id = "input-payment-city")
    private TextInput cityPaymentInput;
    @FindBy(id = "input-payment-postcode")
    private TextInput postcodePaymentInput;
    @FindBy(id = "input-payment-country")
    private Select countrySelect;
    @FindBy(id = "input-payment-zone")
    private Select regionSelect;
    @FindBy(xpath = "//*[@class='checkbox']")
    private CheckBox shippingAddressCheckbox;
    @FindBy(id = "button-account")
    private Button continueBillingDetailsButton;
    @FindBy(id = "button-login")
    private Button continueLoggedButton;


    public void clickContinueLoggedUser(){
        continueLoggedButton.click();
    }

    public void clickGuestCheckoutRadio() {
        guestCheckoutRadio.click();
    }

    public void clickRegisterCheckoutRadio(){
        registerAccountRadio.click();
    }

    public void fillEmailField(String str){
        emailInput.sendKeys(str);
    }

    public void fillPasswordField(String str){
        passwordInput.sendKeys(str);
    }

    public void clickContinueBillingDetailsButton() {
        continueBillingDetailsButton.click();
    }
}
