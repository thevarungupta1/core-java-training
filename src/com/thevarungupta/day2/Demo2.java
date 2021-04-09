package com.thevarungupta.day2;


/**
 * Arrays
 *
 * It is an collection of similar type of data or element which has continous memoery location
 *
 * Type of Array
 * 1. Single Dimensional
 * 2. Multi Dimensional
 *
 * <datatype>[] <array_name> = new <datatype>[size]
 *
 * */

public class Demo2 {
    public static void main(String[] args) {
        // 10,20,30,40,50
//        int a = 10;
//        int b = 20;
//        int c = 30;

        // declaration
        int[] a;
        int []b;
        int c[];

        //declaration and initialialization
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        for(int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }

        // declaration, instantiate, initialize
        int[] numbers = { 50, 60, 70, 80 };

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        for(int number: numbers){
            System.out.println(number);
        }

        System.out.println(numbers[1]);

        //  ArrayIndexOutOfBound
        int arr2[] = { 50, 60, 70 };
        System.out.println(arr2[3]);

        // Multi


    }
}
