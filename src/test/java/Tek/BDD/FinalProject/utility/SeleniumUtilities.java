package Tek.BDD.FinalProject.utility;

import Tek.BDD.FinalProject.Base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;


public class SeleniumUtilities  extends BaseSetup {
    private WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public WebElement waitForElementVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


    }

    public WebElement waitForElementClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement findElement(By locator) {
        return waitForElementVisible(locator);
    }

    public List<WebElement> findElementS(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void clickOnElement(By locator) {
        WebElement element = waitForElementClickable(locator);
        element.click();
    }

    public void sendText(By locator, String text) {
        WebElement element = waitForElementVisible(locator);
        element.sendKeys(text);
    }

    public String getElementText(By locator) {
        WebElement element = waitForElementVisible(locator);
        return element.getText();
    }

    public List<WebElement> getElementS(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public boolean isElementEnabled(By locator) {
        WebElement element = waitForElementVisible(locator);
        return element.isEnabled();
    }

    public void selectFromDropDownByValue(By locator, String value) {
        WebElement element = waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectFromDropDownByIndex(By locator, int index) {
        WebElement element = waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropDownByText(By locator, String text) {
        WebElement element = waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }


    public void clearText(By locator) {
        WebElement element = waitForElementVisible(locator);
        element.clear();
    }

    public static class DateTimeUtility {

        public static String getCurrentDate() {
            LocalDate now = Instant.now().atZone(ZoneId.of("America/New_York"))
                    .toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
            return formatter.format(now);
        }

        public static String getExpiredDate() {
            LocalDate now = Instant.now().atZone(ZoneId.of("America/New_York")).plusDays(1)
                    .toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
            return formatter.format(now);
        }
    }
}




