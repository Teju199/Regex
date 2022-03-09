import MoodAnalyser.MoodAnalyser;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import MoodAnalyser.MoodAnalyserException;

public class MoodAnalyserTest {
    @Test
    public void GivenMessage_WhenSad_ReturnsSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message.");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void GivenMessage_WhenHappy_ReturnsHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser();
        String mood = moodAnalyser1.analyseMood("This is a happy message.");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void GivenMessage_WhenNull_ReturnsHappy() {
        MoodAnalyser moodAnalyser2 = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser2.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }
        catch(MoodAnalyserException e){
            e.printStackTrace();
        }
    }
}
