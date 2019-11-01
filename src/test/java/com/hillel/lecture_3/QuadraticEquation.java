package com.hillel.lecture_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая бы решала квадратное уравнение вида a x2+b x+c = 0
 * Переменный a, b, c можно задать вручную. Программа должна учитывать варианты:
 * 1) когда a=0
 * 2) когда дискриминант < 0 - решений нет
 * 3) когда дискриминант = 0 - тогда х1 == х2
 * 4) когда дискриминант > 0 - тогда в уравнении два корня
 */

public class QuadraticEquation {

    private QuadraticEquationChecker quadraticEquationChecker = new QuadraticEquationChecker();

    @Test(dataProvider = "dataProvider")
    public void checkQuadraticEquation(double a, double b, double c, double discriminant, double x1, double x2) {
        String expected = String.format("Discriminant: %s, x1: %s, x2: %s", discriminant, x1, x2);

        assertEquals(quadraticEquationChecker.checkQuadraticEquation(a, b, c), expected) ;
    }

    @Test
    public void checkQuadraticEquationWithZeroCoefficient() {
        int a = 0;
        int b = 30;
        int c = 12;

        assertEquals(quadraticEquationChecker.checkQuadraticEquation(a, b, c), "The 'a' coefficient should not be zero!") ;
    }

    @Test
    public void checkQuadraticEquationThenDiscriminantLessThenZero() {
        int a = 10;
        int b = 10;
        int c = 12;

        assertEquals(quadraticEquationChecker.checkQuadraticEquation(a, b, c), "No roots on the set of real numbers!") ;
    }

    @Test
    public void checkQuadraticEquationThenDiscriminantEqualsZero() {
        int a = 9;
        int b = 12;
        int c = 4;

        assertEquals(quadraticEquationChecker.checkQuadraticEquation(a, b, c), "Two real, identical roots: [x1 && x2] = -0.6666666666666666") ;
    }

    @DataProvider(name = "dataProvider")
    public static Object[][] dataProvider() {
        return new Object[][] {
                { 1, 5, 2, 17.0, -0.4384471871911697, -4.561552812808831},
                { 2, 10, 5, 60.0, -0.5635083268962915, -4.436491673103708},
                { 5, 30, 12, 660.0, -0.4309534842669741, -5.569046515733026},
        };
    }
}
