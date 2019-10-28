package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    public String checkNumberInInterval(int from, int to, int number) {

        String result = "";

        if (number >= from && number <= to) {
            result = "Number "+ number +" belong to interval [" + from + ";" + to + "]";
        } else {
            result = "Number "+ number +" not belong to interval [" + from + ";" + to + "]";
        }

        return result;
    }
}
