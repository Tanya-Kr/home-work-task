package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DayInWordChecker {

    @Step
    public String getDayIfElse(int number) {
        //        TODO implements result
        String result = "";

        if (number == 1) {
            result = "Monday";
        } else if (number == 2) {
            result = "Tuesday";
        } else if (number == 3) {
            result = "Wednesday";
        } else if (number == 4) {
            result = "Thursday";
        } else if (number == 5) {
            result = "Friday";
        } else if (number == 6) {
            result = "Saturday";
        } else if (number == 7) {
            result = "Sunday";
        } else {
            result = "Not a valid day";
        }

        return result;
    }

    @Step
    public String getDaySwitchCase(int number) {
        //        TODO implements result
        String result = "";

        switch (number) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Not a valid day";
                break;
        }

        return result;
    }
}
