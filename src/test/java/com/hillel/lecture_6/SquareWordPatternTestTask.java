package com.hillel.lecture_6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Square word patterns
 * Given a word, print a square made from letter rotations of the word as in:
 * help
 * elph
 * lphe
 * phel
 */
public class SquareWordPatternTestTask {

    private SquareWordPatternChecker squareWordPatternChecker = new SquareWordPatternChecker();


    @Test(dataProvider = "stringProvider")
    public void squareWordPatternTest(String word, String expectedResult) {
        assertEquals(squareWordPatternChecker.applySquareWordPattern(word), expectedResult); ;
    }

    @DataProvider(name = "stringProvider")
    public static Object[][] stringProvider() {
        return new Object[][] {
                {"help", "help, elph, lphe, phel"},
                {"java", "java, avaj, vaja, ajav"},
                {"string", "string, trings, ringst, ingstr, ngstri, gstrin"},
        };
    }
}
