package com.hillel.lecture_4;

public class JavaMethods {
    public static void main(String[] args) {
        celsiusToKelvin(10d);
        celsiusToKelvin(20);
        celsiusToKelvin(100d,40d);
    }
    public static void celsiusToKelvin(int cesius) {
        double result = cesius + 273.16;
        System.out.println("Celsius to Kelvin " + result);
    }


    public static void celsiusToKelvin(double cesius) {
        double result = cesius + 273.16;
        System.out.println("Celsius to Kelvin " + result);
    }

    public static void celsiusToKelvin(double cesius, double kelvin) {
        double result = cesius + kelvin;
        System.out.println("Celsius to Kelvin " + result);
    }
}
