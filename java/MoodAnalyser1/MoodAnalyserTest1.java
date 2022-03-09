package MoodAnalyser1;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest1 {
    @Test
    public void GivenMessage_WhenSad_ReturnSad() {
        MoodAnalyser1 moodAnalyser1 = new MoodAnalyser1();
        String mood = moodAnalyser1.analyseMood("I am in sad mood");
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void GivenMessage_WhenHappy_ReturnHappy() {
        MoodAnalyser1 moodAnalyser1 = new MoodAnalyser1();
        String mood = moodAnalyser1.analyseMood("I am in happy mood");
        Assert.assertEquals("happy", mood);
    }


}
