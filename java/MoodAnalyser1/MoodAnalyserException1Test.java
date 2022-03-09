package MoodAnalyser1;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserException1Test {
    @Test
    public void GivenMessage_WhenSad_ReturnSad() {
        MoodAnalyserException1 moodAnalyserExc1 = new MoodAnalyserException1();
        String mood = moodAnalyserExc1.analyseMood("I am in sad mood");
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void GivenMessage_WhenHappy_ReturnHappy() {
        MoodAnalyserException1 moodAnalyserExc1 = new MoodAnalyserException1();
        String mood = moodAnalyserExc1.analyseMood("I am in happy mood");
        Assert.assertEquals("happy", mood);
    }

    @Test
    public void GivenMessage_WhenNull_ReturnHappy() {
        MoodAnalyserException1 moodAnalyserExc1 = new MoodAnalyserException1();
        String mood = moodAnalyserExc1.analyseMood("Null");
        Assert.assertEquals("happy", mood);
    }
}
