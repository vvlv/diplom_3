package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Login {

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
    private SelenideElement btnExit = $(byText("Вход"));

    //Методы
    //кнопка решистрациии
    public boolean btnExitVisibleCheck () {
        btnExit.shouldBe(Condition.visible, Duration.ofSeconds(10));
        return btnExit.isDisplayed();
    }

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
        if (profileLink.isDisplayed()) {
            lkExitClick();
        }
        loginForm.shouldBe(visible);
    }
}
