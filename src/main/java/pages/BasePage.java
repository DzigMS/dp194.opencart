package pages;

import driver.Driver;
import model.CategoryMenu;
import model.Header;
import model.TopNavBar;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public abstract class BasePage {
    protected Driver driver;

    public TopNavBar topNavBar;
    public Header header;
    public CategoryMenu categoryMenu;

    public BasePage(Driver driver) {
        this.driver = driver;
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(this.driver.getWebDriver())), this);
    }

    public abstract void openPage();

}
