package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Driver {
    private WebDriver driver;

    private Driver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }

    public static Driver configureDriver(String nameDriver) {
        MutableCapabilities capabilities = new MutableCapabilities();
        capabilities.setCapability("acceptInsecureCerts", true);

        WebDriver driver;
        switch (nameDriver.toLowerCase()) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(new FirefoxOptions().merge(capabilities));
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(new EdgeOptions().merge(capabilities));
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver(new OperaOptions().merge(capabilities));
                break;
            case "chrome":
            default:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--no-sandbox");
                options.addArguments("--headless");
                options.addArguments("--window-size=1920,1080");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options.merge(capabilities));
        }
        return new Driver(driver);
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void openUrl(String url) {
        if (driver != null) {
            driver.get(url);
        }
    }

    public String getLinkUrl() {
        return driver.getCurrentUrl();
    }
}
