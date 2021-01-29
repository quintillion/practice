package com.shubham.codingpractice.arraysstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {
    Anagram subject = new Anagram();

    @Test
    void testNull(){
        assertFalse(subject.areAnagram(null, null));
        assertFalse(subject.areAnagram(null, "some"));
        assertFalse(subject.areAnagram("some", null));
    }

    @Test
    void testEmpty(){
        assertTrue(subject.areAnagram("", ""));
        assertFalse(subject.areAnagram("", "some"));
    }

    @Test
    void testAnagramWithSpacesAndDuplicates(){
        String first = "ab ca";
        String second = "cb aa";
        assertTrue(subject.areAnagram(first, second));
    }

    @Test
    void testAnagramWithCaseSensitive(){
        String first = "Ab ca";
        String second = "cb aa";
        assertFalse(subject.areAnagram(first, second));
    }

    @Test
    void testNotAnagrams(){
        String first = "abcd";
        String second = "abce";
        assertFalse(subject.areAnagram(first, second));
    }
}
