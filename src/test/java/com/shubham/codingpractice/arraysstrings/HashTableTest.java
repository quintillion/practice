package com.shubham.codingpractice.arraysstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {


    @Test
    void testInsertKeyNotPresent(){
        HashTable subject = new HashTable();
        int key = 5, value = 25;
        assertNull(subject.insert(key, value));
        assertEquals(value, subject.get(key));
    }

    @Test
    void testInsertKeyPresent(){
        HashTable subject = new HashTable();
        int key = 5, value = 25, newValue = 700;
        subject.insert(key, value);
        assertEquals(value, subject.insert(key, newValue));
        assertEquals(newValue, subject.get(key));
    }

    @Test
    void testGetKeyNotPresent(){
        HashTable subject = new HashTable();
        int key = 5;
        assertNull(subject.get(key));
    }

    @Test
    void testGetKeyPresent(){
        HashTable subject = new HashTable();
        int key = 5, value = 25;
        assertNull(subject.get(key));
        subject.insert(key, value);
        assertEquals(value, subject.get(key));
    }

    @Test
    void testRemoveKeyNotPresent(){
        HashTable subject = new HashTable();
        int key = 5;
        assertFalse(subject.remove(key));
    }

    @Test
    void testRemoveKeyPresent(){
        HashTable subject = new HashTable();
        int key = 5, value = 25;
        assertFalse(subject.remove(key));
        subject.insert(key, value);
        assertTrue(subject.remove(key));
    }

}
