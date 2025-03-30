package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    
    @FindBy(id = "name")
    private WebElement nameField;
    
    
    @FindBy(xpath ="//button[normalize-space(text())='OK']")
    private WebElement OkButton;

    @FindBy(id = "country")
    private WebElement countryField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "card")
    private WebElement cardField;

    @FindBy(id = "month")
    private WebElement monthField;

    @FindBy(id = "year")
    private WebElement yearField;

    @FindBy(xpath = "//button[text()='Purchase']")
    private WebElement purchaseButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    public void enterCountry(String country) {
        countryField.sendKeys(country);
    }

    public void enterCity(String city) {
        cityField.sendKeys(city);
    }

    public void enterCard(String card) {
        cardField.sendKeys(card);
    }

    public void enterMonth(String month) {
        monthField.sendKeys(month);
    }

    public void enterYear(String year) {
        yearField.sendKeys(year);
    }

    public void clickPurchase() {
        purchaseButton.click();
    }
    
    public void clickOk() {
    	OkButton.click();
    }
}