package com.tushar;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));

        for (int i = 0; i < 5 ; i++){

            System.out.println("Loop " + i + " Hello");
        }
        System.out.println("############################################");
        for (int r  = 2; r < 9 ; r++){

            System.out.println("10,000 at "+ r +"% interest = " + calculateInterest(10000,r));
        }

        System.out.println("############################################");
        for (int r  = 8; r > 1 ; r--){

            System.out.println("10,000 at "+ r +"% interest = " + calculateInterest(10000,r));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop

        System.out.println("############################################");

        int count = 0;

        for (int  i = 10;i<50; i++){

            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is PRIME");
            }
            if(count == 3){
                System.out.println("Exiting the FOR loop");
                break;
            }

        }

    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100));

    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            //System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

}
