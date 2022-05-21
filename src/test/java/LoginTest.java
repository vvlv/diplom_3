import pages.Login;
import pages.PersonalArea;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertTrue;

public class LoginTest {
    PersonalArea lk = new PersonalArea();
    Login login = new Login();

    @Test
    public void loginFromLoginPage() {
        open(Urls.loginUrl);
        login.siteExit();
        open(Urls.loginUrl);
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals(Urls.profileUrl,url());
        assertTrue(login.btnExitVisibleCheck());



    }
    @Test
    public void loginFromGeneralPage() {
        open(Urls.generalUrl);
        login.siteExit();
        open(Urls.generalUrl);
        login.btnLoginOfGeneralPage();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals(Urls.profileUrl,url());
        assertTrue(login.btnExitVisibleCheck());
    }
    @Test
    public void loginFromLKPage() {
        open(Urls.generalUrl);
        login.siteExit();
        open(Urls.generalUrl);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals(Urls.profileUrl,url());
        assertTrue(login.btnExitVisibleCheck());
    }
    @Test
    public void loginFromRegistrationPage() {
        open(Urls.loginRegistration);
        login.siteExit();
        open(Urls.loginRegistration);
        login.btnLkLinkForLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals(Urls.profileUrl,url());
        assertTrue(login.btnExitVisibleCheck());


    }
    @Test
    public void loginFromForgotPassPage() {
        open(Urls.generalUrl);
        login.siteExit();
        open(Urls.loginForgotUrl);
        login.btnLogin();
        login.userLogin("vvlv@vvlv.ru","vvlvvvlv");
        login.btnLkLink();
        Assert.assertEquals(Urls.profileUrl,url());
        assertTrue(login.btnExitVisibleCheck());



    }
}