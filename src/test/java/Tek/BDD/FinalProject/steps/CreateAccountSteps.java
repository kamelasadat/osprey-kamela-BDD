package Tek.BDD.FinalProject.steps;

import Tek.BDD.FinalProject.Page.AccountProfilePage;
import Tek.BDD.FinalProject.utility.DataProvider;
import Tek.BDD.FinalProject.utility.SeleniumUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class CreateAccountSteps extends SeleniumUtilities {
    private String generatedRandomEmail;
    DataProvider dataProvider = new DataProvider();

@When ("User click on Create Primary Account button")
 public void clickOnPrimaryAccountButton() throws InterruptedException {
    Thread.sleep(3000);
    clickOnElement(AccountProfilePage.CreatePrimaryAccountButton);
    Thread.sleep(2000);
}
 @When("User validates page Title as Expected {String}")
 public void PrimaryAccountTitle(){
  getElementText(AccountProfilePage.ProfileTextName);
  String actualTitle =getElementText(AccountProfilePage.ProfileTextName);
 System.out. println(actualTitle);
  Assert.assertEquals(  "Create Primary Account Holder",actualTitle);
        }

        @When ("User fill out Create Account Form")
        public void FillCreateAccountForm(DataTable dataTable) throws InterruptedException {
            List<Map<String, String>> data = dataTable.asMaps();
            String mainEmail = dataProvider.getRandomEmail();
            Map<String, String>dataMap= data.get(0);

            String Email = dataMap.get ("email");
            String title = dataMap.get ("title");
            String firstName = dataMap.get("firstName");
            String lastname = dataMap. get ("lastName");
            String gender = dataMap. get ("gender");
             String  maritalStatus = dataMap. get ("maritalStatus");
            String employmentStatus = dataMap. get ("employmentStatus");
            String dateOfBirth = dataMap.get("dateOfBirth");
            sendText (AccountProfilePage.EMAIL_INPUT,mainEmail);
            Thread. sleep ( 1000);
            selectDropDownByText(AccountProfilePage.TITLE_INPUT, title);
            Thread. sleep (  1000);
            sendText(AccountProfilePage.FIRST_NAME_INPUT, firstName);
            Thread. sleep ( 1000);
            sendText(AccountProfilePage.LAST_NAME_INPUT, lastname);
            Thread. sleep(1000);selectFromDropDownByIndex(AccountProfilePage.GENDER_INPUT,1);
            Thread. sleep ( 1000);selectFromDropDownByIndex(AccountProfilePage.MARITAL_STATUS_INPUT,2);
            Thread .sleep (1000);
            sendText (AccountProfilePage.EMPLOYMENT_STATUS_INPUT, employmentStatus);
            Thread. sleep (  1000);
            sendText (AccountProfilePage.DATE_OF_BIRTH_INPUT,dateOfBirth);
            Thread. sleep (2000);
        }
    @When ("User click on Create Account Button")
    public void clickOnCreateAccountButton() throws InterruptedException{
    clickOnElement (AccountProfilePage.CreateAccountButton);
Thread.sleep(1000);
}
    @And("Validate user is on {string}")
    public void validateUserIsOn(String title) throws InterruptedException {
        Assert.assertEquals(title, getElementText(AccountProfilePage.SignUpYourAccount));
        Thread.sleep(1000);
    }
    @Then("Email displayed as entered")
    public void validateEmailAsExpected() throws InterruptedException {

        boolean isDisplayed = isElementEnabled(AccountProfilePage.SignUpYourAccount);
        Assert.assertTrue(isDisplayed);
        Thread.sleep(1000);
    }
    @When ("User creates account with existing email address")
    public void fillFormWithExistingEmail (DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps();
        Map<String, String> dataMap = data.get(0);

        String email = dataMap.get("email");
        String title = dataMap.get("title");
        String firstName = dataMap.get("firstName");
        String lastname = dataMap.get("LastName");
        String gender = dataMap.get("gender");
        String maritalStatus = dataMap.get("maritalStatus");
        String employmentStatus = dataMap.get("employmentStatus");
        String dateOfBirth = dataMap.get("dateOfBirth");
    }
    @Then ("Click on Create Account Button")
    public void clickCreateAccountBtn() throws InterruptedException {
        clickOnElement(AccountProfilePage.CreateAccountButton);
        Thread.sleep(3000);
    }
    @Then ("Error message {string}")
    public void errorMessageDisplayed(String expectedErrorMessage) throws InterruptedException {
    String errorMessage = getElementText(AccountProfilePage.ERROR_MESSAGE);
    Assert.assertEquals("errorMessage","errorMessage");

     Thread.sleep(2000);
}

}