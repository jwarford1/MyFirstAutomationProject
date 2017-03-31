import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by John on 3/28/2017.
 */
public class PageObject {

    protected WebDriver driver;
    public PageObject(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
