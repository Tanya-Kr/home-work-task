package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result;

        if (a != b && b != c && a != c) {
            if (a > b && a > c) {
                result = a;
            } else if (b > a && b > c) {
                result = b;
            } else {
                result = c;
            }
        } else  {
            result = 0;
        }

        return result;
    }

    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result;

        if (a != b && b != c && a != c) {
            if (a > b && a < c) {
                result = a;
            } else if (b > a && b < c) {
                result = b;
            } else {
                result = c;
            }
        } else  {
            result = 0;
        }

        return result;
    }

    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result;

        if (a != b && b != c && a != c) {
            if (a < b && a < c) {
                result = a;
            } else if (b < a && b < c) {
                result = b;
            } else {
                result = c;
            }
        } else  {
            result = 0;
        }

        return result;
    }
}
