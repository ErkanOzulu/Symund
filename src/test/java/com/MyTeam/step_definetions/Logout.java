package com.MyTeam.step_definetions;

import com.MyTeam.pages.DashboardPage;
import com.MyTeam.pages.LoginPage;
import com.MyTeam.utilitys.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {

DashboardPage dashboardPage=new DashboardPage();
LoginPage loginPage=new LoginPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    @When("user click E module")
    public void user_click_e_module() {
       dashboardPage.image.click();
    }
    @When("user click the Log out button")
    public void user_click_the_log_out_button() {
       dashboardPage.logOut.click();
    }
    @Then("user should lands login page")
    public void user_lands_login_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Symund"));
    }

    @And("user click step back button")
    public void userClickStepBackButton() throws InterruptedException {
      wait.until(ExpectedConditions.visibilityOf(loginPage.inputPassword));
        Driver.getDriver().navigate().back();

    }

    @Then("user should not on home page")
    public void userShouldNotGoToHomePageAgain() {
        Assert.assertFalse(Driver.getDriver().getTitle().equals("home page"));
    }
}
