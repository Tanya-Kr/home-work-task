package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;

        String code1 = code.substring(0, code.indexOf(" "));
        String code2 = code.substring(code.indexOf(" ")+1);

        int leng = code1.length();
        char[] code1Chars = code1.toCharArray();

        String[] numbers = new String[6];
        int counter = 0;
        int index = 0;

        for (int i = 0; i < code1Chars.length; i++) {
            if (Character.isDigit(code1Chars[i])) {
                numbers[index] = Character.toString(code1Chars[i]);
                index++;
                counter += 1;
            }
        }

        if (counter < 6) {
            isValid = false;
        }

        int[] results = new int [6];
        int res = 1;
        for (int i = 0; i < numbers.length ; i++) {
            if (i % 2 != 0) {
                String str = numbers[i-1] + numbers[i];
                int number = Integer.parseInt(str);
                res = res * number;
            }
        }

        if (res == Integer.parseInt(code2)) {
            isValid = true;
        }

        return isValid;
    }
}
