package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
        String result = "";

        char[] textToChars = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < textToChars.length; i++) {
            if (letter == textToChars[i]) {
                counter++;
            }
        }
        result = "Character '" + letter + "' repeated "+ counter +" times";
        return result;
    }
}
