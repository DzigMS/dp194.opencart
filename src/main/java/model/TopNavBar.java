package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

import java.util.ArrayList;

@FindBy(id = "top")
public class TopNavBar extends HtmlElement {

    //TODO add @FindBy to each fields class
    private Link contactUsLink;
    private Link accountLink;
    private Link myAccountLinks;
    private ArrayList<Link> myAccountLinksIsUnLogged;
    private ArrayList<Link> myAccountLinksIsLogged;
    private Link wishListLink;
    private Link shoppingCart;
    private Link checkout;
}
