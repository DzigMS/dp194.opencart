package model;

import org.openqa.selenium.support.FindBy;

import pages.BasePage;
import pages.SearchPage;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(tagName = "header")
public class Header extends HtmlElement {
	@FindBy(name = "search")
	private TextInput searchField;
	@FindBy(xpath = "//button[@class=\"btn btn-default btn-lg\"][@type=\"button\"]")
	private Button searchButton;
	@FindBy(xpath = "span[@id=\"cart-total\"]/..")
	private Button shoppingCartButton;
}
