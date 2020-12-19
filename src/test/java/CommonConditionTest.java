import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CommonConditionTest {
    protected Driver driver;

    private static final String BASE_URL = "http://34.121.117.87/htc-touch-hd";

    @BeforeEach
    public void startTest() {
        driver = Driver.configureDriver("chrome");
        driver.openUrl(BASE_URL);

    }

    @AfterEach
    public void endTest() {
        driver.closeDriver();
    }

}
