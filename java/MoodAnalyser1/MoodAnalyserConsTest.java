package MoodAnalyser1;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserConsTest {
    @Test
    public void GivenMessage_WhenSad_ReturnSad() {
        MoodAnalyserWithConstructor moodAnalyserCons = new MoodAnalyserWithConstructor("I am in sad mood");
        String mood = moodAnalyserCons.analyseMood1();
        Assert.assertEquals("sad", mood);
    }
    @Test
    public void GivenMessage_WhenHappy_ReturnHappy() {
        MoodAnalyserWithConstructor moodAnalyserCons = new MoodAnalyserWithConstructor("I am in happy mood");
        String mood = moodAnalyserCons.analyseMood1();
        Assert.assertEquals("happy", mood);
    }
}

