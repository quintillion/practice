package com.shubham.codingpractice.arraysstrings;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class StringCompressTest {
    StringCompress subject = new StringCompress();

    @Test
    void testNull(){
        assertNull(subject.compress(null));
    }

    @Test
    void testBlank(){
        assertEquals("", subject.compress(""));
    }

    @Test
    void testHappyCase(){
        assertEquals("A2B2C2c", subject.compress("AABBCCc"));
        assertEquals("A3BA2C2D4", subject.compress("AAABAACCDDDD"));
    }
}
