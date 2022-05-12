package PO;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;

public class Login {
    public String generalUrl = "https://stellarburgers.nomoreparties.site";
    public String loginUrl = "https://stellarburgers.nomoreparties.site/login";
    public String loginForgotUrl ="https://stellarburgers.nomoreparties.site/forgot-password";
    public String loginRegistration = "https://stellarburgers.nomoreparties.site/register";

    //кнопка личный кабинет
private SelenideElement lkLink = $(" nav > a > p");
    //кнопка личный кабинет на главной
private SelenideElement loginOfGeneralPage = $("section.BurgerConstructor_basket__29Cd7.mt-25 > div > button");
    //Кнопка войти
    private SelenideElement btnLogin = $("a[href='/login']");

    //форма Входа Поле почта
    private SelenideElement fieldLoginName = $("form > fieldset:nth-child(1) > div  input");
    //форма Входа Поле пароль
    private SelenideElement fielRegistrationPassword = $("input[name='Пароль']");
    //кнопка login
    private SelenideElement btnRegistrationForm = $("form > button");
    //Отображение элемента Вход на странице с логином
    private SelenideElement loginForm = $("main > div > h2");
    //кнопка профиль
    private SelenideElement profileLink =$("div > nav > ul > li:nth-child(1) > a");
    private SelenideElement lkExit = $("ul > li:nth-child(3) > button");


    //Методы
    //кнопка личный кабинет на главной
    public void btnLoginOfGeneralPage() {
        loginOfGeneralPage.click();
    }
    //кнопка личный кабинет
    public void btnLkLinkForLogin() {
        lkLink.click();
    }
    //кнопка личный кабинет
    public void btnLkLink() {
        lkLink.click();
        profileLink.shouldBe(visible);
    }
    //кнопка войти
    public void btnLogin() {
        btnLogin.click();
    }
    //Сборный метод для логина
    public void userLogin (String email, String password) {
        setFieldLoginName(email);
        setFieldLoginPassword(password);
        btnRegistrationFormClick();
    }
    //кнопка login
    public void btnRegistrationFormClick() {
        btnRegistrationForm.click();
    }
    //форма Входа Поле пароль
    public void setFieldLoginPassword(String data) {
        fielRegistrationPassword.setValue(data);
    }
    //форма Входа Поле почта
    public void setFieldLoginName(String data) {
        fieldLoginName.setValue(data);
    }
    public void lkExitClick () {
        lkExit.click();
    }
    //Метод проверяет авторизированы ли мы на странице и выходит из системы если да
    public void siteExit () {
        lkLink.click();
        sleep(500);
        if (profileLink.exists())
        {
            lkExitClick();
            loginForm.shouldBe(visible);
        }else{loginForm.shouldBe(visible);}
    }
}
