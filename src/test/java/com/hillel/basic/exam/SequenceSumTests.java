package com.hillel.basic.exam;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SequenceSumTests {

    @Test(dataProvider = "sequenceProvider")
    public void testBasic(int actual, String result) {
        assertEquals(SequenceSum.showSequence(actual), result);
    }

    @DataProvider(name = "sequenceProvider")
    public static Object[][] sequenceProvider() {
        return new Object[][] {
                { 6, "0+1+2+3+4+5+6 = 21"},
                { 10, "0+1+2+3+4+5+6+7+8+9+10 = 55"}
        };
    }
}
