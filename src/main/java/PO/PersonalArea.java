package PO;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PersonalArea {
    public String generalUrl = "https://stellarburgers.nomoreparties.site";


    private SelenideElement constructorLinkInLK =$("ul > li:nth-child(1) > a");
    private SelenideElement burgerIcon= $("div > a > svg");
    private SelenideElement lkExit = $("ul > li:nth-child(3) > button");
    public void lkExitClick () {
        lkExit.click();
    }
    public void constructorLinkInLKClick () {
        constructorLinkInLK.click();
    }
    public void burgerIconClick () {
        burgerIcon.click();
    }
}
