package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
    public static int PLAYER = 0;//single player at 0 position
    public static void main(String[] args) {
        {
            //System.out.println("Welcome! to Snake And Ladder Game.");
            Random random = new Random();

            int dice = random.nextInt(1, 7);
            System.out.println("Current position of user is: " + PLAYER);
            System.out.println("Rolling the deice " + dice);
        }
    }
}
