package com.thevarungupta;

/**
 * Loops: are used to execute a set of statement or instruction repeatedly when condition is true
 * Type of loops
 * 1. for
 * 2. while
 * 3. do-while
 *
 * */
public class Demo6 {
    public static void main(String[] args) {

        /**
         * for(initialization; condition: incrementor / decrementor)
         *
         * */
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        /**
         * nested for loop
         * */
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(i +" - "+j);
            }
        }
        /**
         * Pyramid
         * */
        for(int i=0;i<5;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
