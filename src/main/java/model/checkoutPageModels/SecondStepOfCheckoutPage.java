package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

@FindBy(xpath = "//*[@id='accordion']/div[2]")
public class SecondStepOfCheckoutPage extends HtmlElement {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement billingDetailsPanel;
    //loggedUser
    @FindBy(name = "address_id")
    private Select addressIdSelect;
    //guestMode
    @FindBy(id = "input-payment-firstname")
    private TextInput firstNamePaymentInput;
    @FindBy(id = "input-payment-lastname")
    private TextInput lastNamePaymentInput;
    @FindBy(id = "input-payment-email")
    private TextInput emailPaymentInput;
    @FindBy(id = "input-payment-password")
    private TextInput passwordInput;
    @FindBy(id = "input-payment-confirm")
    private TextInput passwordConfirmInput;
    @FindBy(id = "input-payment-telephone")
    private TextInput telephonePaymentInput;
    //your address
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
    @FindBy(xpath = "//*[@id='collapse-payment-address']/div/div[4]/div/input[1]")
    private CheckBox shippingAddressCheckbox;
    @FindBy(id = "button-guest")
    private Button continueBillingDetailsButton;
    @FindBy(id = "button-register")
    private Button continueRegisterButton;
    @FindBy(id = "button-payment-address")
    private Button continueLoggedButton;

    public void fillNameField(String str){
        firstNamePaymentInput.sendKeys(str);
    }

    public void fillLastNameField(String str){
        lastNamePaymentInput.sendKeys(str);
    }

    public void fillEmailField(String str){
        emailPaymentInput.sendKeys(str);
    }

    public void fillPhoneField(String str){
        telephonePaymentInput.sendKeys(str);
    }

    public void fillPasswordField(String str){
        passwordInput.sendKeys(str);
    }

    public void fillConfirmPasswordField(String str){
        passwordConfirmInput.sendKeys(str);
    }

    public void fillAddressField(String str){
        address1PaymentInput.sendKeys(str);
    }

    public void fillCityField(String str){
        cityPaymentInput.sendKeys(str);
    }

    public void fillPostCodeField(String str){
        postcodePaymentInput.sendKeys(str);
    }

    public void selectCountry(int index){
        countrySelect.selectByIndex(index);
    }

    public void selectRegion(String index){
        regionSelect.selectByValue(index);
    }

    public void checkCheckBox(){
        shippingAddressCheckbox.select();
    }

    public void clickContinueButton(){
        continueBillingDetailsButton.click();
    }

    public void clickContinueRegisterButton(){
        continueRegisterButton.click();
    }

    public void clickContinueLoggedButton(){
        continueLoggedButton.click();
    }
}
