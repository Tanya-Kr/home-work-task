package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = false;

        char[] charArray = value.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }

        return result;
    }

}
