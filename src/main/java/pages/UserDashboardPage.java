package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboardPage extends BasePage {
    
    @FindBy(xpath = "//a[text()='Log out']")
    private WebElement logoutButton;

    public UserDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public boolean isLogoutButtonVisible() {
        return logoutButton.isDisplayed();
    }
}