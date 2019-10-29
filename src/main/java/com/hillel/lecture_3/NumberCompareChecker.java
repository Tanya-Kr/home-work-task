package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberCompareChecker {

    @Step
    public String getGreatestNumber(int a, int b) {

//        TODO implements result
        String result = "";

        if (a > b) {
            result = "Number " + a + " has greatest value!";
        } else if (a < b) {
            result = "Number " + b + " has greatest value!";
        } else {
            result = "Numbers " + a + " and " + b + " are equals!";
        }

        return result;
    }
}
