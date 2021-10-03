import java.util.Scanner;

/**
 * Die & Dice games 
 * @author Efe Beydoðan
 * @version 27.11.2019
 */ 
public class Lab07a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int dice1;
      int dice2;
      int rolls;
      Dice twoDice;

      // program code
      //Simulation of the rolling of dice
      rolls = 0;
      do
      {
         dice1 = (int) (6 * Math.random()) + 1;
         dice2= (int) (6 * Math.random()) + 1;
         rolls++;
      } while ( dice1 != 6 || dice2 != 6 );
      System.out.print( "The number of rolls made until two sixes are thrown: " + rolls);
      
      System.out.println();
      System.out.println();
      
      //Implement it using the Dice class
      twoDice = new Dice();
      System.out.println( "Implementation of the game using the Dice class:");
      rolls = 0;
      do
      {
         twoDice.roll();
         rolls++;
         
      } while( twoDice.getDiceTotal() != 12 );
      System.out.println( "The numbers on the first and second dice are: " + twoDice.getDie1FaceValue() + " " + twoDice.getDie2FaceValue());
      System.out.println( "The total is: " + twoDice.getDiceTotal());
      System.out.print( "The number of rolls made using the Dice class until two sixes are thrown: " + rolls);
   }
}