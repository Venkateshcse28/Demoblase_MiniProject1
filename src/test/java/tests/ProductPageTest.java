package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SignUpPage;

public class ProductPageTest extends BaseTest {
    
	@Test(priority = 4)
    public void testProductDetails() throws InterruptedException {
    	System.out.println("Executing ProductPageTest Test");
    	
    	HomePage homePage = new HomePage(driver);
        
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
       
        Assert.assertTrue(productPage.isWelcomeMessageDisplayed(), "Welcome message is not displayed");
        Thread.sleep(1000);
        
        Assert.assertTrue(productPage.isMenuItemDisplayed("Home"), "Home menu item is not displayed");
        System.out.println("successfully Validate Home menu options");
        Thread.sleep(1000);
        Assert.assertTrue(productPage.isMenuItemDisplayed("Contact"), "Contact menu item is not displayed");
        Thread.sleep(1000);
        System.out.println("successfully Validate Contact menu options");
      

      
        Assert.assertTrue(productPage.isCategoryDisplayed("Phones"), "Phones category is not displayed");
        System.out.println("successfully Validate Phones from left panel");
        Thread.sleep(1000);
        Assert.assertTrue(productPage.isCategoryDisplayed("Laptops"), "Laptops category is not displayed");
        Thread.sleep(1000);
        System.out.println("successfully Validate Laptops from left panel");
        Assert.assertTrue(productPage.isCategoryDisplayed("Monitors"), "Tablets category is not displayed");
        System.out.println("successfully Validate Monitors from left panel");

       
        Assert.assertTrue(productPage.isLogoDisplayed(), "Application logo is not displayed");
        Thread.sleep(1500);
        System.out.println("successfully Validate Application Logo");
       
        productPage.navigateToCategory();
        System.out.println("Laptop Options Clicked successfully");
        Thread.sleep(2000);
        productPage.selectProduct(); 
        System.out.println("Sucessfully Clicked Sony Laptop");
        Thread.sleep(2000);
        productPage.clickAddToCart();
        System.out.println("Sucessfully Clicked Add to card Button");
        Thread.sleep(6000);
        
        // Handle  Alert
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Thread.sleep(3000);
        System.out.println("Popup Text: " + alertText);
        Thread.sleep(1500);
        alert.accept(); 
        Thread.sleep(1500);
        
        String productPrice=productPage.getProductPrice();
        System.out.println("Total price in cart page: " + productPrice);
        Thread.sleep(2000);
    }
}