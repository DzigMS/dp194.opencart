package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class AdminCustomerListPage {
    private static final int EMAIL_COLUMN_INDEX = 2;
    @FindBy(id = "input-username")
    private TextInput loginTextBox;

    @FindBy(id = "input-password")
    private TextInput passwordTextBox;

    @FindBy(className = "btn btn-primary")
    private Button loginButton;

    @FindBy(className = "table table-bordered table-hover")
    private Table customerTable;

    @FindBy(className = "btn btn-danger")
    private Button deleteButton;

    public AdminCustomerListPage(Driver driver) {
        PageFactory.initElements
                (new HtmlElementDecorator(new HtmlElementLocatorFactory(driver.getWebDriver())), this);
    }

    public void fillLoginTextBox(String text) {
        this.loginTextBox.sendKeys(text);
    }

    public String getLoginTextBoxText() {
        return this.loginTextBox.getText();
    }

    public void fillPasswordTextBox(String text) {
        this.passwordTextBox.sendKeys(text);
    }

    public String getPasswordTextBoxText() {
        return this.passwordTextBox.getText();
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public void markCustomerInTable(String customerEmail) {
        this.customerTable.getColumnByIndex(AdminCustomerListPage.EMAIL_COLUMN_INDEX);
    }

    public void clickDeleteButton() {
        this.deleteButton.click();
    }
}
