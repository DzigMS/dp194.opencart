package basetest;

import constants.PagesURL;
import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CommonConditionTest {
    protected Driver driver;

    @BeforeEach
    public void startTest() {
        driver = Driver.configureDriver("chrome");
        driver.openUrl(PagesURL.HOME_PAGE_URL);
    }

    @AfterEach
    public void endTest() {
        driver.quitDriver();
    }
}
