package com.shubham.codingpractice.arraysstrings;

/*
https://nbviewer.jupyter.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/reverse_string/reverse_string_challenge.ipynb
 */

public class StringReverse {
    char[] reverse(char[] input) {
        if(input == null)
            return input;
        for(int i=0; i < input.length  -1 -i; i++) {
            char temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        return input;
    }
}
