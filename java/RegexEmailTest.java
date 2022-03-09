import Regex.RegexEmail;
import Regex.RegexEmailException;
import Regex.RegexPasswordException;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegexEmailTest {

    @Test
    public void GivenEmail_WhenProper_ReturnTrue() throws RegexEmailException {
        RegexEmail email = new RegexEmail();
        boolean result = email.validateEmail("teju19.hy@bridgelabz.co.in");
        Assert.assertEquals(true,result);
    }

    //Entered invalid email address and caught exception to return a message to user to enter valid input.
    @Test
    public void GivenEmail_WhenNotProper_ReturnMessage() throws RegexEmailException {
        RegexEmail email1 = new RegexEmail();
        try{
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(RegexPasswordException.class);
            RegexEmail.validateEmail("abc..@yahoo.com");
        }catch(RegexEmailException e){
            e.printStackTrace();
            Assert.assertEquals("Please enter valid email address.", e.getMessage());
        }
    }
}
