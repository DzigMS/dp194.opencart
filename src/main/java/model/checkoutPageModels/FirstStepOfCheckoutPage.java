package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

@FindBy(xpath = "//*[@id='accordion']/div[1]")
public class FirstStepOfCheckoutPage {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement checkoutOptionsPanel;
    @FindBy(xpath = "//*[@class='radio'][1]")
    private Radio registerAccountRadio;
    @FindBy(xpath = "//*[@class='radio'][2]")
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
    @FindBy(id = "button-guest")
    private Button continueBillingDetailsButton;

    public WebElement getCheckoutOptionsPanel() {
        return checkoutOptionsPanel;
    }

    public Radio getRegisterAccountRadio() {
        return registerAccountRadio;
    }

    public Radio getGuestCheckoutRadio() {
        return guestCheckoutRadio;
    }

    public Button getContinueButton() {
        return continueButton;
    }

    public TextInput getEmailInput() {
        return emailInput;
    }

    public TextInput getPasswordInput() {
        return passwordInput;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public TextInput getCompanyPaymentInput() {
        return companyPaymentInput;
    }

    public TextInput getAddress1PaymentInput() {
        return address1PaymentInput;
    }

    public TextInput getAddress2PaymentInput() {
        return address2PaymentInput;
    }

    public TextInput getCityPaymentInput() {
        return cityPaymentInput;
    }

    public TextInput getPostcodePaymentInput() {
        return postcodePaymentInput;
    }

    public Select getCountrySelect() {
        return countrySelect;
    }

    public Select getRegionSelect() {
        return regionSelect;
    }

    public CheckBox getShippingAddressCheckbox() {
        return shippingAddressCheckbox;
    }

    public Button getContinueBillingDetailsButton() {
        return continueBillingDetailsButton;
    }
}
