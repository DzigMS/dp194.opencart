package content;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchContent extends AbstractContent {
    @FindBy(name = "q")
    private WebElement searchTextBox;

    public void sendKeys(CharSequence... args) {
        this.searchTextBox.sendKeys(args);
    }
}

