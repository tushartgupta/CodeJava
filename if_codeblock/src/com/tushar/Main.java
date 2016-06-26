package com.tushar;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       /* if (score == 5000){
            System.out.println("Your score was 5000");
        }*/
/*        if (score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000, but greater than 1000");
        }else if (score < 1000){
            System.out.println("Your score was less than 1000");
        }
        else {
            System.out.println("Got here");
        }*/

        if (gameOver == true) { // or if(gameOver)
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score: " + finalScore);
        }


        if (gameOver){
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Your second final Score: " + secondScore);
        }
        System.out.println("Value of Score:" + score);
    }
}
