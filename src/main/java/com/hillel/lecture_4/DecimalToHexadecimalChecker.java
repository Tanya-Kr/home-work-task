package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";
        String hex= "";
        int rem;

        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(value > 0) {
            rem = value % 16;
            hex = hexchars[rem] + hex;
            value = value / 16;
        }

        result = hex;

        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        int result = 0;
        String digits = "0123456789ABCDEF";
        int data = 0;
        value = value.toUpperCase();

        for (int i = 0; i < value.length(); i++) {

            char v = value.charAt(i);
            int d = digits.indexOf(v);
            data = 16 * data + d;
        }

        result = data;

        return result;
    }
}
