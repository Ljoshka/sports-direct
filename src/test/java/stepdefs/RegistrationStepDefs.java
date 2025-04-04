package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.BaseFunc;
import pageobject.pages.HomePage;
import pageobject.pages.LoginPage;

public class RegistrationStepDefs {
    private BaseFunc baseFunc;
    private HomePage homePage;
    private LoginPage loginPage;

    @Given("user name: {string}")
    public void setUserName(String firstName) {

    }

    @Given("user last name: {string}")
    public void setLastName (String lastName) {

    }

    @Given("user email: {string}")
    public void setEmail(String email) {

    }

    @Given("new password is {string}")
    public void setPassword(String password) {

    }

    @When("we are open browser window")
    public void openBrowserWindow() {
        baseFunc = new BaseFunc();
    }

    @When("we open home page")
    public void openHomePage() {
        baseFunc.openURL("sportsdirect.lv");
        homePage = new HomePage(baseFunc);
    }

    @When("we accept cookies")
    public void acceptCookies() {
        homePage.acceptCookies();
    }

    @When("we are pressing Registration - Login button")
    public void openLoginPage() {
        homePage.openLoginPage();
        loginPage = new LoginPage(baseFunc);
    }

    @When("we are open registration form")
    public void openRegistrationPage() {
        loginPage.openRegistrationPage();
    }
}
