package com.MyTeam.step_definetions;

import com.MyTeam.pages.LoginPage;
import com.MyTeam.utilitys.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class login {

    LoginPage loginPage = new LoginPage();

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

    @Then("user should login with  valid credentials by clicking login button")
    public void user_should_login_with_valid_credentials_by_clicking_login_button() {

        Assert.assertTrue(loginPage.header.getText().contains("Good"));
    }


    @Then("user should not be login and  see the message")
    public void userShouldNotBeLoginAndSeeTheMessage() {
        Assert.assertTrue(loginPage.wrongMessage.isDisplayed());
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


    @Then("User should see this list")
    public void User_should_see_this_list(List<String> list) {
//    List<String>slist=new ArrayList<>();
//        for (WebElement each : loginPage.list) {
//            slist.add(each.getText().trim());
//
//        }
//
//        Assert.assertEquals("no list",list,slist);
//
        for (WebElement each : loginPage.list) {
            for (String s : list) {

                System.out.println(each.getText());
                Assert.assertTrue(each.getText().contains(s));

            }
        }


    }


}
