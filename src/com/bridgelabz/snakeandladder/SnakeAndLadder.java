package com.bridgelabz.snakeandladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    public static  int PLAYER1=0;
    public static  int PLAYER2=0;
    public static final int TARGET=100;
    public static void main(String[] args) {
        Random r = new Random();
        Random c = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first player name : ");
        String playerName1= sc.nextLine();
        System.out.print("Enter second Player name : ");
        String playerName2= sc.nextLine();
        for (int i = 0; i < 50; i++){
            if (PLAYER1==100 || PLAYER2==100)
                break;

            int dice1 = r.nextInt(1, 7);
            int check1 = c.nextInt(3);

            int dice = r.nextInt(1, 7);
            int check = c.nextInt(3);

            if (PLAYER1==TARGET || PLAYER2==TARGET) {
                PLAYER1=PLAYER1;
                PLAYER2=PLAYER2;
                break;
            }else if (PLAYER1>TARGET || PLAYER2>TARGET){
                PLAYER1=PLAYER1-dice;
                PLAYER2=PLAYER2-dice1;
                continue;
            } else if (PLAYER1==99 || PLAYER2==99) {
                dice=1;
                dice1=1;

            }
            System.out.println("\nScore : " +PLAYER1);

            System.out.println("Rolling the deice for "+playerName1 +": "+dice);
            PLAYER1=PLAYER1+dice;
            System.out.println("Current score of "+playerName1 +" is : " +PLAYER1);
            if (PLAYER1==100 )
                break;

            if (check==0 ){
                System.out.println("You got nothing you can continue");
                System.out.println("Current score for "+playerName1 +" = "+PLAYER1);

            } else {
                if (check==1 ) {
                    System.out.println("You have got a Ladder and you have to increase you score by "+dice + " and play again");
                    PLAYER1=PLAYER1+dice;
                    System.out.println("Current score of "+playerName1 +" is "+PLAYER1);
                    continue;

                } else  {
                    System.out.println("You have got a Snake and you have to increase you score by "+dice);
                    PLAYER1=PLAYER1-dice;
                    System.out.println("Current score of "+playerName1 +" is "+PLAYER1);

                }
            }

            System.out.println("\nScore : " +PLAYER2);

            System.out.println("Rolling the deice for "+playerName2 +" : "+dice1);
            PLAYER2=PLAYER2+dice1;
            System.out.println("Current score of "+playerName2 +" is : "+PLAYER2);
            if (PLAYER2==100)
                break;


            if ( check1==0){
                System.out.println("You got nothing you can continue");
                System.out.println("Current score for "+playerName2 +" = "+PLAYER2);

            } else {
                if ( check1==1) {
                    System.out.println("You have got a Ladder and you have to increase you score by "+dice1+ " and play again");
                    PLAYER2=PLAYER2+dice1;
                    System.out.println("Current score of "+playerName2 +" is "+PLAYER2);
                    continue;

                } else  {
                    System.out.println("You have got a Snake and you have to increase you score by "+dice1);
                    PLAYER2=PLAYER2-dice1;
                    System.out.println("Current score of "+playerName2 +" is "+PLAYER2);

                }
            }
        }
        if (PLAYER1==TARGET){
            System.out.println("\nScore of  "+playerName1 +" is : "+PLAYER1);
            System.out.println("Score of  "+playerName2 +" is : "+PLAYER2);
            System.out.println(playerName1 +" has won the game!!!");
        }else if (PLAYER2==TARGET){
            System.out.println("\nScore of  "+playerName1 +" is : "+PLAYER1);
            System.out.println("Score of  "+playerName2 +" is : "+PLAYER2);
            System.out.println(playerName2 +" has won the game!!!");
        }
    }
}