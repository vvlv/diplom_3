import pages.Constructor;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class ConstructorTest {
    Constructor constructor = new Constructor();


    @Test
    public void scrollToSouseTest() {
        open(Urls.generalUrl);
        constructor.sauseDefaultClick();
        Assert.assertTrue( constructor.getIngridientNameMenu(1));
    }

    @Test
    public void scrollToFillingTest() {
        open(Urls.generalUrl);
        constructor.fillingDefaultClick();
        Assert.assertTrue( constructor.getIngridientNameMenu(2));
    }

    @Test
    public void scrollToBunsTest() {
        open(Urls.generalUrl);
        constructor.fillingDefaultClick();
        constructor.bunsNotDefaultClick();
        Assert.assertTrue(constructor.getIngridientNameMenu(0));

    }
}
