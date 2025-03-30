package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import pages.UserDashboardPage;

public class LoginPageTest extends BaseTest {
    
    @Test
    public void testLogin() throws InterruptedException {
    	System.out.println("Executing login Test");
    	
        HomePage homePage = new HomePage(driver);
       
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginMenu();
        Thread.sleep(1000);
        loginPage.enterUsername("newuser1017");
        Thread.sleep(1000);
        loginPage.enterPassword("password123");
        Thread.sleep(1000);
        loginPage.clickLogin();
        Thread.sleep(1000);
        
        UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
        //Assert.assertTrue(userDashboardPage.isLogoutButtonVisible(), "Logout button is not visible");
    }
}