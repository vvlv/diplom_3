import com.codeborne.selenide.Configuration;
import pages.Registration;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;

public class RegistrationTest {
    Registration registration = new Registration();
    Faker faker = new Faker();
    @Test
    public void sucsesRegistration () {

        open(Urls.loginUrl);
        registration.btnRegistrationClick();
        registration.setFieldRegistrationName(faker.name().firstName());
        registration.setFieldRegistrationEmail(faker.internet().emailAddress());
        registration.setFieldRegistrationPassword(faker.internet().password());
        registration.btnRegistrationFormClick();
        registration.logInH2VisibleCheck();
        Assert.assertEquals(Urls.loginUrl,url());
    }
    @Test
    public void passwordRegistrationError () {
        open(Urls.loginUrl);
        registration.btnRegistrationClick();
        registration.setFieldRegistrationName(faker.name().firstName());
        registration.setFieldRegistrationPassword("12345");
        registration.setFieldRegistrationEmail(faker.internet().emailAddress());
        Assert.assertEquals("Некорректный пароль",registration.fieldRegistrationPassword());
    }
    @Test
    public void sucsesRegistrationCorrectPassword () {
        open(Urls.loginUrl);
        registration.btnRegistrationClick();
        registration.setFieldRegistrationPassword(faker.internet().password(6,7));
        registration.setFieldRegistrationName(faker.name().firstName());
        registration.setFieldRegistrationEmail(faker.internet().emailAddress());
        registration.btnRegistrationFormClick();
        sleep(500);
        Assert.assertEquals(Urls.loginUrl,url());
    }

}
