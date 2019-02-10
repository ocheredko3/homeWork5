package common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DateNowTest {

    @Test
    public void testThatDateNowNotEqualsOne() {
        String actual = "1";
        DateNow dateNow = new DateNow();
        Assert.assertNotEquals(dateNow.dateOf(),actual);
        System.out.println(dateNow.dateOf());
    }
    @Test
    public void testThatDateNowNotNull() {
        DateNow dateNow = new DateNow();
        Assert.assertNotNull(dateNow.dateOf());
        System.out.println(dateNow.dateOf());
    }
}