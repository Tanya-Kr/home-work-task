package com.hillel.lecture_14;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysTestTask {

    private ArraysChecker arraysChecker = new ArraysChecker();

    @Test
    public void checkReversDataTest() {
        List<String> data = Arrays.asList("one", "two", "three", "four", "five");
        List<String> result = Arrays.asList("five", "four", "three", "two", "one");

        assertEquals(arraysChecker.getReversList(data), result);
    }

    @Test
    public void checkLongestString() {
        List<String> data = Arrays.asList("Iron Man", "Captain America", "Spider-man", "Star Lord", "Thor");
        String result = "Captain America";

        assertEquals(arraysChecker.getLongestString(data), result);
    }

    @Test
    public void changeIndexTest() {
        List<String> data = Arrays.asList("Iron Man", "Captain America", "Spider-man", "Star Lord", "Thor");
        List<String> result = Arrays.asList("Iron Man", "Star Lord", "Spider-man", "Captain America", "Thor");

        assertEquals(arraysChecker.changeIndex(data), result);
    }

    @Test
    public void removeDuplicatesTest() {
        List<String> data = Arrays.asList("Iron Man", "Captain America", "Iron Man", "Spider-man", "Thor", "Star Lord",
                "Star Lord", "Thor");
        List<String> result = Arrays.asList("Iron Man", "Star Lord", "Spider-man", "Captain America", "Thor");

        assertEquals(arraysChecker.removeDuplicates(data), result);
    }

    @Test
    public void sortingTest() {
        List<String> data = Arrays.asList("ab", "a", "abcde", "abc", "abcd");
        List<String> result = Arrays.asList("a", "ab", "abc", "abcd", "abcde");

        assertEquals(arraysChecker.sortList(data), result);
    }

}
