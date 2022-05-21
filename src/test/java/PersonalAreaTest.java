import pages.Login;
import pages.PersonalArea;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class PersonalAreaTest {
    PersonalArea lk = new PersonalArea();
Login login = new Login();

    @Test
    public void jumpToLK () {
        open(Urls.generalUrl);
        login.siteExit();
        open(Urls.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals(Urls.profileUrl,url());

    }
    @Test
    public void jumpToConstructorFromLk () {
        open(Urls.generalUrl);
        login.siteExit();
        open(Urls.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        lk.constructorLinkInLKClick();
        Assert.assertEquals(Urls.generalUrl,url());


    }
    @Test
    public void jumpToConstructorFromLkOfBurgerIcon () {
        open(Urls.generalUrl);
        login.siteExit();
        open(Urls.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        lk.burgerIconClick();
        Assert.assertEquals(Urls.generalUrl,url());

    }
    @Test
    public void exitFromLk () {
        open(Urls.generalUrl);
        login.siteExit();
        open(Urls.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLinkForLogin();
        lk.lkExitClick();
        login.btnLkLinkForLogin();
        Assert.assertEquals(Urls.loginUrl,url());
    }
}
