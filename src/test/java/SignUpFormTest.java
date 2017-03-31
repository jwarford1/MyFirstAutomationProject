import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by John on 3/28/2017.
 */
public class SignUpFormTest extends FunctionalTest {

    @Test
    public void signUp()
    {
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
        SignUpPage signUpPage = new SignUpPage(driver);
        assertTrue(signUpPage.isInitialized());
        signUpPage.enterName("First", "Last");
        signUpPage.enterAddress("123 Street", "12345");

        ReceiptPage receiptPage = signUpPage.submit();
        assertTrue(receiptPage.isInitialized());
        assertEquals("Thank you!", receiptPage.confirmationHeader()); }

}
