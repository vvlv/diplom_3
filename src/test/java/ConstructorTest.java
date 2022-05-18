import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.WebDriverRunner;
import freemarker.core.Environment;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Constructor;
import org.junit.Assert;
import org.junit.Test;
import pages.Urls;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class ConstructorTest {
    Constructor constructor = new Constructor();
    ChromeDriver driver;
    @Before
    public void setBrowserForTests () {

System.setProperty("selenide.browser","/Users/sergejvavilov/yandexdriver/yandexdriver");
driver = new ChromeDriver();
setWebDriver(driver);
    }
    @Test
    public void scrollToSouseTest() {
        open(Urls.generalUrl);
        constructor.sauseDefaultClick();
        Assert.assertEquals(true, constructor.getIngridientNameMenu(1));
    }

    @Test
    public void scrollToFillingTest() {
        open(Urls.generalUrl);
        constructor.fillingDefaultClick();
        Assert.assertEquals(true, constructor.getIngridientNameMenu(2));
    }

    @Test
    public void scrollToBunsTest() {
        open(Urls.generalUrl);
        constructor.fillingDefaultClick();
        constructor.bunsNotDefaultClick();
        Assert.assertEquals(true, constructor.getIngridientNameMenu(0));

    }
}
