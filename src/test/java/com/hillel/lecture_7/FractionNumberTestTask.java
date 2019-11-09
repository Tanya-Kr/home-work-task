package com.hillel.lecture_7;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FractionNumberTestTask {

    private FractionNumbers numbers = new FractionNumbers(22, 2);

    @Test
    public void numbersPlusTest() {
        double expectedResult = 24;

        assertEquals(numbers.plus(), expectedResult) ;
    }

    @Test
    public void numbersMinusTest() {
        double expectedResult = 20;

        assertEquals(numbers.minus(), expectedResult) ;
    }

    @Test
    public void numbersMultiplyTest() {
        double expectedResult = 44;

        assertEquals(numbers.multiply(), expectedResult) ;
    }

    @Test
    public void numbersDivideTest() {
        double expectedResult = 11;

        assertEquals(numbers.divide(), expectedResult) ;
    }

}
