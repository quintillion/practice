package com.shubham.codingpractice.arraysstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringRotationTest {
    StringRotation subject = new StringRotation();

    @Test
    void testNull(){
        assertFalse(subject.areStringRotated(null, null));
    }

    @Test
    void testUnequalLength(){
        assertFalse(subject.areStringRotated("abcd", "abcdw"));
    }

    @Test
    void testValidRotation() {
        String[][] input = {{"hamshub", "shubham"}, {"foobarbaz", "barbazfoo"}};
        assertTrue(subject.areStringRotated(input[0][0], input[0][1]));
        assertTrue(subject.areStringRotated(input[1][0], input[1][1]));
    }
}
