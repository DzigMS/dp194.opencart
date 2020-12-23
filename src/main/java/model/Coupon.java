package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

@FindBy(id = "accordion")
public class Coupon extends HtmlElement {
    @FindBy(xpath = "//a[contains(text(),'Use Coupon Code ')]")
    private Select useCouponCodeLinkDropdown;
    @FindBy(id = "input-coupon")
    private TextInput couponTextInput;
    @FindBy(id = "button-coupon")
    private Button applyCouponButton;

    public void clickUseCouponCodeLinkDropdown(){
        useCouponCodeLinkDropdown.click();
    }
    public void fillCouponTextInput(String coupon){
        couponTextInput.sendKeys(coupon);
    }
    public void clickApplyCouponButton(){
        applyCouponButton.click();
    }
}
