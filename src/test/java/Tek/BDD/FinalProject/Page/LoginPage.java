package Tek.BDD.FinalProject.Page;

import org.openqa.selenium.By;

public class LoginPage {
    public static final By LoginButton = By.xpath("//contains (text(), 'Login')]");
    public static final By USERNAME_INPUT = By.xpath("//input[@id='username']");
    public static final By PASSWORD_INPUT = By.xpath("//input [@id='password' ]");
    public static final By SIGN_IN_BUTTON = By.xpath("// button[contains(text(), 'Sign In')]");

    public static final By USER_ERROR_MESSAGE = By.xpath("//div[contains(text(), 'User supervisor20 not found");

    public static final By PASSWORD_ERROR_MESSAGE = By.xpath("//div[contains(text(), 'Password not matched");

    public static final By CREATE_ACCOUNT_LINK = By.linkText("Create New Account");

}
