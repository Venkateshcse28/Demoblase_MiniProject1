package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutPageTest extends BaseTest {
    
    @Test(priority = 6)
    public void testCheckout() throws InterruptedException {
    	 System.out.println("Executing checkout Test");
        CartPage cartPage = new CartPage(driver);
        cartPage.clickPlaceOrder();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterName("Venkatesh");
        Thread.sleep(500);
        checkoutPage.enterCountry("India");
        checkoutPage.enterCity("Bangalore");
        Thread.sleep(2000);
        checkoutPage.enterCard("1500150015001500");
        checkoutPage.enterMonth("12");
        Thread.sleep(500);
        checkoutPage.enterYear("2025");
        checkoutPage.clickPurchase();

        // Add assertions to verify successful purchase
        Assert.assertTrue(driver.getPageSource().contains("Thank you for your purchase!"), "Purchase was not successful.");
        System.out.println("Sucessfully Purchased");
        
        Thread.sleep(1000);
        checkoutPage.clickOk();
        System.out.println("Sucessfully Clicked Ok Button");
        
    }
}