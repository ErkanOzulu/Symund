package com.MyTeam.pages;

import com.MyTeam.utilitys.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class notesPages extends LoginPage{

    public notesPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
