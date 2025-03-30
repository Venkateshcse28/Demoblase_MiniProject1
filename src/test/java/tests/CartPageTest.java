package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SignUpPage;

public class CartPageTest extends BaseTest {
	
    
    @Test
    public void testPlaceOrder() throws InterruptedException {
    	System.out.println("Executing cartpage Test");
    	
    	HomePage homePage = new HomePage(driver);
        
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        
        Thread.sleep(1000);
        cartPage.clickCartoption();
        Thread.sleep(1000);
        System.out.println("Sucessfully Clicked cart Menu");
        
        int rows=cartPage.getSuccessRowCount();
        Thread.sleep(1000);
        System.out.println("Total rows with class 'success': " + rows);
        Assert.assertTrue(rows > 0, "No rows with class 'success' found!");
        System.out.println("Sucessfully Validate product count in cart pag");
        Thread.sleep(1000);
        //cartPage.clickPlaceOrder();
        //System.out.println("Sucessfully Clicked Place Order Button");
        
        cartPage.HomeMenuClick();
        System.out.println("Sucessfully Clicked Home Menu");
        
        cartPage.navigateToCategorylist();
        System.out.println("Sucessfully Clicked Monitors from left side menu");
        
        cartPage.selectProduct(); 
        System.out.println("Sucessfully Clicked Sony Laptop");
        Thread.sleep(1000);
        cartPage.clickAddToCart();
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
        System.out.println("Sucessfully Clicked Popup Ok Button");
        
        Thread.sleep(1000);
        cartPage.clickCartoption();
        Thread.sleep(1000);
        System.out.println("Sucessfully Clicked cart Menu");
        
        cartPage.DeleteProduct();
        System.out.println("Sucessfully Clicked Removed Apple Monitor 24 from cart page");
        Thread.sleep(4000);
        
        
        
        
        
        
        
        
    }
}