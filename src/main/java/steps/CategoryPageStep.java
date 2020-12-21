package steps;

import driver.Driver;
import model.ProductItem;
import pages.CategoryPage;

import java.util.ArrayList;
import java.util.List;

public class CategoryPageStep extends BaseStep{
    private CategoryPage categoryPage;

    public CategoryPageStep(Driver driver) {
        super(driver);
        this.categoryPage = new CategoryPage(this.getDriver());
    }

    public List<String> selectShowValueNameAZStep() {
        categoryPage.getProductActions().selectSortByIndex(1);
        return this.getItemNames();

    }

    public List<String> createShowValueNameAZStepResult(){
        List<String> result = new ArrayList<>();
        result.add("HTC Touch HD");
        result.add("iPhone");
        result.add("Palm Treo Pro");
        return result;
    }


    public List<String> selectShowValueNameZAStep() {
        categoryPage.getProductActions().selectSortByIndex(2);
        return this.getItemNames();

    }

    public List<String> createShowValueNameZAStepResult(){
        List<String> result = new ArrayList<>();
        result.add("Palm Treo Pro");
        result.add("iPhone");
        result.add("HTC Touch HD");
        return result;
    }

    public List<String> selectShowValueNamePriceLowHighStep() {
        categoryPage.getProductActions().selectSortByIndex(3);
        System.out.println(this.getItemNames());
        return this.getItemNames();

    }

    public List<String> createShowValuePriceLowHighStepResult(){
        List<String> result = new ArrayList<>();
        result.add("HTC Touch HD");
        result.add("iPhone");
        result.add("Palm Treo Pro");
        return result;
    }

    public List<String> selectShowValueNamePriceHighLowStep() {
        categoryPage.getProductActions().selectSortByIndex(4);
        System.out.println(this.getItemNames());
        return this.getItemNames();

    }

    public List<String> createShowValuePriceHighLowStepResult(){
        List<String> result = new ArrayList<>();
        result.add("Palm Treo Pro");
        result.add("iPhone");
        result.add("HTC Touch HD");
        return result;
    }

    public List<String> selectShowValueNameHighestRatingStep() {
        categoryPage.getProductActions().selectSortByIndex(5);
        System.out.println(this.getItemNames());
        return this.getItemNames();

    }

    public List<String> createShowValueHighestRatingResult(){
        List<String> result = new ArrayList<>();
        result.add("Palm Treo Pro");
        result.add("iPhone");
        result.add("HTC Touch HD");
        return result;
    }

    public List<String> selectShowValueNameLowestRatingStep() {
        categoryPage.getProductActions().selectSortByIndex(6);
        System.out.println(this.getItemNames());
        return this.getItemNames();

    }

    public List<String> createShowValueLowestRatingResult(){
        List<String> result = new ArrayList<>();
        result.add("Palm Treo Pro");
        result.add("iPhone");
        result.add("HTC Touch HD");
        return result;
    }

    public void clickAddToCartButton(){
        for (ProductItem item :
                this.categoryPage.getProductItemList()) {
            item.clickAddToCart();
        }
    }

    public void clickAddToCompareButton(){
        for (ProductItem item :
                this.categoryPage.getProductItemList()) {
            item.clickAddToComparePage();
        }
    }

    public List<String> getItemNames(){
        List<String> names = new ArrayList<>();
        for (ProductItem item :
                this.categoryPage.getProductItemList()) {
            names.add(item.getProductName());

        }
        return names;
    }


}
