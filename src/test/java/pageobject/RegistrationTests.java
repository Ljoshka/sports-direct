package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.HomePage;
import pageobject.pages.LoginPage;
import pageobject.pages.RegistrationPage;

public class RegistrationTests {
    @Test
    public void registrationFormCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("https://www.sportsdirect.lv/");

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.openLoginPage();

        LoginPage loginPage = new LoginPage(baseFunc);
        loginPage.openRegistrationPage();

        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
        registrationPage.fillInRegistrationForm("Alex", "Kos", "qwerty@qwerty.com");
    }
}
