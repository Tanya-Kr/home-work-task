package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result = new int[number];

        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        int n3;
        result[0] = n0;
        result[1] = n1;
        for (int i = 2; i < number; i++) {
            n3 = n1 + n2;
            result[i] = n2;
            n1 = n2;
            n2 = n3;
        }
        return result;
    }

}
