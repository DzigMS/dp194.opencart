package pages;

import driver.DriverSingleton;
import model.CategoryMenu;
import model.Header;
import model.TopNavBar;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected final int WAIT_TIMEOUT_SECONDS = 10;
    private String pageAddress;
    public TopNavBar topNavBar;
    public Header header;
    public CategoryMenu categoryMenu;


    protected BasePage() {

    }


    public void openPage() {
        DriverSingleton.getDriver().get(this.pageAddress);
    }

}
