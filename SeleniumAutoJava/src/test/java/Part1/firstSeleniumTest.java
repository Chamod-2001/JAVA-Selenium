package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firstSeleniumTest {

// WebDriver - Interface , driver - object --> Control browser and find element
    WebDriver driver;
    // This run the before the class
    @BeforeClass
    public void setUp() { // Method for setUp browse
        driver = new ChromeDriver(); // Instance
        driver.manage().window().maximize();
        driver.get("https://www.kapruka.com/shops/customerAccounts/accountLogin.jsp");
    }
    // This run the after the class
    @AfterClass
    public void tearDown() {
       //driver.quit(); // Close the all windows
        //driver.close(); // Only the current window  close
    }
    // Key step - Test method (LOGIN)
    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000); // 2 Second specific time for run
        //Object reference 1
        WebElement email =  driver.findElement(By.name("email")); //Find key element
        email.sendKeys("testuser@example.com"); //Performance action
        //Object reference 2
        var password = driver.findElement(By.name("password")); //Find key element
        password.sendKeys("YourSecurePassword"); //Performance action
        //Find element
        driver.findElement(By.name("Login")).click(); // Action
    }



}
