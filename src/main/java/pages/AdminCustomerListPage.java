package pages;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class AdminCustomerListPage {
    private static final int CHECKBOX_COLUMN_INDEX = 0;
    private static final int NAME_COLUMN_INDEX = 1;
    private static final int EMAIL_COLUMN_INDEX = 2;
    private static final int GROUP_COLUMN_INDEX = 3;
    private static final int IP_COLUMN_INDEX = 4;
    private static final int DATE_ADDED_COLUMN_INDEX = 5;

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

    public void setCheckBox(int index, boolean value) {
        WebElement checkBox = this.customerTable.getColumnByIndex(AdminCustomerListPage.CHECKBOX_COLUMN_INDEX).get(index);
        if (value) {
            if (!checkBox.isSelected()) {
                checkBox.click();
            }
        }
        else {
            if (checkBox.isSelected()) {
                checkBox.click();
            }
        }
    }
    public String getCustomerName(int index) {
        return this.customerTable.getColumnByIndex(AdminCustomerListPage.NAME_COLUMN_INDEX).get(index).getText();
    }
    public String getEmail(int index) {
        return this.customerTable.getColumnByIndex(AdminCustomerListPage.EMAIL_COLUMN_INDEX).get(index).getText();
    }
    public String getCustomerGroup(int index) {
        return this.customerTable.getColumnByIndex(AdminCustomerListPage.GROUP_COLUMN_INDEX).get(index).getText();
    }
    public String getIP(int index) {
        return this.customerTable.getColumnByIndex(AdminCustomerListPage.IP_COLUMN_INDEX).get(index).getText();
    }
    public String getDateAdded(int index) {
        return this.customerTable.getColumnByIndex(AdminCustomerListPage.DATE_ADDED_COLUMN_INDEX).get(index).getText();
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
