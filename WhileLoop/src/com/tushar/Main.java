package com.tushar;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while(count != 5){
            System.out.println("While Loop: Value of count: " + count);
            count++;
        }
        System.out.println("#########");
        count = 1;
        while (true){
            if (count == 6){
                break;
            }
            System.out.println("While(true) example: Value of count: " + count);
            count++;
        }
        System.out.println("#########");
        count = 1;
        do {

            System.out.println("do_while example: Value of count: " + count);
            count++;
        }while (count != 6);

        System.out.println("#########");
        int number = 5;
        int lastNumber = 20;
        int evenCount = 0;

        while (number <= lastNumber){
            if (!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even Number: " + number);
            evenCount++;
            if (evenCount == 5){
                break;
            }
            number++;
        }
        System.out.println("Total Even Numbers Found: " + evenCount);
    }

    public static boolean isEvenNumber(int num){
        if((num % 2) == 0){
            return true;
        }
        else return false;
    }
}
