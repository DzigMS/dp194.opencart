package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.element.TextInput;

import java.util.List;

public class AdminCustomerListPage extends AbstractPage {
    private static final int CHECKBOX_INDEX = 0;
    public enum TableTextValue
    {
        NAME_INDEX(1),
        EMAIL_INDEX(2),
        GROUP_INDEX(3),
        IP_INDEX(4),
        DATE_ADDED_INDEX(5);

        private int index;

        TableTextValue(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }

    private static final String EMPTY_TABLE_ELEMENT_XPATH = "//td[@class = 'text-center'][text() = 'No results!']";

    @FindBy(xpath = "//table[@class = 'table table-bordered table-hover']")
    private Table customerTable;

    @FindBy(xpath = "//input[@type = 'text' and @name = 'filter_email' and @id = 'input-email']")
    private TextInput emailTextBox;
    @FindBy(xpath = "//button[@type = 'button' and @id = 'button-filter' and @class = 'btn btn-default']")
    private Button filterButton;

    @FindBy(xpath = "//button[@type = 'button' and @class = 'btn btn-danger']")
    private Button deleteButton;

    @FindBy(xpath = "//ul[@class = 'nav navbar-nav navbar-right']/li[2]/a")
    private Button logoutButton;

    public AdminCustomerListPage(Driver driver) {
        super(driver);
    }

    public void setCheckBox(int index, boolean value) {
        WebElement checkBox = this.customerTable.getColumns().get(AdminCustomerListPage.CHECKBOX_INDEX).get(index);
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
    public boolean getCheckBoxValue(int index) {
        return this.customerTable.getColumnByIndex(AdminCustomerListPage.CHECKBOX_INDEX).get(index).isSelected();
    }

    protected int getIndexOfTableValue(int value, String text) {
        List<String> column = this.customerTable.getColumnsAsString().get(value);
        int index = column.size() - 1;

        while((index >= 0) && (!column.get(index).equals(text))) {
            index--;
        }

        return index;
    }

    public int getTableValueIndex(TableTextValue tableValue, String value) {
        return this.getIndexOfTableValue(tableValue.getIndex(), value);
    }
    public String getTableValue(TableTextValue tableValue, int index) {
        return this.customerTable.getColumnsAsString().get(tableValue.getIndex()).get(index);
    }

    public boolean isTableEmpty() {
        try {
            this.customerTable.findElement(By.xpath(AdminCustomerListPage.EMPTY_TABLE_ELEMENT_XPATH));
            return true;
        }
        catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void sendKeysEmailTextBox(CharSequence... keysToSend) {
        this.emailTextBox.sendKeys(keysToSend);
    }
    public void clearEmailTextBox() {
        this.emailTextBox.clear();
    }
    public void fillEmailTextBox(String text) {
        this.clearEmailTextBox();
        this.sendKeysEmailTextBox(text);
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

    public void clickLogoutButton() {
        this.logoutButton.click();
    }
}
