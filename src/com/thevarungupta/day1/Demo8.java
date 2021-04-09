package com.thevarungupta.day1;

/**
 * Jump Statement
 * 1. break
 * 2. continue
 *
 *
 * */
public class Demo8 {
    public static void main(String[] args) {

        for(int i=0; i<=10; i++){
            if(i==5){
                break;
            }
            //System.out.println(i);
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<10; j++){
                if(i==5 && j ==5){
                    break;
                }
                System.out.println(i + " - " + j);
            }
        }

    }
}
