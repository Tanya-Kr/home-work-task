package com.hillel.lecture_4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая выводит все числа Фибоначчи до заданного числа
 */
public class FibonacciNumbersTestTask {

    private FibonacciNumbersChecker fibonacciNumbersChecker = new FibonacciNumbersChecker();

    @Test
    public void fromDecimalToHexadecimalTest() {
        int[] expectedResult = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181 };

        assertEquals(fibonacciNumbersChecker.getFibonacciNumbers(20), expectedResult) ;
    }
}
