import Regex.RegexPassword3;
import junit.framework.Assert;
import org.junit.Test;

public class RegexPassword3Test {
    @Test
    public void GivenPassword_WhenProper_ReturnsTrue() {
        RegexPassword3 password3 = new RegexPassword3();
        boolean result = password3.validatePassword("Welcomee1");
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenPassword_WhenProper_ReturnsFalse() {
        RegexPassword3 password3 = new RegexPassword3();
        boolean result = password3.validatePassword("Welcomee");
        Assert.assertEquals(false, result);
    }
}
