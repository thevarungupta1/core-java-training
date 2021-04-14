package com.thevarungupta.day4;


/**
 *
 * # Interface vs Abstract class
 * 1. Interface use for 100% abstraction where as abstract class use for partial abstraction
 * 2. Interface can inherit multiple interface / classes where as abstract class is a class hence cannot inherit form more then one class
 *
 *
 * # Interface
 * An interface in java is a blue print of a class
 * Interface consist of static constants and abstract method
 *
 * > It is a compile time error to provide implementation for any interface member
 * > If a class inherit from an interface it must provide implementation for all interface members
 * > Interface can also inherit from other interface. A class that inherit this interface must provide implementation
 *   for all interface members in the entire interface chain
 * > We can not create an instance of an interface
 * > We can hold the reference of a class which has implemented interface in interface instance
 *
 *
 * **/

interface IEmployee{
    void print();
}

class Employee implements IEmployee {

    @Override
    public void print() {
        System.out.println("Interface Print Method");
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.print();
    }
}
