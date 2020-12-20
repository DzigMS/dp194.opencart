package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.Select;

@FindBy(xpath = "//*[@id= 'compare-total']/../../..")
public class ProductActions extends HtmlElement{
    @FindBy(id= "compare-total")
    private Link compareLink;
    @FindBy(id="input-sort")
    private Select sortBySelect;
    @FindBy(id="input-limit")
    private Select showSelect;

    public void clickCompareLink(){
        compareLink.click();
    }


    public void selectShowByValue(String value){
        showSelect.selectByValue(value);
    }

    public void selectShowByIndex(int index){
        showSelect.selectByIndex(index);
    }


    public void selectSortByValue(String value){
        sortBySelect.selectByValue(value);
    }

    public void selectSortByIndex(int index){
        sortBySelect.selectByIndex(index);
    }
}
