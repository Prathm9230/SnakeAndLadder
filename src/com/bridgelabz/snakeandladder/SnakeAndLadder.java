package com.bridgelabz.snakeandladder;

import java.sql.SQLOutput;
import java.util.Random;

public class SnakeAndLadder {
    public static int PLAYER = 0;
    public static void main(String[] args) {
        {
            //System.out.println("Welcome! to Snake And Ladder Game.");
            Random random = new Random();
            int dice = random.nextInt(1,7);
            System.out.println("Currently PLAYER is at postion:"+PLAYER);
            System.out.println("Rolling the dice:"+dice);

        }
    }
}
