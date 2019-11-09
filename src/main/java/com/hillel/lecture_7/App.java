package com.hillel.lecture_7;

public class App {
    public static void main(String[] args) {
        FractionNumbers numbers = new FractionNumbers(25, 12);

        System.out.println(numbers);

        double plus = numbers.plus();
        System.out.println("numbers.plus - " + plus);

        double minus = numbers.minus();
        System.out.println("numbers.minus - " + minus);

        double multiply = numbers.multiply();
        System.out.println("numbers.multiply - " + multiply);

        double divide = numbers.divide();
        System.out.println("numbers.divide - " + divide);

    }
}
