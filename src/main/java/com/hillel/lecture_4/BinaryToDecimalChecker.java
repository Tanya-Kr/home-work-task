package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;

        String j = "";
        while (value != 0) {

            int i = value % 2;
            value = value / 2;

            j = i + j;
        }

        result = Integer.parseInt(j);

        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;

        String valueString = Integer.toString(value);
        char[] chars = valueString.toCharArray();
        int res = 0;
        int calc = 1;
        for (int i = valueString.length()-1; i >= 0; i--) {
            if (chars[i]=='1') {
                res += calc;
            }
            calc*=2;
        }
        result = res;

        return result;
    }
}
