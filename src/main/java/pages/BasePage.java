package pages;

import driver.Driver;
import model.CategoryMenu;
import model.Header;
import model.TopNavBar;

public abstract class BasePage extends AbstractPage {
    private TopNavBar topNavBar;
    private Header header;
    private CategoryMenu categoryMenu;

    public BasePage(Driver driver) {
        super(driver);
    }

    public TopNavBar getTopNavBar() {
        return this.topNavBar;
    }

    public Header getHeader() {
        return this.header;
    }

    public CategoryMenu getCategoryMenu() {
        return this.categoryMenu;
    }

}
