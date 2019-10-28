package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Определить, является ли число а делителем числа b
 */

public class DivisorTest {

    private DivisorChecker divisorChecker = new DivisorChecker();

    @Test
    public void checkThatNumberIsDivisor() {
        int number = 2;
        int divisor = 10;

        assertEquals(divisorChecker.checkDivisor(divisor, number), "The number 2 is divisor of the number 10");
    }

    @Test
    public void checkThatNumberIsNotDivisor() {
        int number = 7;
        int divisor = 50;

        assertEquals(divisorChecker.checkDivisor(divisor, number), "The number 7 is not divisor of the number 50");
    }
}
