package com.MyTeam.pages;

import com.MyTeam.utilitys.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage {

    public dashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[4]/a")
    public WebElement logOut;

    @FindBy(xpath = "//h2[contains(.,'Good afternoon')]")
    public WebElement header;

}
