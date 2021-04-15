package com.thevarungupta.day5;

/**
 *ArrayIndexOutOfBoundException
 *
 * IndexOfBound -> RunTimeException -> Exception -> Throwable
 *
 * **/
public class Demo3 {
    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
//        a[3] = 40;
//
//        for(int i: a){
//            System.out.println(i);
//        }
        try{
            System.out.println(a[100]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }




    }
}
