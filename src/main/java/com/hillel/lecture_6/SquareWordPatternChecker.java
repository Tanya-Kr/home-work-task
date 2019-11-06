package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = "";

        String  newWord = "";
        String allWords = "";
        for (int i = 0; i < word.length(); i++) {

            newWord = word.substring(1, word.length()).concat(word.substring(0, 1));
            allWords += word.concat(", ");
            word = newWord;
        }

        result = allWords.substring(0, allWords.length()-2);

        return result;
    }


}
