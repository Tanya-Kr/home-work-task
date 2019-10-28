package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class NumberInWordChecker {

    public String getNumberIfElse(int number) {
        //        TODO implements result
        String result = "";

        if (number == 1) {
            result = "ONE";
        } else if (number == 2) {
            result = "TWO";
        } else if (number == 3) {
            result = "THREE";
        } else if (number == 4) {
            result = "FOUR";
        } else if (number == 5) {
            result = "FIVE";
        } else if (number == 6) {
            result = "SIX";
        } else if (number == 7) {
            result = "SEVEN";
        } else if (number == 8) {
            result = "EIGHT";
        } else if (number == 9) {
            result = "NINE";
        } else {
            result = "OTHER";
        }

        return result;
    }

    public String getNumberSwitchCase(int number) {
        //        TODO implements result
        String result = "";

        switch (number) {
            case 1:
                result = "ONE";
                break;
            case 2:
                result = "TWO";
                break;
            case 3:
                result = "THREE";
                break;
            case 4:
                result = "FOUR";
                break;
            case 5:
                result = "FIVE";
                break;
            case 6:
                result = "SIX";
                break;
            case 7:
                result = "SEVEN";
                break;
            case 8:
                result = "EIGHT";
                break;
            case 9:
                result = "NINE";
                break;
            default:
                result = "OTHER";
                break;
        }

        return result;
    }
}
