package com.hillel.lecture_6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
 * 1st part can contain only capital letters and 6 digits.
 * 2nd part is all digits and = the product of the
 * first 6 digits taken in groups of two from the left.
 * Eg 65*66*67 = 287430.
 */
public class ProductCodeValidationTestTask {

    private ProductCodeValidationChecker validationChecker = new ProductCodeValidationChecker();


    @Test(dataProvider = "codeProvider")
    public void productCodeValidationTestTest(String code, boolean expectedResult) {
        assertEquals(validationChecker.validateCode(code), expectedResult); ;
    }


    @DataProvider(name = "codeProvider")
    public static Object[][] codeProvider() {
        return new Object[][] {
                {"AX6BYU56UX6CV6BNT7NM 287430", true},
                {"AX7BYU16UX3CV1BNT7NM 913285", false},
                {"RW1BHU32UL5BV4BPT2NW 13650", true},
                {"AX6BYU56UX6CV6bNT7NM 287430", false},
        };
    }
}
