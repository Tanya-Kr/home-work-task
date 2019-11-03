package com.hillel.lecture_6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 *  Count letters. Count the single character frequencies
 */
public class CountLettersFrequenciesTestTask {

    private CountLettersFrequenciesChecker countLettersFrequenciesChecker = new CountLettersFrequenciesChecker();


    @Test(dataProvider = "stringProvider")
    public void countLettersFrequenciesTest(String sentence, char letter, String expectedResult) {
        assertEquals(countLettersFrequenciesChecker.countLettersFrequencies(sentence, letter), expectedResult); ;
    }


    @DataProvider(name = "stringProvider")
    public static Object[][] stringProvider() {
        return new Object[][] {
                { "Strings are defined as an array of characters. The difference between a character array and a string " +
                        "is the string is terminated with a special character '\\0'.", 'a', "Character 'a' repeated 19 times"},
                { "In computer programming, a string is traditionally a sequence of characters, either as a literal" +
                        " constant or as some kind of variable." , 'm', "Character 'm' repeated 4 times"},
                { "Whenever a String Object is created, two objects will be created- one in the Heap Area and one in the" +
                        " String constant pool and the String object reference always points to heap area object.", 'e',
                        "Character 'e' repeated 25 times"},
        };
    }
}
