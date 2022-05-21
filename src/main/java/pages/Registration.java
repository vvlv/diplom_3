package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Registration {
    //Элемент кнопки "Зарегистироваться"
    private SelenideElement btnRegistration = $("div a[href='/register']");
    //форма регистрации Поле имя
    private SelenideElement fieldRegistrationName = $("form > fieldset:nth-child(1) > div  input");
    //форма регистрации Поле email
    private SelenideElement fieldRegistrationEmail = $("form > fieldset:nth-child(2) > div  input");
    //Форма регистрации поле Пароль
    private SelenideElement fielRegistrationPassword = $("input[name='Пароль']");
    //Ошибка При указании некорректного пароля
    private SelenideElement passwordTextError = $("p[class='input__error text_type_main-default']");
    //кнопка решистрациии
    private SelenideElement btnRegistrationForm = $("form > button");
    //Заголовок  ВХОД на странице логина
    private SelenideElement logInH2 = $(byText("Вход"));

    //Методы
    //кнопка решистрациии
    public void logInH2VisibleCheck () {
        logInH2.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void btnRegistrationFormClick() {
        btnRegistrationForm.click();


    }
    //Ошибка При указании некорректного пароля
    public String fieldRegistrationPassword() {
      return   passwordTextError.getText(); //При вводе короткого выдаст ошибку "Некорректный пароль"
    }
    //форма регистрации Поле Пароль
    public void setFieldRegistrationPassword(String data) {
        fielRegistrationPassword.setValue(data);
    }
    //форма регистрации Поле email
    public void setFieldRegistrationEmail(String data) {
        fieldRegistrationEmail.setValue(data);
    }
    //форма регистрации Поле имя
    public void setFieldRegistrationName(String data) {
        fieldRegistrationName.setValue(data);
    }
    //Регистрация кнопка
    public void btnRegistrationClick() {
        btnRegistration.click();
    }

}
