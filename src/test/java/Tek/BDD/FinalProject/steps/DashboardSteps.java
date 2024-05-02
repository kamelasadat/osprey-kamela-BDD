package Tek.BDD.FinalProject.steps;

import Tek.BDD.FinalProject.Page.DashboardPage;
import Tek.BDD.FinalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DashboardSteps extends SeleniumUtilities {
    @Then("User navigated to Customer Service Portal")
    public void CustomerServicePortalIsDisplayed()  {
        String actualTitle = getElementText(DashboardPage.CustomerServicePortal);
        Assert.assertEquals(actualTitle,"Customer Service Portal","Customer Service Portal");

    }
    @And("Click on Plans Button")
    public void clickOnPlansButton() throws InterruptedException {
        clickOnElement(DashboardPage.Plans);
        Thread.sleep(3000);
    }
    @And("Click on Accounts Button")
    public void clickOnAccountsButton() throws InterruptedException {
        clickOnElement(DashboardPage.AccountsButton);
        Thread.sleep(3000);
    }
    @And("Click on profile button on top right corner")
    public void clickOnProfileButton() throws InterruptedException {
        clickOnElement(DashboardPage.PROFILE_BUTTON);
        Thread.sleep(3000);
    }
}
