package Tek.BDD.FinalProject.steps;

import Tek.BDD.FinalProject.Page.HomePage;
import Tek.BDD.FinalProject.Page.LoginPage;
import Tek.BDD.FinalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps extends SeleniumUtilities {
    @When("Click on Login button")
    public void ClickOnLoginButton() throws InterruptedException {
        clickOnElement(HomePage.LoginButtonInHomePage);
        Thread.sleep(2000);
    }

   @Given("Login with valid username {string} and password {string}")
    public void login_with_valid_username_and_password(String username, String password) throws InterruptedException {

       sendText(LoginPage.USERNAME_INPUT, "supervisor");
       Thread.sleep(2000);
       sendText(LoginPage.PASSWORD_INPUT, "tek_supervisor");
       Thread.sleep(2000);
   }
    @Given("Click on Sign in button")
    public void click_on_Sign_in_button() throws InterruptedException{
        clickOnElement (LoginPage.SIGN_IN_BUTTON);
        Thread. sleep (5000);
}

        @Then("Validate user navigate to Customer Service Portal")
        public void validate_user_navigate_to_Customer_Service_Portal() {
            String title = getElementText(HomePage.CustomerServicePortal);
            Assert.assertEquals("customer service portal", title);
            System.out.println(title);
        }
        @Then("Login with invalid username credential {string} and {string}")
        public void login_with_invalid_username_credential (String username, String password) throws InterruptedException{

        sendText(LoginPage.USERNAME_INPUT, "supervisor123");
        sendText(LoginPage.PASSWORD_INPUT, "tek_supervisor");
        Thread.sleep(2000);
    }

            @Then ("Validate user error message as expected {string}")
            public void validate_login_error_message_as_expected(String errorMessage) throws InterruptedException{
            String actualErrorMessage = getElementText(LoginPage.USER_ERROR_MESSAGE);
            Assert.assertEquals("errorMessage", "errorMessage");
            System.out.println(actualErrorMessage);
            Thread.sleep (2000);
    }
            @Then ("Login with invalid password credential {string} and {string}")
            public void login_with_invalid_password_credential(String username, String password) throws InterruptedException{

          sendText(LoginPage.USERNAME_INPUT, "supervisor");
          sendText(LoginPage.PASSWORD_INPUT, "tek_supervisor123");
            Thread.sleep(5000);
        }
    }
