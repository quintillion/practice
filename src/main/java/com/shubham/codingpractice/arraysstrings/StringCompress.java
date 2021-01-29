package com.shubham.codingpractice.arraysstrings;

import com.sun.tools.internal.xjc.reader.xmlschema.BindPurple;

/*
https://nbviewer.jupyter.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/compress/compress_challenge.ipynb
 */
public class StringCompress {
    String compress(String input) {
        if(input == null)
            return input;

        StringBuilder sb =  new StringBuilder();

        int index = 0;
        while(index < input.length()){
            Character cur = input.charAt(index);
            int count = 0;
            while(index < input.length() && cur.equals(input.charAt(index))){
                count++;
                index++;
            }

            sb.append(cur);
            if(count != 1)
                sb.append(count);
        }

        return sb.toString();
    }
}
