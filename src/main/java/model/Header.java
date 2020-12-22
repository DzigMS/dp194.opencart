package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

	@FindBy(tagName = "header")
	public class Header extends HtmlElement{
	@FindBy(name = "search")
	private TextInput searchField;
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg'][@type='button']")
	private Button searchButton;
	@FindBy(xpath = "//*[@id='cart']/button")
	private Button shoppingCartButton;
	
	public void fillSearchField(String keyword) {
		searchField.sendKeys(keyword);
	}

	public String getSearchFieldText() { return searchField.getText(); }
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void clickShoppingCartButton() {
		shoppingCartButton.click();
	}
}
