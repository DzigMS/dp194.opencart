package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private WebDriver driver;

    private Driver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return this.driver;
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return new Driver(driver);
    }

    public void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public void openUrl(String url) {
        if (driver != null) {
            driver.get(url);
        }
    }
}
