package com.shubham.codingpractice.arraysstrings;

import com.shubham.codingpractice.arraysstrings.UniqueCharacterString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Solving http://nbviewer.ipython.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/unique_chars/unique_chars_challenge.ipynb
 */

public class UniqueCharacterStringTest {

    UniqueCharacterString subject = new UniqueCharacterString();

    @Test
    public void testNullString() {
        assertFalse(subject.hasUniqueCharacter(null));
    }

    @Test
    public void testBlankString() {
        assertTrue(subject.hasUniqueCharacter(""));
    }

    @Test
    public void testNonEmptyStringWithRepeating() {
        String input = "meenakshi";
        assertFalse(subject.hasUniqueCharacter(input));
    }

    @Test
    public void testNonEmptyStringNoRepetition() {
        String input = "shital";
        assertTrue(subject.hasUniqueCharacter(input));
    }




}
