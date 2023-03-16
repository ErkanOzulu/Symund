package com.MyTeam.step_definetions;

import com.MyTeam.pages.DashboardPage;
import com.MyTeam.utilitys.ConfigurationReader;
import com.MyTeam.utilitys.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logout {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is logged in and on the dashboard page")
    public void user_is_logged_in_and_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("symund.url"));
        dashboardPage.login();

    }

    @When("click the account name dropdown in the top right corner")
    public void click_the_account_name_dropdown_in_the_top_right_corner() {
        dashboardPage.accountSetting.click();
    }

    @When("check the Log out button in the dropdown")
    public void check_the_Log_out_button_in_the_dropdown() {
        dashboardPage.logOutButton.isDisplayed();
    }

    @When("click Log out button")
    public void click_Log_out_button() {
        dashboardPage.logOutButton.click();
    }

    @Then("user should be able to logout and ends up on the login page")
    public void user_should_be_able_to_logout_and_ends_up_on_the_login_page() {

        Assert.assertTrue(Driver.getDriver().getTitle().equals("Symund - QA"));

    }


    @Given("user is logged out")
    public void user_is_logged_out() {
      dashboardPage.LogOut();
    }

    @When("Click the step back button in the top left corner")
    public void click_the_step_back_button_in_the_top_left_corner() {

        Driver.getDriver().navigate().back();
    }

    @Then("Verify that user shouldn't be able to go to the home page  again")
    public void verify_that_user_shouldn_t_be_able_to_go_to_the_home_page_again() {

        Assert.assertTrue(Driver.getDriver().getTitle().equals("Symund - QA"));

    }
}
