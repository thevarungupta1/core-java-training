package com.thevarungupta.day5;

public class Demo7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        try{
            c = a /b;
        }
        catch (ArithmeticException e){

        }
        catch (NullPointerException | NumberFormatException e){

        }
        catch (Exception e){

        }

    }
}
