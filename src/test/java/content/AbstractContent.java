package content;

import driver.DriverSingleton;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractContent {
    public AbstractContent() {
        PageFactory.initElements(DriverSingleton.getDriver(), this);
    }
}
