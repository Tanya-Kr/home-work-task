package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class LetterRemovalChecker {


    @Step
    public String removeLetter(String sentence, String letterFoRemove) {

//        TODO implements result
        String result = "";

        char[] chars = sentence.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            String charToRemove = String.valueOf(chars[i]);
            if (letterFoRemove.equals(charToRemove)) {
                sentence = sentence.replaceAll(charToRemove,"");
            }
        }
        result = sentence;
        return result;
    }
}
