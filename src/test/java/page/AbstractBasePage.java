package page;

import org.openqa.selenium.WebDriver;

public abstract class AbstractBasePage {
    private final WebDriver driver;
    public TopNavBar topNavBar;
    public Header header;
    public CategoryMenu categoryMenu;
    public Footer footer;



    abstract AbstractBasePage openPage();

    protected final int WAIT_TIMEOUT_SECONDS = 10;

    protected AbstractBasePage(WebDriver driver) {
        this.driver = driver;
    }
}
