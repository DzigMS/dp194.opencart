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
    private static final int CHECKBOX_COLUMN_INDEX = 0;
    private static final int EMAIL_COLUMN_INDEX = 2;

    @FindBy(xpath = "//table[@class = 'table table-bordered table-hover'")
    private Table customerTable;

    @FindBy(xpath = "//input[@type = 'text' and @name = 'filter_email' and @id = 'input-email']")
    private TextInput emailTextBox;
    @FindBy(xpath = "//button[@type = 'button' and @id = 'button-filter' and @class = 'btn btn-default']")
    private Button filterButton;

    @FindBy(xpath = "//button[@type = 'button' and @class = 'btn btn-danger']")
    private Button deleteButton;

    public AdminCustomerListPage(Driver driver) {
        PageFactory.initElements
                (new HtmlElementDecorator(new HtmlElementLocatorFactory(driver.getWebDriver())), this);
    }

    public void fillEmailTextBox(String text) {
        this.emailTextBox.sendKeys(text);
    }
    public void clearEmailTextBox() {
        this.emailTextBox.clear();
    }
    public String getEmailTextBoxText() {
        return this.emailTextBox.getText();
    }

    public void clickFilterButton() {
        this.filterButton.click();
    }

    public void clickDeleteButton() {
        this.deleteButton.click();
    }
}
