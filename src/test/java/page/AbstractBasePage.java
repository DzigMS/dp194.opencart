package page;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class AbstractBasePage {
    protected WebDriver driver;
    private String pageAddress;
    protected final int WAIT_TIMEOUT_SECONDS = 10;
    public TopNavBar topNavBar;
    public Header header;
    public CategoryMenu categoryMenu;


    protected AbstractBasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void openPage() {
        DriverSingleton.driver.get(this.pageAddress);
    }

}
