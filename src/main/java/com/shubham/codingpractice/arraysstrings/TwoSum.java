package com.shubham.codingpractice.arraysstrings;

/*
http://nbviewer.ipython.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/two_sum/two_sum_challenge.ipynb
 */

import java.util.*;

public class TwoSum {
    int[] findIndices(int[] input, int sum){
        if(input == null || input.length == 0)
            throw new IllegalArgumentException();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<input.length; i++){
            if(map.containsKey(sum - input[i]))
                return new int[]{map.get(sum - input[i]), i};
            map.put(input[i], i);
        }

        throw new RuntimeException();
    }
}
