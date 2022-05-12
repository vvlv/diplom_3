import PO.Constructor;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ConstructorTest {
    Constructor constructor = new Constructor();

    @Test
    public void clickOnSause () {
        open(constructor.generalUrl);
        constructor.sauseDefaultClick();
        Assert.assertEquals(true,constructor.sauseNotDefaultVisible());
    }
    @Test
    public void clickOnFilling () {
        open(constructor.generalUrl);
        constructor.fillingDefaultClick();
        Assert.assertEquals(true,constructor.fillingNotDefaultVisible());
    }
    @Test
    public void clickOnBuns () {
        open(constructor.generalUrl);
        constructor.sauseDefaultClick();
        Assert.assertEquals(true,constructor.bunsNotDefaultVisible());
        constructor.bunsNotDefaultClick();
        Assert.assertEquals(true,constructor.bunsNotDefaultVisible());
    }
}
