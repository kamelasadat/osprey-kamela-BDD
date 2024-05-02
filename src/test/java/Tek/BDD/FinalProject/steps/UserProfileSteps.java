package Tek.BDD.FinalProject.steps;

import Tek.BDD.FinalProject.Page.UserProfilePage;
import Tek.BDD.FinalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserProfileSteps extends SeleniumUtilities {
    @And("Click on profile button on top right corner")
    public void clickOnProfileButton() {
        clickOnElement(UserProfilePage.PROFILE_BUTTON);
    }

    @Then("Validate STATUS {string} USER TYPE {string} FULL NAME {string} USER NAME {string} AUTHORITIES {string}")
    public void validateFormData(String status, String userType, String fullName, String userName, String authorities) {
        String actualStatus = getElementText(UserProfilePage.STATUS);
        String actualUserType = getElementText(UserProfilePage.USER_TYPE);
        String actualFullName = getElementText(UserProfilePage.FULL_NAME);
        String actualUserName = getElementText(UserProfilePage.USER_NAME);
        String actualAuthorities = getElementText(UserProfilePage.AUTHORITIES);
        Assert.assertEquals(status,actualStatus);
        Assert.assertEquals(userType,actualUserType);
        Assert.assertEquals(fullName,actualFullName);
        Assert.assertEquals(userName,actualUserName);
        Assert.assertEquals(authorities,actualAuthorities);
    }
    @When("Click on Logout Button")
    public void clickOnLogoutButton() {
        clickOnElement(UserProfilePage.LOGOUT_BUTTON);
    }

}
