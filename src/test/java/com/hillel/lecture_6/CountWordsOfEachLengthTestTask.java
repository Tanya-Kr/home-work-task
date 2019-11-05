package com.hillel.lecture_6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Count the number of words of each length in some text.
 */
public class CountWordsOfEachLengthTestTask {

    private CountWordsOfEachLengthChecker countWordsOfEachLengthChecker = new CountWordsOfEachLengthChecker();

    @Test(dataProvider = "sentenceProviderForLength")
    public void countWordsOfEachLengthTest(String sentence, int wordLength, int expectedResult) {
        assertEquals(countWordsOfEachLengthChecker.countNumberOfWorldWithLength(sentence, wordLength), expectedResult); ;
    }

    @DataProvider(name = "sentenceProviderForLength")
    public static Object[][] sentenceProviderForLength() {
        return new Object[][] {
                { "Winter is coming.", 6, 2},
                { "When you play the game of thrones, you win or you die. There is no middle ground.", 3, 6},
                { "When you play the game of thrones, you win or you die. There is no middle ground.", 7, 1},
                { "The man who passes the sentence should swing the sword.", 5, 2},
        };
    }
}
