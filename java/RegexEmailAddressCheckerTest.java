import Regex.RegexEmail;
import Regex.RegexEmailException;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import Regex.RegexEmail;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
    public class RegexEmailAddressCheckerTest {
        //instance variables
        private String email;
        private Boolean expectedResult;
        private RegexEmail regexEmail;

        //called constructor assigned the inputs to the instance variables
        public RegexEmailAddressCheckerTest(String email, Boolean expectedResult) {
            this.email = email;
            this.expectedResult = expectedResult;
        }

        //Object created for the RegexEmail class
        @Before
        public void initialize(){
            regexEmail = new RegexEmail();
        }

        //Sample emails and the expectedResult given in the list
        @Parameterized.Parameters
        public static Collection emails() {
            return Arrays.asList(new Object[][]{
                    {"abc@yahoo.com", true},
                    {"abc-100@yahoo.com", true},
                    {"abc.100@yahoo.com", true},
                    {"abc111@abc.com", true},
                    {"abc.100@abc.net", true},
                    {"abc.100@abc.com.au", true},
                    {"abc123@.com", false},
                    {"abc..@abc.com", false}
            });
        }

        //Written test pattern by calling ValidateEmail method
        @Test
        public void testRegexEmailPattern() throws RegexEmailException {
            System.out.println("Regex Email is " + email);
            assertEquals(expectedResult, RegexEmail.validateEmail(email));
        }
    }
