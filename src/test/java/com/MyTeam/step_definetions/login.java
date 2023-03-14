package com.MyTeam.step_definetions;

import com.MyTeam.pages.DashboardPage;
import com.MyTeam.pages.LoginPage;
import com.MyTeam.utilitys.BrowserUtils;
import com.MyTeam.utilitys.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class login {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get("https://qa.symund.com/");
    }

    @When("Enter valid username {string} in username field")
    public void enter_valid_username_in_username_field(String userName) {
        loginPage.inputUsername.sendKeys(userName);

    }

    @When("Enter valid password {string} in password field")
    public void enter_valid_password_in_password_field(String password) {
        loginPage.inputPassword.sendKeys(password);

    }

    @When("Click on the login button")
    public void click_on_the_login_button() {
        loginPage.logInButton.click();
    }

    @Then("Verify that user can login")
    public void Verify_that_user_can_login() {

        Assert.assertTrue(dashboardPage.accountSetting.isDisplayed());
    }


    @Then("user should not be login and  see the message {string}")
    public void userShouldNotBeLoginAndSeeTheMessage(String message) {
      //  Assert.assertTrue(loginPage.wrongMessage.getText().contains(message));
        Assert.assertEquals(message,loginPage.wrongMessage.getText());
    }

    @And("Enter referred credentials {string} {string}")
    public void enterReferredCredentials(String username, String password) {

        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);

    }

    @And("Enter valid username in username field and password in password field")
    public void enterValidUsernameInUsernameFieldAndPasswordInPasswordField(Map<String, String> credentials) {
        loginPage.inputUsername.sendKeys(credentials.get("username"));
        loginPage.inputPassword.sendKeys(credentials.get("password"));
    }


    @And("hit enter key word")
    public void hitEnterKeyWord() {
        loginPage.inputPassword.sendKeys(Keys.ENTER);
    }


    @Then("user should not be login and  see the pop-up message {string}")
    public void userShouldNotBeLoginAndSeeThePopUpMessage(String popupMessage) {
        Alert alert=Driver.getDriver().switchTo().alert();
        System.out.println(alert.getText());
        Assert.assertEquals(popupMessage,alert.getText());


    }
}
