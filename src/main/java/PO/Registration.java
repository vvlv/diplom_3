package PO;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Registration {
    //Ссылка на страницу логина
    public String loginUrl = "https://stellarburgers.nomoreparties.site/login";
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

    //Методы
    //кнопка решистрациии
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
