package Tek.BDD.FinalProject.steps;

import Tek.BDD.FinalProject.utility.SeleniumUtilities;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class HookSteps extends SeleniumUtilities {
    @Before
    public void initiateTest() {
        openBrowser();
    }


    @After
    public void closingTest(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot screenshot = (TakesScreenshot) getDriver();
            byte[] capture = screenshot.getScreenshotAs(OutputType.BYTES);

            scenario.attach(capture, "image/png", "screenshot");
        }

        getDriver().quit();
    }
}
