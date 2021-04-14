package com.thevarungupta.day3;

import com.thevarungupta.day4.EncapsulationDemo;

class Child22 extends EncapsulationDemo{

    void test(){
        protectedMethod();
    }

}


public class Demo19 extends EncapsulationDemo {

    public void test(){
        protectedMethod();
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.publicMethod();

        Child22 child = new Child22();
        child.test();


    }
}
