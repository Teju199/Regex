package MoodAnalyser1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserException3Test {
    @Test
    public void GivenMessage_WhenSad_ReturnSad() throws MoodAnalysisExceptionForEmpty {
        MoodAnalyserException3 moodAnalyserExc3 = new MoodAnalyserException3("I am in sad mood");
        String mood = moodAnalyserExc3.analyseMood();
        Assert.assertEquals("sad", mood);
    }
    @Test
    public void GivenMessage_WhenHappy_ReturnHappy() throws MoodAnalysisExceptionForEmpty {
        MoodAnalyserException3 moodAnalyserExc3 = new MoodAnalyserException3("I am in happy mood");
        String mood = moodAnalyserExc3.analyseMood();
        Assert.assertEquals("happy", mood);
    }

    //Null Pointer Exception will be created as the message sent will be Null.
    // Try and catch is written to catch the exception.
    @Test
    public void GivenMessage_WhenNull_ReturnMessage() throws MoodAnalysisExceptionForEmpty {
        MoodAnalyserException3 moodAnalyserExc3 = new MoodAnalyserException3(null);
        String mood = null;
        try{
            //Exception Rule is created.
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyserExc3.analyseMood();
        }
        catch(MoodAnalysisExceptionForEmpty e){
            e.printStackTrace();
        }
    }

    @Test
    public void GivenMessage_WhenEmpty_ReturnMessage() throws MoodAnalysisExceptionForEmpty {
        MoodAnalyserException3 moodAnalyserExc3 = new MoodAnalyserException3("");
        try {
            //Exception Rule is created.
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyserExc3.analyseMood();
        } catch (MoodAnalysisExceptionForEmpty e) {
            e.printStackTrace();
        }
    }
}
