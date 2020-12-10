package page;

import content.SearchContent;
import org.openqa.selenium.WebDriver;

public class SearchPage extends AbstractBasePage {
    private SearchContent content;

    public SearchPage(WebDriver driver) {
        super(driver);
        content = new SearchContent();
    }

}
