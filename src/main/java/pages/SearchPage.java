package pages;

import content.SearchContent;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    private SearchContent content;

    public SearchPage() {

        content = new SearchContent();
    }

}
