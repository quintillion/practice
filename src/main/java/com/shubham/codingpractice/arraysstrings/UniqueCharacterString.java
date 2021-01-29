package com.shubham.codingpractice.arraysstrings;

import java.util.HashSet;

/*
Solving http://nbviewer.ipython.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/unique_chars/unique_chars_challenge.ipynb
 */

public class UniqueCharacterString {

    public boolean hasUniqueCharacter(String input) {
        if(input == null)
            return false;

        if(input.length() == 0)
            return true;

        HashSet<Character> set = new HashSet<>();
        for(Character ch : input.toCharArray()) {
            if(set.contains(ch))
                return false;
            set.add(ch);
        }

        return true;
    }
}
