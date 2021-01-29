package com.shubham.codingpractice.arraysstrings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleCharDifferenceTest {

    SingleCharDifference subject = new SingleCharDifference();

    @Test
    void testNull(){
        assertThrows(IllegalArgumentException.class, () -> subject.findDifferent(null, null));
    }

    @Test
    void testHappyCase(){
        String[][] input = {{"ab", "aab"}, {"aab", "ab"}, {"abcd", "abcde"}, {"aaabbcdd", "abdbacade"}};
        assertEquals('a', subject.findDifferent(input[0][0], input[0][1]));
        assertEquals('a', subject.findDifferent(input[1][0], input[1][1]));
        assertEquals('e', subject.findDifferent(input[2][0], input[2][1]));
        assertEquals('e', subject.findDifferent(input[3][0], input[3][1]));
    }

}
