import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by John on 3/26/2017.
 */
public class MyConcatenatorTest {

    @Test
    public void testConcatanate() throws Exception {

        String concatenated = MyConcatenator.concatanate("one", "two", "three", "four");

        Assert.assertEquals("one,two,three,four", concatenated);

    }
}