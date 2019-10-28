package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {


    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";

        double D = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            result = "The 'a' coefficient should not be zero!";
        } else if (D < 0) {
            result = "No roots on the set of real numbers!";
        } else if (D == 0) {
            double x1 = -b / 2 * a;
            result = "Two real, identical roots: [x1 && x2] = " + x1;
        } else {
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            result = "Discriminant: " + D + ", x1: " + x1 + ", x2: " + x2;
        }

        return result;
    }

}
