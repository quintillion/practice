package com.shubham.codingpractice.arraysstrings;

/*
http://nbviewer.ipython.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/str_diff/str_diff_challenge.ipynb
 */

import java.util.HashMap;
import java.util.Map;

public class SingleCharDifference {
    char findDifferent(String first, String second) {
        if(first == null || second == null)
            throw new IllegalArgumentException();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : first.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : second.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1 || entry.getValue() == -1)
                return entry.getKey();
        }
        throw new RuntimeException();
    }
}
