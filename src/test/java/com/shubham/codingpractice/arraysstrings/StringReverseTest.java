package com.shubham.codingpractice.arraysstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverseTest {

    StringReverse subject = new StringReverse();

    @Test
    void testNull() {
        assertNull(subject.reverse(null));
    }

    @Test
    void testBlank() {
        assertNotNull(subject.reverse(new char[]{}));
        assertEquals(0, subject.reverse(new char[]{}).length);
    }

    @Test
    void testHappyCase(){
        char[] input = {'f', 'o', 'o', ' ', 'b', 'a', 'r'};
        char[]  expected = {'r', 'a', 'b', ' ', 'o', 'o', 'f'};
        assertArrayEquals(expected, subject.reverse(input));
    }

}
