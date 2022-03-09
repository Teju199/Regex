import MoodAnalyser1.MoodAnalysisException;
import Regex.RegexPassword1;
import Regex.RegexPasswordException;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegexPassword1Test {
    @Test
    public void GivenPassword_WhenProper_ReturnsTrue() throws RegexPasswordException {
        RegexPassword1 password1 = new RegexPassword1();
        boolean result = password1.validatePassword("welcome1");
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenPassword_WhenNotProper_ReturnsMessage() throws RegexPasswordException {
        RegexPassword1 password2 = new RegexPassword1();

        try{
            //Exception Rule is created.
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(RegexPasswordException.class);
            RegexPassword1.validatePassword("welcome_1");
        }
        catch(RegexPasswordException e){
            e.printStackTrace();
            Assert.assertEquals("Please enter valid password.", e);
        }

    }
}
