package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    
    @Test
    public void testSignInModalVisibility() {
    	System.out.println("Executing Homepage Test");
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
        Assert.assertTrue(homePage.isSignInModalVisible(), "Sign in modal is not visible");
    }
}