import PO.Login;
import PO.PersonalArea;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class LoginTest {
    PersonalArea lk = new PersonalArea();
    Login login = new Login();

    @Test
    public void loginFromLoginPage() {
        open(login.loginUrl);
        login.siteExit();
        open(login.loginUrl);
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/account/profile",url());



    }
    @Test
    public void loginFromGeneralPage() {
        open(login.generalUrl);
        login.siteExit();
        open(login.generalUrl);
        login.btnLoginOfGeneralPage();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/account/profile",url());
    }
    @Test
    public void loginFromLKPage() {
        open(login.generalUrl);
        login.siteExit();
        open(login.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/account/profile",url());
    }
    @Test
    public void loginFromRegistrationPage() {
        open(login.loginRegistration);
        login.siteExit();
        open(login.loginRegistration);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/account/profile",url());

    }
    @Test
    public void loginFromForgotPassPage() {
        open(login.generalUrl);
        login.siteExit();
        open(login.loginForgotUrl);
        login.btnLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals("https://stellarburgers.nomoreparties.site/account/profile",url());



    }
}