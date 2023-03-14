package com.MyTeam.step_definetions;

import com.MyTeam.pages.LoginPage;
import com.MyTeam.pages.dashboardPage;
import com.MyTeam.utilitys.ConfigurationReader;
import com.MyTeam.utilitys.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class notes {

    LoginPage loginPage = new LoginPage();
    dashboardPage dashboardPage = new dashboardPage();


    @Given("user is already logged on dashboard")
    public void user_is_already_logged_on_dashboard() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));

    }
    @When("user click notes")
    public void user_click_notes() {


    }
    @When("user click new notes")
    public void user_click_new_notes() {

    }
    @When("user add notes {string}")
    public void user_add_notes(String string) {

    }
    @Then("user should see notes on dashboard")
    public void user_should_see_notes_on_dashboard() {

    }

}
