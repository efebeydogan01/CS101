/**
 * A program to test DiceGame class 
 * @author Efe Beydo�an
 * @version 27.11.2019
 */ 
public class TestDiceGame
{
   public static void main( String[] args)
   {
      // variables
      DiceGame dice;

      // program code
      dice = new DiceGame();
      System.out.println( "Number of rolls until double sixes: " + dice.play());
   }
}