package com.hillel.basic.exam;

/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */

public class NumberRotator {

    public static long rotate(long n) {

        String stringActual = Long.toString(n);
        String x = "";
        String maxValue = stringActual;

        for (int i = 0; i < stringActual.length(); i++) {
            x = stringActual.substring(0, i).concat(stringActual.substring(i+1).concat(stringActual.substring(i, i+1)));
            stringActual = x;

            if (Long.parseLong(maxValue) < Long.parseLong(x)) {
                maxValue = x;
            }
        }
<<<<<<< HEAD
        return Long.parseLong(x);
=======
        return Long.parseLong(maxValue);
>>>>>>> 3481c8de5a25a244e5d608c968337e75c3c8efa8
    }
}
