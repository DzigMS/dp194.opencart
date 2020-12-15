package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private WebDriver driver;

    private Driver(WebDriver driver) {
        this.driver = driver;
    }

    public static Driver configureDriver(String nameDriver) {
        WebDriver driver;
        switch (nameDriver.toLowerCase()) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
        return new Driver(driver);
    }

    public void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public void openUrl(String url) {
        driver.get(url);
    }
}
