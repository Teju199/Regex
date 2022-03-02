import Regex.RegexFirstName;
import org.junit.Assert;
import org.junit.Test;

public class RegexFirstNameTest {
    @Test
    public void GivenFirstName_WhenProper_ShouldReturnTrue() {
        RegexFirstName firstName = new RegexFirstName();
        boolean result = firstName.validateUserName("Tejashwini");
        Assert.assertEquals(true, result);
    }

    @Test
    public void GivenFirstName_WhenNotProper_ShouldReturnFalse() {
        RegexFirstName firstName = new RegexFirstName();
        boolean result = firstName.validateUserName("tejashwini");
        Assert.assertEquals(false, result);
    }
}