package com.hillel.lecture_4;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {


    public int getValue(int[] values) {

//        TODO implements result
        int result = 0;

        int x = values[0];
        for (int i = 1; i < values.length; i++ ) {

            if (x > values[i]) {
                x = values[i];
                i++;
            }
        }
        result = x;

        return result;
    }

}
