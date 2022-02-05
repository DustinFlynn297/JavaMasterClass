package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was  " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was  " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Brian", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerOne, int position){
        System.out.println(playerOne + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        // another way to perform the same code as above without using multiple return statements
        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }
}
