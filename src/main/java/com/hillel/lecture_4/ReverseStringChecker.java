package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
//        String result = "";

        char[] charArray = value.toCharArray();
        char a;
        for (int i = 0; i < charArray.length / 2; i++) {
            a = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = a;
        }

        String result = new String(charArray);

        return result;
    }

}
