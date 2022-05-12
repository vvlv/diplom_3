import PO.Login;
import PO.PersonalArea;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;

public class PersonalAreaTest {
    PersonalArea lk = new PersonalArea();
Login login = new Login();

    @Test
    public void jumpToLK () {
        open(login.generalUrl);
        login.siteExit();
        open(login.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/account/profile",url());

    }
    @Test
    public void jumpToConstructorFromLk () {
        open(login.generalUrl);
        login.siteExit();
        open(login.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        lk.constructorLinkInLKClick();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/",url());


    }
    @Test
    public void jumpToConstructorFromLkOfBurgerIcon () {
        open(login.generalUrl);
        login.siteExit();
        open(login.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        lk.burgerIconClick();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/",url());

    }
    @Test
    public void exitFromLk () {
        open(login.generalUrl);
        login.siteExit();
        open(login.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLinkForLogin();
        lk.lkExitClick();
        login.btnLkLinkForLogin();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/login",url());
    }
}
