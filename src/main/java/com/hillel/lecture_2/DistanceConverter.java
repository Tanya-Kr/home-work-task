package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    @Step
    public double metersToInches(double meters) {
//        TODO implements result
        double result = meters * 39.37;
        return result;
    }

    @Step
    public double inchesToMeters(double inches) {
//        TODO implements result
        double result = inches / 39.37;
        return result;
    }

    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result
        double result = miles * 1.609;
        return result;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double result = kilometres / 1.609;
        return result;
    }
}
