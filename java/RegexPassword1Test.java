import Regex.RegexPassword1;
import junit.framework.Assert;
import org.junit.Test;

public class RegexPassword1Test {
    @Test
    public void GivenPassword_WhenProper_ReturnsTrue() {
        RegexPassword1 password1 = new RegexPassword1();
        boolean result = password1.validatePassword("welcome1");
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenPassword_WhenProper_ReturnsFalse() {
        RegexPassword1 password2 = new RegexPassword1();
        boolean result = password2.validatePassword("welcome_1");
        Assert.assertEquals(false, result);
    }
}
