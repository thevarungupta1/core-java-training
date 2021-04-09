package com.thevarungupta.day1;

class Test{

    int a = 10;  // instance variable
    static int b = 20; // static variable

    public void something(){
        int c = 30; // local variable
        System.out.println(c);
    }
}

public class Demo2 {
    public static void main(String[] args){
        Test test = new Test();
        System.out.println(test.a);
        System.out.println(Test.b);
        test.something();
    }

}
