import Regex.RegexPassword3;
import Regex.RegexPassword4;
import junit.framework.Assert;
import org.junit.Test;

public class RegexPassword4Test {
    @Test
    public void GivenPassword_WhenProper_ReturnsTrue() {
        RegexPassword4 password4 = new RegexPassword4();
        boolean result = password4.validatePassword("weLcome1@");
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenPassword_WhenNotProper_ReturnsFalse() {
        RegexPassword4 password4 = new RegexPassword4();
        boolean result = password4.validatePassword("Welcomee1");
        Assert.assertEquals(false, result);
    }
}
