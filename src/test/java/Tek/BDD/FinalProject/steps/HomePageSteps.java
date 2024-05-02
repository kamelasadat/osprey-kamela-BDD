package Tek.BDD.FinalProject.steps;

import Tek.BDD.FinalProject.Page.HomePage;
import Tek.BDD.FinalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps extends SeleniumUtilities {

    @When("navigate to the home page and validate that the title {string}")
    public void validateTitle(String expectedTitle) {
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("Validate create Primary Account Button is exist")
    public void validateHomeCreatePrimaryAccount() {
        String actualTitle = getElementText(HomePage.CreatePrimaryAccountButton);
        Assert.assertEquals("Create Primary Account", actualTitle);
    }

    @Given("Click on Create Primary Account Button")
    public void clickOnCreatePrimaryAccount() {
        clickOnElement(HomePage.CreatePrimaryAccountButton);
    }

    @Given("Click on Login Button")
    public void clickOnLogin() {
        clickOnElement(HomePage.LoginButtonInHomePage);
    }



    }


