package com.thevarungupta;

/**
 * switch
 * it is use to execute one statement for multiple conditions
 *
 * */
public class Demo5 {
    public static void main(String[] args) {
        int number = 4;
        switch (number){
            case 1: {
                System.out.println("One");
                break;
            }
            case 2: {
                System.out.println("Two");
                break;
            }
            case 3: {
                System.out.println("Three");
                break;
            }
            default:{
                System.out.println("Not Valid");
            }
        }

        String numberInWord = "One";
        switch (numberInWord){
            case "One": {
                System.out.println(1);
                break;
            }
            case "Two": {
                System.out.println(2);
                break;
            }
            case "Three": {
                System.out.println(3);
                break;
            }
            default:{
                System.out.println("Not Valid");
            }
        }


    }
}
