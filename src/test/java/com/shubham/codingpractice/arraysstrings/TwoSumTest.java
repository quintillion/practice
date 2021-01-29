package com.shubham.codingpractice.arraysstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumTest {

    TwoSum subject = new TwoSum();

    @Test
    void testNull(){
        assertThrows(IllegalArgumentException.class, () -> subject.findIndices(null, 10));
    }

    @Test
    void testHappyCase(){
        assertArrayEquals(new int[]{2, 4}, subject.findIndices(new int[]{1,3,2,-7,5}, 7));
    }
}
