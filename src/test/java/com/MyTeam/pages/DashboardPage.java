package com.MyTeam.pages;

import com.MyTeam.utilitys.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[4]/a")
    public WebElement logOut;

    @FindBy(xpath = "//h2[contains(.,'Good afternoon')]")
    public WebElement header;
@FindBy(xpath = "//div[@id='settings']//nav//li")
    public List<WebElement> list;

    @FindBy(css = "img[width='32']")
    public WebElement image;
}
