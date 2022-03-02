import Regex.RegexLastName;
import junit.framework.Assert;
import org.junit.Test;

public class RegexLastNameTest {
    @Test
    public void GivenLastName_WhenProper_ReturnTrue() {
        RegexLastName lastName = new RegexLastName();
        boolean result = lastName.validateUserName("Iyer");
        Assert.assertEquals(true,result);
    }

    @Test
    public void GivenLastName_WhenNotProper_ReturnFalse() {
        RegexLastName lastName1 = new RegexLastName();
        boolean result = lastName1.validateUserName("iyer");
        Assert.assertEquals(false,result);
    }
}

