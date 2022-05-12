package PO;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Constructor {
    public String generalUrl = "https://stellarburgers.nomoreparties.site";

    private SelenideElement bunsNotDefault = $("section.BurgerIngredients_ingredients__1N8v2 > div:nth-child(2) > div:nth-child(1)");
    private SelenideElement bunsDefault =$ ("div:nth-child(2) > div.tab_tab__1SPyG.tab_tab_type_current__2BEPc.pt-4.pr-10.pb-4.pl-10.noselect");

    private SelenideElement sauseDefault = $("section.BurgerIngredients_ingredients__1N8v2 > div:nth-child(2) > div:nth-child(2)");
    private SelenideElement sauseNotDefault = $("div:nth-child(2) > div.tab_tab__1SPyG.tab_tab_type_current__2BEPc.pt-4.pr-10.pb-4.pl-10.noselect");

    private SelenideElement fillingDefault = $("section.BurgerIngredients_ingredients__1N8v2 > div:nth-child(2) > div:nth-child(3)");
    private SelenideElement fillingNotDefault = $("div:nth-child(2) > div.tab_tab__1SPyG.tab_tab_type_current__2BEPc.pt-4.pr-10.pb-4.pl-10.noselect");

    public boolean bunsNotDefaultVisible() {
        return bunsNotDefault.exists();
    }
    public boolean bunsDefaultVisible() {
        return bunsDefault.exists();
    }
    public boolean sauseNotDefaultVisible() {
        return sauseNotDefault.exists();
    }
    public boolean sauseDefaultVisible() {
        return sauseDefault.exists();
    }
    public boolean fillingDefaultVisible() {
        return fillingDefault.exists();
    }
    public boolean fillingNotDefaultVisible() {
        return fillingNotDefault.exists();
    }
    public void bunsNotDefaultClick () {
        bunsNotDefault.click();
    }
    public void bunsDefaultClick () {
        bunsDefault.click();
    }
    public void sauseDefaultClick () {
        sauseDefault.click();
    }
    public void sauseNotDefaultClick () {
        sauseNotDefault.click();
    }
    public void fillingDefaultClick () {
        fillingDefault.click();
    }
    public void fillingNotDefaultClick () {
        fillingNotDefault.click();
    }
}
