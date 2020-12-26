package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class AdminCustomerListPage {
    private static final int EMAIL_COLUMN_INDEX = 2;
    private int currentPage;
    private int lastPage;

    @FindBy(className = "table table-bordered table-hover")
    private Table customerTable;

    @FindBy(xpath = "//button[@type = 'button' and @class = 'btn btn-danger']")
    private Button deleteButton;

    public AdminCustomerListPage(Driver driver) {
        PageFactory.initElements
                (new HtmlElementDecorator(new HtmlElementLocatorFactory(driver.getWebDriver())), this);
    }

    public void markCustomerInTable(String customerEmail) {
        this.customerTable.getColumnByIndex(AdminCustomerListPage.EMAIL_COLUMN_INDEX);
    }

    public void clickDeleteButton() {
        this.deleteButton.click();
    }
}
