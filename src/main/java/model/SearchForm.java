package model;

import org.openqa.selenium.support.FindBy;

import driver.Driver;
import pages.SearchPage;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Search form")
@FindBy(id = "content")
public class SearchForm extends HtmlElement {
	
    @Name("Search request input")
    @FindBy(id = "input-search")
    private TextInput searchField;
    
    @Name("Search in subcategories checkbox")
    @FindBy(name = "sub_category")
    private CheckBox subcatCheckbox;
    
    @Name("Search in product descriptions checkbox")
    @FindBy(name = "description")
    private CheckBox descriptionCheckbox;
    
    @Name("Search button")
    @FindBy(id = "button-search") 
    private Button searchButton;

    public void fillSearchField(String keyword) {
    	searchField.sendKeys(keyword);
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
