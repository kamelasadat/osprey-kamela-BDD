package Tek.BDD.FinalProject.steps;

import Tek.BDD.FinalProject.Page.AccountPage;
import Tek.BDD.FinalProject.Page.AccountProfilePage;
import Tek.BDD.FinalProject.Page.DashboardPage;
import Tek.BDD.FinalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountSteps extends SeleniumUtilities {
    @And("Click on Accounts Button")
    public void clickOnAccountsButton(){
        clickOnElement(DashboardPage.AccountsButton);
    }

    @And("Verify the presence of all 5 rows")
    public void VerifyThePresenceOfAllFiveRows() {
        List<WebElement> rows = getDriver().findElements(AccountPage.AllRows);
        assertEquals(5, rows.size());
        for (WebElement row : rows) {
            assertTrue(row.isDisplayed());
        }
    }

    @Then("all five rows should be present")
    public void allFiveRowsShouldBePresent() {
        List<WebElement> rows = getDriver().findElements(AccountPage.AllRows);
        assertEquals("Expected exactly 5 rows", 5, rows.size());
        for (WebElement row : rows) {
            assertTrue("Row is not displayed", row.isDisplayed());
        }
    }

    @Then("Select Show {string} from page per show dropdown")
    public void clickPagePerShow(String Num) {
        WebElement element= getDriver().findElement(AccountPage.PageShow);
        Select select= new Select(element);
        select.selectByVisibleText(Num);
    }
}
