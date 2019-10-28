package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая бы решала уравнение вида a x + b = 0
 * Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести
 * значение “х”. Программа должна также учитывать варианты, когда или а = 0 или b = 0
 */

public class LinearEquationTest {

    private LinearEquationChecker linearEquationChecker = new LinearEquationChecker();

    @Test
    public void linearEquationTest() {
        int a = 4;
        int b = 10;

        assertEquals(linearEquationChecker.linearEquation(a, b), -2);
    }

    @Test
    public void linearEquationThenAIsZeroTest() {
        int a = 0;
        int b = 10;

        assertEquals(linearEquationChecker.linearEquation(a, b), 0);
    }

    @Test
    public void linearEquationThenBIsZeroTest() {
        int a = 4;
        int b = 0;

        assertEquals(linearEquationChecker.linearEquation(a, b), 0);
    }
}
