package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(id = "content")
public class SearchForm extends HtmlElement {
	
    @FindBy(id = "input-search")
    private TextInput searchField;
    
    @FindBy(name = "sub_category")
    private CheckBox subcatCheckbox;
    
    @FindBy(name = "description")
    private CheckBox descriptionCheckbox;
    
    @FindBy(id = "button-search") 
    private Button searchButton;

    public void fillSearchField(String keyword) {
    	searchField.sendKeys(keyword);
    }

    public String getSearchFieldText() {
        return searchField.getText();
    }
    
    public void cleanSearchField() {
    	searchField.clear();
    }
    
    public void markSubcatCheckbox() {
    	subcatCheckbox.select();
    }

    public void markDescriptionCheckbox() {
    	descriptionCheckbox.select();
    }
    
    public void clickSearchButton() {
    	searchButton.click();
    }
    
}
