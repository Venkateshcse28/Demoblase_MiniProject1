package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import pages.HomePage;
import pages.SignUpPage;

public class SignUpPageTest extends BaseTest {
    
    @Test
    public void testSignUp() throws InterruptedException {
        System.out.println("Executing SignUp Test");
        HomePage homePage = new HomePage(driver);
        //homePage.clickSignUp(); // Uncomment this if needed

        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.isSignUpModalVisible(), "Sign up modal is not visible");

        signUpPage.enterUsername("newuser1020");
        Thread.sleep(2000);
        signUpPage.enterPassword("password123");
        Thread.sleep(2000);
        signUpPage.clickSignUp();
        Thread.sleep(1000);
       
        // Handle  Alert
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Thread.sleep(3000);
        System.out.println("Alert Text: " + alertText);
        alert.accept(); 
        Thread.sleep(1500);
        Assert.assertEquals(alertText, "Sign up successful.", "Sign up alert message did not match expected text.");
    }
}
