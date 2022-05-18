package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Constructor {

    private SelenideElement bunsNotDefault = $(byText("Булки"));
    private SelenideElement fillingDefault = $(byText("Начинки"));
    private SelenideElement sauseDefault = $(byText("Соусы"));


    private ElementsCollection ingridientName = $$(".BurgerIngredients_ingredients__menuContainer__Xu3Mo h2");
private SelenideElement elem;
    public boolean getIngridientNameMenu(int i) {
        //Доступно 3 элемента 1-булки 2-соусы 3-начинки
         elem = ingridientName.get(i);
        return elem.isDisplayed();
    }
    public void bunsNotDefaultClick() {
        bunsNotDefault.click();
    }

    public void sauseDefaultClick() {
        sauseDefault.click();
    }

    public void fillingDefaultClick() {
        fillingDefault.click();
    }
}
