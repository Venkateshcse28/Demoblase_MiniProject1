package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected static WebDriver driver; // Make driver static to use across tests

    @BeforeSuite
    public void setup() throws InterruptedException {
        if (driver == null) {  // Ensure driver is initialized only once
            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-gpu");
            options.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.demoblaze.com/");
        }
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset driver after tests
        }
    }
}
