package test;

import driver.DriverInstance;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GeneralConditions {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverInstance.getDriver();
    }

    @AfterMethod
    public void closeBrowser (){
        DriverInstance.closeDriver();
    }

}
