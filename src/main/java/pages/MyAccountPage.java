package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;

public class MyAccountPage extends BasePage {
    @FindBy(linkText = "Edit your account information")
    private Link editInfoLink;

    @FindBy(linkText = "Change your password")
    private Link changePasswordLink;


    public MyAccountPage(Driver driver) {
        super(driver);
    }

    public void clickEditInfoLink() {
        this.editInfoLink.click();
    }

    public void clickChangePasswordLink() {
        this.changePasswordLink.click();
    }
}
