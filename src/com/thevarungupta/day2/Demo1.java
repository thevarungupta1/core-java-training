package com.thevarungupta.day2;

/**
 * String
 * represent a sequence of character or an array of character
 *
 * There are 2 ways we can create sting in java
 * 1. using new keyword
 * 2. using string literal
 *
 * String are immutable which means once string object created its data cannot be changed but a new string object is created
 *
 *
 * */
public class Demo1 {
    public static void main(String[] args) {

//        char[] ch = {'a','b', 'c', 'd'};
//        String str = new String(ch);
//
//        // String literal
//        String str2 = "Some name";
//        str2 = "some other name";

        String name = "Mark";
        name = name.concat("Smith");
        System.out.println(name);


    }
}
