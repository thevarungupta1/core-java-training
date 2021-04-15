package com.thevarungupta.day5;

public class Demo5 {
    public static void main(String[] args) {
       try{
        print1();
       }catch (StackOverflowError ex){

       }
    }

    public static void print1(){
        print2();
    }

    public static void print2(){
        print1();
    }
}
