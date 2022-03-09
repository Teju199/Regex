package MoodAnalyser1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserException2Test {
    @Test
    public void GivenMessage_WhenSad_ReturnSad() throws MoodAnalysisException {
        MoodAnalyserException2 moodAnalyserExc2 = new MoodAnalyserException2("I am in sad mood");
        String mood = moodAnalyserExc2.analyseMood();
        Assert.assertEquals("sad", mood);
    }
    @Test
    public void GivenMessage_WhenHappy_ReturnHappy() throws MoodAnalysisException {
        MoodAnalyserException2 moodAnalyserExc2 = new MoodAnalyserException2("I am in happy mood");
        String mood = moodAnalyserExc2.analyseMood();
        Assert.assertEquals("happy", mood);
    }

    //Null Pointer Exception will be created as the message sent will be Null.
    // Try and catch is written to catch the exception.
    @Test
    public void GivenMessage_WhenNull_ReturnMessage() throws MoodAnalysisException {
        MoodAnalyserException2 moodAnalyserExc2 = new MoodAnalyserException2(null);
        String mood = null;
        try{
            //Exception Rule is created.
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyserExc2.analyseMood();
        }
        catch(MoodAnalysisException e){
            e.printStackTrace();
        }
    }
}
