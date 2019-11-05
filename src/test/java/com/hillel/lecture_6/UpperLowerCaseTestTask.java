package com.hillel.lecture_6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Upper/Lower case change
 * Change given text into all upper case or lower case or change the first letter of each word (or
 * sentence) to upper and the rest to lower, etc.
 */
public class UpperLowerCaseTestTask {

    private UpperLowerCaseChecker upperLowerCaseChecker = new UpperLowerCaseChecker();

    @Test(dataProvider = "upperCaseStringProvider")
    public void changeToUpperCaseTest(String word, String expectedResult) {
        assertEquals(upperLowerCaseChecker.toUpperCase(word), expectedResult); ;
    }

    @Test(dataProvider = "lowerCaseStringProvider")
    public void changeToLowerCaseTest(String word, String expectedResult) {
        assertEquals(upperLowerCaseChecker.toLowerCase(word), expectedResult); ;
    }

    @Test(dataProvider = "sentenceProvider")
    public void changeFirstLetterOfSentenceToUpperCaseTest(String word, String expectedResult) {
        assertEquals(upperLowerCaseChecker.eachSentenceToUpperCase(word), expectedResult); ;
    }

    @Test(dataProvider = "sentenceProviderForEachLetter")
    public void changeEachLetterOfSentenceToUpperCaseTest(String word, String expectedResult) {
        assertEquals(upperLowerCaseChecker.eachLetterToUpperCase(word), expectedResult); ;
    }


    @DataProvider(name = "upperCaseStringProvider")
    public static Object[][] upperCaseStringProvider() {
        return new Object[][] {
                { "jAVa", "JAVA"},
                { "A String variable contains a collection of characters surrounded by double quotes",
                  "A STRING VARIABLE CONTAINS A COLLECTION OF CHARACTERS SURROUNDED BY DOUBLE QUOTES" },
                { "TeSt HOme tAsK", "TEST HOME TASK"}
        };
    }

    @DataProvider(name = "lowerCaseStringProvider")
    public static Object[][] lowerCaseStringProvider() {
        return new Object[][] {
                { "JAVa", "java"},
                { "A StrInG variable ContainS a collection oF chaTactErs surRoundEd by dOuBle quotEs",
                  "a string variable contains a collection of chatacters surrounded by double quotes" },
                { "TeSt HOme tAsK", "test home task"}
        };
    }

    @DataProvider(name = "sentenceProvider")
    public static Object[][] sentenceProvider() {
        return new Object[][] {
                { "hello java!", "Hello java!"},
                { "a String in Java is actually an object, which contain methods that can perform certain operations on strings." +
                        " for example, the length of a string can be found with the length() method",
                  "A String in Java is actually an object, which contain methods that can perform certain operations on strings." +
                        " For example, the length of a string can be found with the length() method"},
                { "string is a sequence of characters. in java, objects of String are immutable which means a constant and cannot be changed once created.",
                   "String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created." },
                { "hello students. i am your teacher.", "Hello students. I am your teacher."}
        };
    }

    @DataProvider(name = "sentenceProviderForEachLetter")
    public static Object[][] sentenceProviderForEachLetter() {
        return new Object[][] {
                { "hello java!", "Hello Java!"},
                { "string is a sequence of characters.", "String Is A Sequence Of Characters." },
                { "hello students. i am your teacher.", "Hello Students. I Am Your Teacher."}
        };
    }
}
