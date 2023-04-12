package Lecture;
//✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈-------GUESSER GAME 1------✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️✈️

//import java.util.*;
//class Guesser
//{
//    int guesserNum;
//        int guesserGuessingNum()
//        {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Guesser Enter a number between 1-100: ");
//            guesserNum = sc.nextInt();
//            return guesserNum;
//        }
//}
//class Player
//{
//    int playersNum;
//    int playersGuessingNum()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Players Enter the num: ");
//        playersNum = sc.nextInt();
//        return playersNum;
//    }
//}
//class Umpire {
//    int numFromGuesser;
//    int numFromPlayerP1;
//    int numFromPlayerP2;
//    int numFromPlayerP3;
//
//    void collectNumFromGuesser()
//    {
//        Guesser g = new Guesser();
//        numFromGuesser = g.guesserGuessingNum();
//    }
//
//    void collectNumFromPlayer()
//    {
//        Player P1 = new Player();
//        numFromPlayerP1 = P1.playersGuessingNum();
//        Player P2 = new Player();
//        numFromPlayerP2 = P2.playersGuessingNum();
//        Player P3 = new Player();
//        numFromPlayerP3 = P3.playersGuessingNum();
//    }
//
//    void compare() {
//        //logic
//        if (numFromGuesser == numFromPlayerP1)
//        {
//            if (numFromGuesser == numFromPlayerP2 && numFromGuesser == numFromPlayerP3)
//            {
//                System.out.println("All are winner");
//            }
//            else if (numFromGuesser == numFromPlayerP2)
//            {
//                System.out.println("Player 1 & 2 won");
//            }
//            else if (numFromGuesser == numFromPlayerP3)
//            {
//                System.out.println("Player 1 & 3 won");
//            }
//            else
//            {
//                System.out.println("Player 1 winner");
//            }
//
//        }
//        else if (numFromGuesser == numFromPlayerP2)
//        {
//            if (numFromGuesser == numFromPlayerP3)
//            {
//                System.out.println("Player 2 & 3 won");
//            }
//            else
//            {
//                System.out.println("Player 2 winner");
//            }
//        }
//        else if (numFromGuesser == numFromPlayerP3)
//            {
//                System.out.println("Player 3 winner");
//            }
//        else
//            {
//                System.out.println("all are loser");
//            }
//
//    }
//}
//public class Lecture.GuesserGame
//{
//    public static void main(String[] args)
//    {
//        Umpire obj = new Umpire();
//        obj.collectNumFromGuesser();
//        obj.collectNumFromPlayer();
//        obj.compare();
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️





//🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️----GUESSER GAME 2------🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️🎗️
//import java.util.Scanner;
//
//public class Lecture.GuesserGame {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between 1-100");
//
//        int numGenByCom = (int) (Math.random()*100+1);
//
//        int guess;
//        int tries = 10;
//
//        do
//        {
//            System.out.println("You have "+tries+" tries left. Let's Guess a number: ");
//            guess = sc.nextInt();
//
//            if (guess > numGenByCom)
//            {
//                System.out.println("You are Higher");
//            }
//            else if(guess < numGenByCom)
//            {
//                System.out.println("You are lower");
//            }
//            tries --;
//        }while (guess != numGenByCom && tries > 0);
//
//        if (guess == numGenByCom)
//        {
//            System.out.println("You got it: "+numGenByCom);
//        }
//        else
//        {
//            System.out.println("Better Luck next time");
//        }
//    }
//}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️








//🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟------GUESSER GAME 3 -----------🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟🥟
import java.util.Scanner;
public class GuesserGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 100");

        int numberGenByCom = (int)(Math.random()*100+1);
        int guess;
        while ((guess = sc.nextInt()) != numberGenByCom)
        {
            if (guess < numberGenByCom)
            {
                System.out.println("Very Low");
            }
            else
            {
                System.out.println("Very High");
            }
        }
        System.out.println("You got it: "+numberGenByCom);
    }
}
//〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️


