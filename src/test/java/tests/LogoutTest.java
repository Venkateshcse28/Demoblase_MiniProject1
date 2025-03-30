package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboardPage;

public class LogoutTest extends BaseTest {
    
    @Test
    public void testLogout() {
    	 System.out.println("Executing Logout Test");
        HomePage homePage = new HomePage(driver);
        //homePage.clickSignIn();
        
        //LoginPage loginPage = new LoginPage(driver);
        //loginPage.enterUsername("testuser");
        //loginPage.enterPassword("password123");
        //loginPage.clickLogin();
        
        UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
        userDashboardPage.clickLogout();
        System.out.println("Sucessfully Clicked Logout Menu Options");
        
        // Add assertions to verify successful logout
       // Assert.assertTrue(homePage.isSignInModalVisible(), "User  is not logged out.");
    }
}