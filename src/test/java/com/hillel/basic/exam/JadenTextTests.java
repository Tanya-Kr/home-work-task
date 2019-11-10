package com.hillel.basic.exam;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class JadenTextTests {

    private JadenCase jadenCase = new JadenCase();

    @Test
    public void testText() {
        assertEquals(jadenCase.toJadenCase("most trees are blue"), "Most Trees Are Blue", "toJadenCase doesn't return a valide JadenCase String! try again please :)");
    }

    @Test
    public void testNullArg() {
        assertNull(jadenCase.toJadenCase(null), "Must return null when the arg is null");
    }

    @Test
    public void testEmptyArg() {
        assertNull(jadenCase.toJadenCase(""), "Must return null when the arg is null");
    }
}
