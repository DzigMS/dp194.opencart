package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import driver.Driver;
import model.ProductItem;
import pages.SearchPage;

public class SearchPageStep extends BaseStep {
	private SearchPage searchPage;
	
	public SearchPageStep(Driver driver) {
		super(driver);
		this.searchPage = new SearchPage(this.getDriver());
	}
	
    public SearchPageStep fillSearchField(String keyword) {
    	searchPage.getSearchForm().fillSearchField(keyword);
    	String actual = searchPage.getSearchForm().getSearchFieldText();
		assertEquals(keyword, actual);
    	return this;
    }
	
    public SearchPageStep markSubcatCheckbox() {
    	searchPage.getSearchForm().markSubcatCheckbox();
    	return this;
    }

    public SearchPageStep markDescriptionCheckbox() {
    	searchPage.getSearchForm().markDescriptionCheckbox();
    	return this;
    }
    
    public SearchPageStep clickSearchButton() {
    	searchPage.getSearchForm().clickSearchButton();
    	this.searchPage = new SearchPage(this.getDriver());
    	return this; 
    }
    
    public SearchPageStep selectShowValue(int index) {
    	searchPage.getProductActions().selectShowByIndex(index);
    	return this; 
    } 
    
    public SearchPageStep verifyQuantity(int maxValue) {
    	assert(searchPage.getProductItems().size() <= maxValue);
    	return this;
    }
    
    private List<String> getProductNames() {
    	List<String> names = new ArrayList<String>();
    	for (ProductItem item : searchPage.getProductItems()) {
    		names.add(item.getProductName());
    	}
    	return names; 
    }
    
    public SearchPageStep verifySearchResults(String expectedName) {
    	expectedName = expectedName.toLowerCase();
    	List<String> names = this.getProductNames();
    	for (String name : names) {
    		assert(name.toLowerCase().contains(expectedName));
    	}
    	return this; 
    }
    
	public SearchPageStep verifyIsEmptySearch(boolean expected) {
		boolean actual = searchPage.getEmptySearchText().exists();
		assertEquals(expected, actual);
		return this;
	}
}
