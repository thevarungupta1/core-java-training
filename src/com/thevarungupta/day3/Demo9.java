package com.thevarungupta.day3;

class Parent{
    public Parent(int x){
        System.out.println("Parent Constructor: "+ x);
    }
}

class Child extends Parent{
    public Child(int a){
        super(a);
        System.out.println("Child Constructor");
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Child child = new Child(10);

    }
}
