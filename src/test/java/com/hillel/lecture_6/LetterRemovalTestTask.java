package com.hillel.lecture_6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Letter removal
 * Given a phrase and a letter (or series of letters) remove all occurrences of that letter(s) in the phrase
 */
public class LetterRemovalTestTask {

    private LetterRemovalChecker letterRemovalChecker = new LetterRemovalChecker();


    @Test(dataProvider = "stringProvider")
    public void countLettersFrequenciesTest(String sentence, String letterFoRemove, String expectedResult) {
        assertEquals(letterRemovalChecker.removeLetter(sentence, letterFoRemove), expectedResult); ;
    }


    @DataProvider(name = "stringProvider")
    public static Object[][] stringProvider() {
        return new Object[][] {
                {"Drop your socks and grab your Crocs, we're about to get wet on this ride.", "a",
                 "Drop your socks nd grb your Crocs, we're bout to get wet on this ride."},
                {"I told you, I don't want to join your super secret boy band.", "o",
                 "I tld yu, I dn't want t jin yur super secret by band."},
                {"Genius, billionaire, playboy, philanthropist.", "l", "Genius, biionaire, payboy, phianthropist."},
        };
    }
}
