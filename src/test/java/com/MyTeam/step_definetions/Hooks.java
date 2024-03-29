package com.MyTeam.step_definetions;

import com.MyTeam.utilitys.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void teardown(Scenario scenario){

        if (scenario.isFailed()){

            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenShot,"image/png",scenario.getName());
        }

        Driver.closeDriver();


    }
}
