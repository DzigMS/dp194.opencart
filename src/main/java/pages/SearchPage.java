package pages;
import model.ProductActions;
import model.ProductItem;
import model.SearchForm;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import java.util.List;
import org.openqa.selenium.support.FindBy;
import driver.Driver;

public class SearchPage extends BasePage {
	private SearchForm searchForm;
    private ProductActions productActions;
    private List<ProductItem> productItems; 
    @FindBy(xpath = "//p[text()='There is no product that matches the search criteria.']")
	private TextBlock emptySearchText;
    
    public SearchPage(Driver driver) {
		super(driver);
	}

    public SearchForm getSearchForm() {
    	return this.searchForm;
    }
    public ProductActions getProductActions() {
    	return this.productActions;
    }
    
    public List<ProductItem> getProductItems() {
    	return this.productItems;
    }
    
	public TextBlock getEmptySearchText() {
		return this.emptySearchText;
	}

	
}
