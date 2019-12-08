package com.hillel.basic.exam;

/**
 * Description:
 * We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
 * 0 1 3 6 10 15 21 28 36 45 55 ....
 * which is created by
 * 0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..
 * <p>
 * Input: LastNumber
 * Output: series and result
 * <p>
 * Example:
 * <p>
 * Input: 6
 * Output: 0+1+2+3+4+5+6 = 21
 * <p>
 * Input: -15
 * Output: -15 < 0
 * <p>
 * Input: = 0
 * Output: 0 = 0
 */

public class SequenceSum {

    public static String showSequence(int value) {

        int sum = 0;
        String result = "";
        if (value > 0) {

            for (int i = 0; i <= value; i++) {
                sum += i;
                String res = Integer.toString(i);

                if (i < value) {
                    result = result.concat(res + "+");

                } else {
                    result = result.concat(res + " = " + sum);
                }
            }
        } else if (value == 0) {
            result = "0 = 0";

        } else {
            result = value + " < 0";
        }

        return result;

//        if (value == 0) {
//            return "0 = 0";
//        }
//        if (value < 0) {
//            return value + " < 0";
//        }
//        String s = "";
////        int sum = 0;
//        for (int i = 0; i <= value; i++){
//            s = s + i + "+";
//            sum = sum + i;
//        }
//        return s.substring(0,s.length()-1) + " = " + sum;
    }
}
