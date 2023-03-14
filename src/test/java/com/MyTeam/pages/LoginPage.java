package com.MyTeam.pages;

import com.MyTeam.utilitys.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends dashboardPage{

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;
    @FindBy(id="submit-form")
    public WebElement logInButton;
    @FindBy(id="lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(id="reset-password-submit")
    public WebElement resetButton;

    @FindBy(xpath = "//*[@id=\"body-login\"]/div[1]/div/main/div/div/form/fieldset/p[3]")
    public WebElement wrongMessage;

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        logInButton.click();
    }


    @FindBy(xpath = "//nav[@id='expanddiv']/ul//a")
    public List<WebElement>list;







}
