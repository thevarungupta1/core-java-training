package com.thevarungupta.day4;

interface I1{
    void test1();
}

interface I2 extends I1{
    void test2();
}

interface I3 extends I2{
    void test3();
}

class Test implements I3{

    @Override
    public void test1() {
        System.out.println("Test 1");
    }

    @Override
    public void test2() {
        System.out.println("Test 2");
    }

    @Override
    public void test3() {
        System.out.println("Test 3");
    }
}


public class Demo3 {
    public static void main(String[] args) {
        Test testObj = new Test();
        testObj.test1();
        testObj.test2();
        testObj.test3();
    }
}
