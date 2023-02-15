package PRACTICE;

import java.util.Scanner;

class GuesserBhai
{
    int guesserBhaiNum;
        int guesserBhaiNumGuessing()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("guesserbhai ek no bolo");
            guesserBhaiNum = sc.nextInt();
            return guesserBhaiNum;
        }


}

class PlayersBros
{
    int playerBrosNum;
        int playerBrosNumGuessing()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("PlayersBros guesser k no ko guess karo aur batao");
            playerBrosNum = sc.nextInt();
            return playerBrosNum;
        }

}

class UmpireBoss
{
    int numFromGuesserBhai;
    int numFromPlayer1Bro;
    int numFromPlayer2Bro;
    int numFromPlayer3Bro;

    void collectNumFromGuesserBhai()
    {
        GuesserBhai obj = new GuesserBhai();
        numFromGuesserBhai = obj.guesserBhaiNumGuessing();
    }
    void collectNumFromPlayersBros()
    {
        PlayersBros p1Bhai = new PlayersBros();
        numFromPlayer1Bro = p1Bhai.playerBrosNumGuessing();

        PlayersBros p2Bhai = new PlayersBros();
        numFromPlayer2Bro = p2Bhai.playerBrosNumGuessing();

        PlayersBros p3Bhai = new PlayersBros();
        numFromPlayer3Bro = p3Bhai.playerBrosNumGuessing();
    }
    void compareKaro()
    {
        if(numFromGuesserBhai == numFromPlayer1Bro)
        {
            if (numFromGuesserBhai == numFromPlayer2Bro && numFromGuesserBhai == numFromPlayer3Bro) 
            {
                System.out.println("sab jeet gae");    
            }
            else if (numFromGuesserBhai == numFromPlayer2Bro) 
            {
                System.out.println("player1Bro and player 2 bro jeete");
            }
            else if (numFromGuesserBhai == numFromPlayer3Bro) 
            {
                System.out.println("player1Bro and player 3 bro jeete");
            }
            else
            {
                System.out.println("Player1Bro jeet gaya");
            }
            
        }
        else if (numFromGuesserBhai == numFromPlayer2Bro) 
        {
            if(numFromGuesserBhai == numFromPlayer3Bro)
            {
                System.out.println("Player2 aur 3Bro jeete ");
            }
            else
            {
                System.out.println("Player2Bro jeet gaya");  
            }
              
        }
        else if (numFromGuesserBhai == numFromPlayer3Bro) 
            {
                System.out.println("Player3Bro jeet gaya");    
            }
        else
            {
                System.out.println("sab haat gaye");
            }
    }

}





public class GAME 
{

    public static void main(String[] args) 
    {
        UmpireBoss obj = new UmpireBoss();
        obj.collectNumFromGuesserBhai();
        obj.collectNumFromPlayersBros();
        obj.compareKaro();
        
    }
}