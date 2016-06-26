package com.tushar;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tushar", 500);
        System.out.println("New Score is : " + newScore);

        calculateScore(300);

        calculateScore();

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        double to_cms = calcFeetAndInchesToCentimeters(6,10);
        System.out.println("Value in cms: " + to_cms);

    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches >= 0){

            return 2.54 * inches;
        }
        else
        {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if (feet >= 0 && (inches >= 0 && inches <=12)){

            double feet_to_inches = feet * 12;
            double inch_to_cms = calcFeetAndInchesToCentimeters(feet_to_inches);

            double inch_cm_2 = calcFeetAndInchesToCentimeters(inches);

            return inch_cm_2 + inch_to_cms;

        }else{
            return -1;
        }
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed Player" + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {

        System.out.println("No Player name, no score. ");
        return 0;
    }
}
