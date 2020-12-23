package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

@FindBy(id = "menu")
public class CategoryMenu extends HtmlElement {
    @FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
    private Link phonesAndPDAs;
    @FindBy(xpath = "div[2]/ul/li[6]/a")
    private Link phoneLink;

    public void clickPhonesAndPDAsCategoryMenu(){
        phonesAndPDAs.click();
    }

    public void clickPhoneLink() {
        phoneLink.click();
    }


}
