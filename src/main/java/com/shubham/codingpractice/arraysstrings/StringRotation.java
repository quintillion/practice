package com.shubham.codingpractice.arraysstrings;

/*
https://nbviewer.jupyter.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/rotation/rotation_challenge.ipynb
 */

public class StringRotation {
    boolean areStringRotated(String first, String second) {
        if(first == null || second == null)
            return false;

        if(first.length() != second.length())
            return false;
        return first.concat(first).contains(second);
    }
}
