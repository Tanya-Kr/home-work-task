package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    public int linearEquation(int a, int b) {

//        TODO implements result
        int result;

        if (a == 0) {
            result = 0;
        } else if (b == 0) {
            result = 0;
        } else {
            result = - b / a;
        }

        return result;
    }
}
