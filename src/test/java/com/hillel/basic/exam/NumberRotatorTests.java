package com.hillel.basic.exam;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberRotatorTests {

    @Test(dataProvider = "numberProvider")
    public void numberRotatorTest(long actual, long expected) {
        assertEquals(NumberRotator.rotate(actual), expected);
    }

    @DataProvider(name = "numberProvider")
    public static Object[][] numberProvider() {
        return new Object[][] {
                { 38458215, 85821534},
                { 195881031, 988103115},
                { 896219342, 962193428},
                { 69418307, 94183076}
        };
    }
}
