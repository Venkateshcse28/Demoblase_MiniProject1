package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
	
	 @FindBy(xpath = "count(//tr[@class='success'])") 
	    private WebElement cartCount;
	 
	 @FindBy(xpath = "(//tr[@class='success']//a)[1]") 
	    private WebElement DeleteClick;
	 
	 
	 @FindBy(xpath = "//a[normalize-space()='Apple monitor 24']")
	    private WebElement Apple;
	 
	 @FindBy(xpath = "//a[normalize-space(text())='Monitors']")
	    private WebElement Monitors;
	 
	  @FindBy(xpath = "//a[text()='Add to cart']")
	    private WebElement addToCartButton;
	 
	 @FindBy(xpath = "//a[normalize-space(text())='Home']") 
	    private WebElement HomeMenu;
	 
	 @FindBy(xpath = "//a[normalize-space()='Cart']") 
	    private WebElement cartClick;
    
    @FindBy(xpath = "//button[text()='Place Order']")
    private WebElement placeOrderButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickPlaceOrder() {
        placeOrderButton.click();
    }
    
    public void clickCartoption() {
    	cartClick.click();
    }
    
    public void HomeMenuClick() {
    	HomeMenu.click();
    }
    
    public void navigateToCategorylist() {
    	Monitors.click();
    }
    
    public void clickAddToCart() {
        addToCartButton.click();
    }
    
    public void DeleteProduct() {
    	DeleteClick.click();
    }

    public void selectProduct() {
    	Apple.click();
    }
    
 // Method to count rows with class 'success'
    public int getSuccessRowCount() {
        List<WebElement> rows = driver.findElements(By.xpath("//tr[@class='success']"));
        return rows.size();
    }

}