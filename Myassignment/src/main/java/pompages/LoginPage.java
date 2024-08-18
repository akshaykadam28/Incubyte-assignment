package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    // Constructor to initialize the elements with PageFactory
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locator for the Sign In button on the homepage
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    private WebElement signInButton;

    // Method to click the Sign In button on the homepage
    public void clickSignInButton() {
        signInButton.click();
    }

    // Locator for the Email field
    @FindBy(id = "email")
    private WebElement emailField;

    // Method to enter the email address
    public void enterEmail(String emailText) {
        emailField.sendKeys(emailText);
    }
    
    // Locator for the Password field
    @FindBy(id = "pass")
    private WebElement passwordField;

    // Method to enter the password
    public void enterPassword(String passwordText) {
        passwordField.sendKeys(passwordText);
    }

    // Locator for the Sign In button in the login form
    @FindBy(xpath = "//span[contains(text(),'Sign In')]")
    private WebElement signInButtonNew;

    // Method to click the Sign In button in the login form
    public void clickSignInButtonNew() {
        signInButtonNew.click();
    }

    // Locator for the invalid email error message
    @FindBy(id = "email-error")
    private WebElement invalidEmailError;

    // Method to check if the invalid email error is displayed
    public boolean isInvalidEmailErrorDisplayed() {
        return invalidEmailError.isDisplayed();
    }

    // Locator for the invalid password error message
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement invalidPasswordError;

    // Method to check if the invalid password error is displayed
    public boolean isInvalidPasswordErrorDisplayed() {
        return invalidPasswordError.isDisplayed();
    }
    
    // Locator for the blank password error message
    @FindBy(id = "pass-error")
    private WebElement blankPasswordError;

    // Method to check if the blank password error is displayed
    public boolean isBlankPasswordErrorDisplayed() {
        return blankPasswordError.isDisplayed();
    }

}