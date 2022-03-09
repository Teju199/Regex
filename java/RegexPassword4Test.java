import Regex.RegexPassword1;
import Regex.RegexPassword3;
import Regex.RegexPassword4;
import Regex.RegexPasswordException;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegexPassword4Test {
    @Test
    public void GivenPassword_WhenProper_ReturnsTrue() throws RegexPasswordException {
        RegexPassword4 password4 = new RegexPassword4();
        boolean result = password4.validatePassword("weLcome1@");
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenPassword_WhenNotProper_ReturnsMessage() throws RegexPasswordException {
        RegexPassword4 password4 = new RegexPassword4();

        try {
            //Exception Rule is created.
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(RegexPasswordException.class);
            RegexPassword1.validatePassword("welcome_1");
        } catch (RegexPasswordException e) {
            e.printStackTrace();
            Assert.assertEquals("Please enter valid password.", e.getMessage());
        }
    }
}
