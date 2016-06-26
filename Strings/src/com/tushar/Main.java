package com.tushar;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a String";
        System.out.println("myString is equal to : " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to : " + myString);
        myString = myString + "\u00A9 2016";
        System.out.println("myString is equal to : " + myString);

        String numberString = "250.67";
        numberString = numberString + 56.34;
        System.out.println("Result is : " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String : " + lastString);
    }
}
