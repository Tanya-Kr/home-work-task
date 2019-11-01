package com.hillel.lecture_4;

public class GeneralMethods {
    public static void main(String[] args) {

//        double result = 26d + 273.16;
//        System.out.println("Celsius to Kelvin" + result);
        celsiusToKelvin(10d);
        celsiusToKelvin(20d);

        double kilometers = meterToKilometers(100d);
        String message = distanceCompare(kilometers);

        System.out.println(message);


    }

    public static void celsiusToKelvin(double cesius) {
        double result = cesius + 273.16;
        System.out.println("Celsius to Kelvin " + result);
    }

    public static double meterToKilometers(double meters) {
        double result = meters / 1000d;
        System.out.println("Meters to kilometrs " + result);

        return result;
    }

    public static String distanceCompare(double kilometers) {
        String message = "";

        if (kilometers > 0.7) {
            message = "Correct distance!";
        } else if (kilometers < 0.5) {
            message = "Excellent distance!";
        } else {
            message = "Bad distance!";
        }
        return message;
    }

}

