package tests;

import org.testng.TestNG;

public class TestRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] {
            HomePageTest.class,
            SignUpPageTest.class,
            LoginPageTest.class,
            ProductPageTest.class,
            CartPageTest.class,
            CheckoutPageTest.class,
            LogoutTest.class
        });
        testng.run();
    }
}