package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
	
	@FindBy(xpath = "//a[normalize-space(text())='Laptops']")
    private WebElement LaptopClick;
	
	
	
	@FindBy(xpath = "//a[normalize-space(text())='Sony vaio i5']")
    private WebElement SonyLaptopClick;
	
	
	 @FindBy(xpath = "//*[contains(text(),'Welcome')]")
	    private WebElement welcomemessage;
	 
	  @FindBy(xpath = "//a[@id='nava']//img") 
	    private WebElement logo;
	 
	 @FindBy(xpath = "//div[@id='navbarExample']/ul/li") 
	    private List<WebElement> menuItems;
	 

	    @FindBy(xpath = "//div[@class='list-group']/a") 
	    private List<WebElement> categories;


	    public boolean isWelcomeMessageDisplayed() {
	        return welcomemessage.isDisplayed();
	    }

 
    @FindBy(xpath = "//h2[@class='name']")
    private WebElement productName;

    @FindBy(xpath = "//h3[@class='price-container']")
    private WebElement productPrice;

    @FindBy(xpath = "//a[text()='Add to cart']")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    
    public String getwelcomemessage() {
        return welcomemessage.getText();
        
    }
    
    public boolean isMenuItemDisplayed(String menuItem) {
        for (WebElement item : menuItems) {
            String itemText = item.getText().replaceAll("\\s*\\(current\\)", "").trim(); // Removes "(current)" even if on a new line
            if (itemText.equalsIgnoreCase(menuItem)) {
                return true; // Breaks the loop and returns true immediately
            }
        }
        return false; // Returns false if no match is found
    }




    public boolean isCategoryDisplayed(String category) {
            for (WebElement item : categories) {
                String itemText = item.getText().replaceAll("\\s*\\(CATEGORIES\\)", "").trim(); // Removes "(current)" even if on a new line
                if (itemText.equalsIgnoreCase(category)) {
                    return true; // Breaks the loop and returns true immediately
                }
            }
            return false; // Returns false if no match is found
        }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
    
    public String getProductName() {
        return productName.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }
    
    public void navigateToCategory() {
    	LaptopClick.click();
    }
    

    public void selectProduct() {
    	SonyLaptopClick.click();
    }
    
    
    
}