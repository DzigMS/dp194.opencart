package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import driver.Driver;
import model.ProductItem;
import pages.SearchPage;

public class SearchPageStep {
	private Driver driver;
	private SearchPage searchPage;
	
	public SearchPageStep(Driver driver) {
		this.driver = driver;
		this.searchPage = new SearchPage(driver);
	}
	
    public SearchPageStep fillSearchField(String keyword) {
    	searchPage.getSearchForm().fillSearchField(keyword);
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
    	this.searchPage = new SearchPage(driver);
    	return this; 
    }
    
    public SearchPageStep selectShowValue(int index) {
    	searchPage.getProductActions().selectShowByIndex(index);
    	return this; 
    } 
    
    public SearchPageStep verifyQuantity(int maxValue) {
    	boolean expected = true;
    	boolean actual = (searchPage.getProductItems().size() <= maxValue);
    	assertEquals(expected, actual);
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
    	boolean expected = true;
    	boolean actual;
    	expectedName = expectedName.toLowerCase();
    	List<String> names = this.getProductNames();
    	for (String name : names) {
    		actual = name.toLowerCase().contains(expectedName);
    		assertEquals(expected, actual);
    	}
    	return this; 
    }
    
	public SearchPageStep verifyIsEmptySearch(boolean expected) {
		boolean actual = searchPage.getEmptySearchText().exists();
		assertEquals(expected, actual);
		return this;
	}
}
