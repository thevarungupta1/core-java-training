package com.thevarungupta.day4;

interface IParent1{
    void print();
}

interface IParent2{
    void display();
}

class Child implements IParent1, IParent2{

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void display() {
        System.out.println("Display");
    }
}



public class Demo4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        child.display();
    }
}
