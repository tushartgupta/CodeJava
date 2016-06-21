package com.tushar;

public class Main {

    public static void main(String[] args) {

        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        byte myByteValue = 10; // Min value it takes is -128 , and max of 127 . It has a width of 8

        byte myNewByteValue = (byte) (myByteValue/2);   // byte myNewByteValue = (myByteValue/2);  ---> This is giving error because Java implicitly converts the right hand side expr into int.
        System.out.println("myNewByteValue = " + myNewByteValue);

        short myShortValue = -32768;  // Short has a width of 16
        short myNewShortValue = (short)(myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        long myLongValue = -9_223_372_036_854_775_808L;  // Long has a width of 64.

        /////////Assignment ///////////

        byte myByte1 = 124;
        short myShort1 = 32765;
        int myInt1 = 245;
        int sum1 = myInt1 + myByte1 + myShort1;
        long myResult1 = 50000 + (10 * sum1);
        System.out.println("myResult1 = " + myResult1);
    }
}
