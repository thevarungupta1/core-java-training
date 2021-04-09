package com.thevarungupta.day1;

import com.sun.security.jgss.GSSUtil;

/**
 * Conditional Statement
 * If
 * if else
 * if else if
 * nested if
 * switch
 *
 * we can use if statement when you want to execute a block of code conditionaly
 * */

public class Demo4 {
    public static void main(String[] args) {
        if(false){
            System.out.println("If");
        }else{
            System.out.println("else");
        }

        /**
         * if-else
         * */
        int age = 21;
        if(age > 20){
            System.out.println("Eligible for voting");
        }else{
            System.out.println("Not Eligible for voting");
        }

        /**
         * turnery
         * */
        int number = 10;
        if(number%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        System.out.println((number%2==0?"even": "odd"));


        /**
        if-esle-if
        * */
        int marks = 40;
        if(marks < 50){
            System.out.println("D grade");
        }
        else if(marks>=50 && marks <70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks <90){
            System.out.println("B grade");
        }
        else if(marks>=90 && marks <100){
            System.out.println("A grade");
        }
        else{
            System.out.println("Fail");
        }

        /**
         * nested if-else
         * */
        int num1 = 50;
        int num2 = 20;
        if(num1>=10){
            if(num2>=20){
                System.out.println("a and b are greater");
            }else{
                System.out.println();
            }
        }else{

        }

    }
}
