package com.shubham.codingpractice.arraysstrings;
/*
http://nbviewer.ipython.org/github/donnemartin/interactive-coding-challenges/blob/master/arrays_strings/hash_map/hash_map_challenge.ipynb
 */

import java.util.ArrayList;

public class HashTable {
    class Node{
        int key;
        int value;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private int bucketSize = 16;
    private ArrayList<Node> list = new ArrayList<>(bucketSize);


    Integer insert(int key, int value){
        int index = key % bucketSize;
        while(list.size() <= index){
            list.add(null);
        }
        Node curNode = list.get(index);
        while(curNode != null && curNode.key!=key)
            curNode = curNode.next;
        Integer previousValue = null;
        if(curNode == null){
            curNode = new Node(key, value);
            curNode.next = list.get(index);
            list.set(index, curNode);
        } else{
            previousValue = curNode.value;
            curNode.value = value;
        }
        return previousValue;
    }

    Integer get(int key){
        int index = key % bucketSize;
        while(list.size() <= index)
            list.add(null);
        Node curNode = list.get(index);
        while(curNode != null){
            if(curNode.key == key)
                return curNode.value;
            curNode = curNode.next;
        }
        return null;
    }

    boolean remove(int key){
        int index = key % bucketSize;
        while(list.size() <= index)
            list.add(null);
        Node curNode = list.get(index);
        if(curNode == null)
            return false;
        if(curNode.key == key){
            list.set(index, curNode.next);
        } else {
            while(curNode.next != null && curNode.next.key != key){
                curNode = curNode.next;
            }
            if(curNode.next == null)
                return false;
            curNode.next = curNode.next.next;
        }
        return true;
    }


}
