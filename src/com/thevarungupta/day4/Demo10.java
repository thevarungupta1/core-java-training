package com.thevarungupta.day4;

class TestException extends Exception
{

}



public class Demo10 {
    public static void main(String[] args) throws TestException {

//        ArithmeticException ex = new ArithmeticException();
//        throw ex;

        throw new ArithmeticException();
        //throw new TestException();
    }
}
