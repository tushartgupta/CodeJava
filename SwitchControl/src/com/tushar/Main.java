package com.tushar;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Values was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }
        /*
        Switch is better in cases wherein you have to just test one variable..
        In case of "IF" , we can test one variable in IF, and then another in "ELSE IF" block*/

        int switchValue = 4;
        switch (switchValue){

            case 1:
                System.out.println("Value was 1 - In Switch");
                break;
            case 2:
                System.out.println("Value was 2 - I am in Switch");
                break;
            case 3:case 4:case 5:
                System.out.println("Was either 3, 4 or 5");
                System.out.println("Actual value: " + switchValue);
                break;
            default:
                System.out.println("Not 1 or 2");
                break;
        }

        char charVar = 'C';
        switch (charVar){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("It was either A, B , C , D or E");
                System.out.println("Actual character: " + charVar);
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        // String data type is also supported with SWITCH, along with byte, int, short and char

        String month = "January";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }

    }
}
