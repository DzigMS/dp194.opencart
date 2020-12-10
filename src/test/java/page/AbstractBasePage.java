package page;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class AbstractBasePage {
    private String pageAddress;
    protected final int WAIT_TIMEOUT_SECONDS = 10;
    public TopNavBar topNavBar;
    public Header header;
    public CategoryMenu categoryMenu;


    protected AbstractBasePage(WebDriver driver) {
    }

    public AbstractBasePage() {

    }
    abstract AbstractBasePage

//    public void openPage() {
//        DriverSingleton.driver.get(this.pageAddress);
//    }

}
