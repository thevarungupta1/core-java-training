package com.thevarungupta.day3;

class Test4{

    static int a;

    static {
        a = 20;
    }



    public Test4(){
        System.out.println("Default constructor");
    }

}

public class Demo7 {
    public static void main(String[] args) {
        Test4 obj = new Test4();
        //obj.Test4();
    }
}
