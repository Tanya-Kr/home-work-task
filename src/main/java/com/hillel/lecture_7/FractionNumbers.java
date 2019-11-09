package com.hillel.lecture_7;
import io.qameta.allure.Step;

public class FractionNumbers {
    private double number1;
    private double number2;

    public FractionNumbers(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Step
    public double plus() {
        return this.number1 + this.number2;
    }

    @Step
    public double minus() {
        return this.number1 - this.number2;
    }

    @Step
    public double multiply() {
        return this.number1 * this.number2;
    }

    @Step
    public double divide() {
        return this.number1 / this.number2;
    }


    @Override
    public String toString() {
        return "FractionNumbers{" +
                "number1 = " + number1 +
                ", number2 = " + number2 +
                '}';
    }
}
