package com.shubham.codingpractice.arraysstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    FizzBuzz subject = new FizzBuzz();

    @Test
    void testInvalidNumber(){
        assertThrows(IllegalArgumentException.class, () -> subject.process(0));
    }

    @Test
    void testValidNumber(){
        String[] expectedOutput = {"1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"};
        assertArrayEquals(expectedOutput, subject.process(15));
    }

}

