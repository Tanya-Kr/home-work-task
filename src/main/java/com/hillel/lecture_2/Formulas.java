package com.hillel.lecture_2;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    public double calculate9Formula(double x) {
        double result = Math.pow(1.1 * Math.E, -x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x)) - 3.0 / 8.0);
//        TODO implement formula 9
        return result;
    }

    public double calculate10Formula(double x) {
        double result = 1.0 / 3.0 * Math.sqrt(Math.abs(Math.sin(x))) * Math.cbrt(Math.pow(Math.E, 0.12 * x));
//        TODO implement formula 10
        return result;
    }

    public double calculate11Formula(double x) {
        double result = 2 * Math.PI * x - Math.abs(Math.sin(Math.sqrt(10.5 * x))) * 1.0 / (Math.cbrt(Math.pow(x,2)) + 1.0 / 7.0);
//        TODO implement formula 11
        return result;
    }

    public double calculate12Formula(double x) {
        double result = Math.log(Math.sqrt(Math.abs(2 - x)) + 1.2) * 1 / (2 + Math.pow(Math.E, -x)) + Math.cbrt(2 / x);
//        TODO implement formula 12
        return result;
    }

    public double calculate13Formula(double x) {
        double result = Math.pow(Math.pow(Math.E, -2 + x), 1.0 / 5.0) * 1 / Math.sqrt(Math.pow(x, 2) + Math.pow(x, 4) + Math.log(Math.abs(x - 3.14)));
//        TODO implement formula 13
        return result;
    }
}
