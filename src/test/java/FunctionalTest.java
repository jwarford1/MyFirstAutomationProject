import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by John on 3/28/2017.
 */
public class FunctionalTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp()
    {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown()
    {
        driver.close();
    }

}
