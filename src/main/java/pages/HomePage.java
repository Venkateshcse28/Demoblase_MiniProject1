package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    
    private WebDriverWait wait;  // Declare WebDriverWait at class level

    @FindBy(id = "signin2")
    private WebElement signInButton;

    @FindBy(id = "signup2") 
    private WebElement signUpButton;

    @FindBy(id = "signInModal")
    private WebElement signInModal;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait once
    }

    public void clickSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

    public void clickSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    public boolean isSignInModalVisible() {
        return wait.until(ExpectedConditions.visibilityOf(signInModal)).isDisplayed();
    }
}
