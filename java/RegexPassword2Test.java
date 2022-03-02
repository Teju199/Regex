import Regex.RegexPassword2;
import junit.framework.Assert;
import org.junit.Test;

public class RegexPassword2Test {
    @Test
    public void GivenPassword_WhenProper_ReturnsTrue() {
        RegexPassword2 password2 = new RegexPassword2();
        boolean result = password2.validatePassword("Welcome1");
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenPassword_WhenProper_ReturnsFalse() {
        RegexPassword2 password2 = new RegexPassword2();
        boolean result = password2.validatePassword("welcome1");
        Assert.assertEquals(false, result);
    }

}
