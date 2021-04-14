package com.thevarungupta.day4;

interface Company{
    void getEmployeeName();
    default void getCompanyName (){
        System.out.println("Company Name");
    }
}

class Employee2 implements Company{

    @Override
    public void getEmployeeName() {
        System.out.println("Employee Name");
    }
}


public class Demo5 {
    public static void main(String[] args) {
        Employee2 employee = new Employee2();
        employee.getEmployeeName();
        employee.getCompanyName();
    }
}
