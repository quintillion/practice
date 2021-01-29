package com.shubham.codingpractice.arraysstrings;

/*
https://nbviewer.jupyter.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/permutation/permutation_challenge.ipynb
 */

import java.util.HashMap;

public class Anagram {

    public boolean areAnagram(String first, String second) {
        if(first == null || second == null)
            return true;

        if(first.length() !=  second.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character ch : first.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character ch : second.toCharArray()) {
            if(!map.containsKey(ch))
                return false;
            map.put(ch, map.get(ch) - 1);
            if(map.get(ch) == 0)
                map.remove(ch);
        }
        return true;
    }
}
