import com.codeborne.selenide.Configuration;
import org.junit.Before;

public class SetBrowser {
    @Before
    public void setBrowserForTests () {
        Configuration.startMaximized = true;
        Configuration.browser= "yandex";
    }
}
