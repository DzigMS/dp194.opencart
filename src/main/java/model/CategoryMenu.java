package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

@FindBy(id = "menu")
public class CategoryMenu extends HtmlElement {
    @FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
    private Link phonesAndPDAs;

    public void clickPhonesAndPDAsCategoryMenu(){
        phonesAndPDAs.click();
    }

}
