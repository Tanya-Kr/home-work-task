package com.hillel.lecture_6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Count the words in some text.
 */
public class CountWordsTestTask {

    private CountWordsChecker countWordsChecker = new CountWordsChecker();

    @Test(dataProvider = "sentenceProvider")
    public void countWordsInSentenceTest(String sentence, int expectedResult) {
        assertEquals(countWordsChecker.countNumberOfWorld(sentence), expectedResult); ;
    }

    @DataProvider(name = "sentenceProvider")
    public static Object[][] sentenceProvider() {
        return new Object[][] {
                { "Winter is coming.", 3},
                { "When you play the game of thrones, you win or you die. There is no middle ground.", 17},
                { "The man who passes the sentence should swing the sword.", 10},
        };
    }
}
