package model.checkoutPageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

@FindBy(xpath = "//*[@id='accordion']/div[3]")
public class ThirdStepOfCheckoutPage extends HtmlElement {
    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement deliveryDetailsPanel;

    @FindBy(xpath = "//*[@id='shipping-existing']/select")
    private Select deliveryDetailsSelect;
    @FindBy(id = "input-shipping-firstname")
    private TextInput firstNameInput;
    @FindBy(id="input-shipping-lastname")
    private TextInput lastNameInput;
    @FindBy(id="input-shipping-company")
    private TextInput companyInput;

    @FindBy(id = "input-shipping-address-1")
    private TextInput address1PaymentInput;
    @FindBy(id = "input-shipping-address-2")
    private TextInput address2PaymentInput;
    @FindBy(id = "input-shipping-city")
    private TextInput cityPaymentInput;
    @FindBy(id = "input-shipping-postcode")
    private TextInput postcodePaymentInput;
    @FindBy(id = "input-shipping-country")
    private Select countrySelect;
    @FindBy(id = "input-shipping-zone")
    private Select regionSelect;
    @FindBy(xpath = "//*[@class='checkbox']")
    private CheckBox shippingAddressCheckbox;
    @FindBy(id = "button-guest")
    private Button continueBillingDetailsButton;
    @FindBy(id="button-shipping-address")
    private Button continueRegisterButton;

    public void clickContinueButton(){
        continueRegisterButton.click();
    }
}
