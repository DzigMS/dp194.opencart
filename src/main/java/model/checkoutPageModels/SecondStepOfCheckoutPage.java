package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(xpath = "//*[@id='accordion']/div[2]")
public class SecondStepOfCheckoutPage {
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
    @FindBy(xpath = "//*[@class='checkbox']")
    private CheckBox shippingAddressCheckbox;
    @FindBy(id = "button-guest")
    private Button continueBillingDetailsButton;


}
