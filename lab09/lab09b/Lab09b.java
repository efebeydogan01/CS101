import java.util.*;
import Dice.*;

/**
 * A histogram of dice rolls
 * @author Efe Beydoðan
 * @version 11.12.2019
 */ 
public class Lab09b
{
   /**
    * A method that returns the data of a dice roll
    * @return the frequency data as an ArrayList
    */
   public static ArrayList<Integer> dataFrequency()
   {
      final int NUM_OF_ROLLS = 1000;
      Dice dice;
      ArrayList<Integer> dataFreq;
      dataFreq = new ArrayList<Integer>();
      dice = new Dice();
      int index;
      
      //Sets 12 0's in an arraylist
      for ( int i = 0; i < 11; i++ )
      {
         dataFreq.add( 0);
      }
      
      //Rolls the dice a 1000 times and updates the arraylist accordingly
      for ( int i = 1; i <= NUM_OF_ROLLS; i++ )
      {
         index = dice.roll() - 2;
         dataFreq.set( index, dataFreq.get( index) + 1);
      }
      return dataFreq;
   }
   
   /**
    * A method that gives the histogram of the face values of rolling dice
    * @param dataFreq an ArrayList consisting of the number of occurences of face values after rolling dice
    * @return an histogram with dice rolling data
    */
   public static String histogram( ArrayList<Integer> dataFreq )
   {
      final int ROW = 10;
      int maxFreq;
      int star;
      maxFreq = 0;
      String line;
      
      //Find the max frequency
      for ( int i = 0; i < dataFreq.size(); i++ )
      {
         if ( dataFreq.get( i) > maxFreq )
         {
         maxFreq = dataFreq.get( i);
         }
      }
      
      //Calculate the value a star represents
      star = (int) Math.round( maxFreq / 10.0 );
      
      //Create the histogram
      line = "Frequency Distribution" + "\n" + "  for 1000 Dice rolls" + "\n" + "( max freq is " + maxFreq + " )" + "\n";
      for ( int row = 0; row < ROW; row++)
      {
         for ( int column = 0; column < 11; column++ )
         {
            if ( ( ROW - row ) * star <= dataFreq.get( column) )
            {
               line = line + "* ";
            }
            else
            {
               line = line + "  ";
            }
         }
         line = line + "\n";
      }
      return line;
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      ArrayList<Integer> dataFreq;
 
      // program code
      dataFreq = new ArrayList<Integer>();
      dataFreq = dataFrequency();
      System.out.print( dataFreq + "\n" + "\n" + histogram( dataFreq ) );
   }
}