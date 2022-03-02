import Regex.RegexEmail;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegexEmailTest {

    @Test
    public void GivenEmail_WhenProper_ReturnTrue() {
        RegexEmail email = new RegexEmail();
        boolean result = email.validateEmail("teju19.hy@bridgelabz.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void GivenEmail_WhenProper_ReturnFalse() {
        RegexEmail email1 = new RegexEmail();
        boolean result = email1.validateEmail("teju19.hy@_bridgelabz.com");
        Assert.assertEquals(false, result);
    }
}
