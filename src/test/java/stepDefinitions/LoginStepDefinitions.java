package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import setup.BrowserSetup;

public class LoginStepDefinitions extends BrowserSetup {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    @Given("user visits the websites")
    public void user_visits_the_websites() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("standard_user", "secret_sauce");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @Then("user can browse the website")
    public void user_can_browse_the_website() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.verifyLoginRedirectsToDashboardPage();
    }
}