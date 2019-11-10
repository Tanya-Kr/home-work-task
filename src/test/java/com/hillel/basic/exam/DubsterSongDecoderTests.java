package com.hillel.basic.exam;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DubsterSongDecoderTests {

    @Test(dataProvider = "songProvider")
    public void songDecoderTet(String actual, String expected) {
        assertEquals(Dubster.songDecoder(actual), expected);
    }

    @DataProvider(name = "songProvider")
    public static Object[][] songProvider() {
        return new Object[][] {
                { "WUBWUBABCWUB", "ABC"},
                { "RWUBWUBWUBLWUB", "R L"},
                { "WUBWUBWUB", ""}
        };
    }
}
