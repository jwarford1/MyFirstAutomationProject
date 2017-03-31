import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class ParabankTestNG {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {

      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(description = "Tests a successful login")

    public void testLoginOK() {

        driver.get("http://parabank.parasoft.com");
        driver.findElement(By.name("username")).sendKeys("john");
        driver.findElement(By.name("password")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Assert.assertEquals("ParaBank | Accounts Overview", driver.getTitle());
        driver.findElement(By.partialLinkText("Log Out")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @AfterSuite
    public void tearDown() {

        driver.quit();
    }
}