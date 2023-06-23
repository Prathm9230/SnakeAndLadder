package com.bridgelabz.snakeandladder;

import java.sql.SQLOutput;
import java.util.Random;

public class SnakeAndLadder {
    public static int PLAYER = 0;
    public static int TARGET = 100;
    public static void main(String[] args) {
        Random random = new Random();
        Random c = new Random();
       // System.out.println("Welcome! to Snake And Ladder Game.");
        int count =1;

        for (int i = 0; i < 35; i++) {
            if (PLAYER == 100)
                break;
            int dice = random.nextInt(1, 7);
            int check = c.nextInt(3);
            if (PLAYER==TARGET) {
                PLAYER=PLAYER;
                break;
            }else if (PLAYER>TARGET){
                PLAYER=PLAYER-dice;
                continue;
            } else if (PLAYER==99) {
                dice=1;

            }
            System.out.println("\nScore : " +PLAYER);
            count++;
            System.out.println("Rolling the dice:"+dice);
            PLAYER+=dice;
            System.out.println("Currently PLAYER's score:"+PLAYER);
            if(PLAYER==100)
                break;
            if(check == 0)
            {
                System.out.println("sorry! you got nothing.");
                System.out.println("Current score of PLAYER:"+PLAYER);
            }
            else if(check == 1)
            {
                System.out.println("You have got a Ladder and you have to increase you score by :"+dice + " and play again");
                PLAYER=PLAYER+dice;
                System.out.println("Current score of is: "+PLAYER);
                continue;
            }
            else  {
                System.out.println("You have got a Snake and you have to increase you score by: "+dice);
                PLAYER=PLAYER-dice;
                System.out.println("Current score of is "+PLAYER);
            }

        }
        if (count>=35 && PLAYER<TARGET){
            System.out.println("\nComputer has Won the game");
        }else {
            System.out.println("\nHURRAH!YOU WON THE GAME." );
        }

        System.out.println("\nThe score of s: " + PLAYER);
        System.out.println("TAKING TRY:  "+count);
    }
}
