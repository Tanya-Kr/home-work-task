package com.hillel.lecture_10.task_2;

public class FinancialCalculation extends AbstractCalculation {
    @Override
    public void calculate() {
        System.out.println("Calculate using financial calculator");
    }

    public int factorial(int x) {

        int i = 1;
        int factorial = 1;
        while (i <= x){
            factorial *= i;
        }

        return factorial;
    }

    public double numberFix(double x, double y){
        x = x * y;
        int i = (int) Math.round(x);
        x = (double)i / y;

        return x;
    }
}
