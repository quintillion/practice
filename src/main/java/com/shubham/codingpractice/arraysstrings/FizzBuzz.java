package com.shubham.codingpractice.arraysstrings;
/*
http://nbviewer.ipython.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/fizz_buzz/fizz_buzz_challenge.ipynb
 */

public class FizzBuzz {
    String[] process(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        String[] result = new String[n];
        for(int i=1; i<=n; i++){
            if(i%15 == 0)
                result[i-1] = "FizzBuzz";
            else if(i%3 == 0)
                result[i-1] = "Fizz";
            else if(i%5 == 0)
                result[i-1] = "Buzz";
            else
                result[i-1] = String.valueOf(i);
        }
        return result;
    }
}
