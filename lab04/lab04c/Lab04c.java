import java.util.Scanner;

/**
 * A program that finds the average, minimum and maximum, of a set of integer values up to, but not including the first negative value.
 * @author Efe Beydoðan
 * @version 1.0 30.10.2019
 */ 
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //variables
      int sum;
      double average;
      int number;
      double count;
      int maximum;
      int minimum;
      
      //Sum and count is 0
      sum = 0;
      count = 0;
      
      //Number is the first value entered
      number = scan.nextInt();
      
      //First number is min and max
      maximum = number;
      minimum = number;
      
      
      //Ask the user to enter values and compute sum and find the min, max values when a negative integer is entered
      while ( number >= 0 )
      {
         sum = sum + number;
         count++;
         if ( number > maximum )
         {
            maximum = number;
         }
         if ( number < minimum )
         {
            minimum = number;
         }
         number = scan.nextInt();
      }
      
      //Compute average
      average = sum / count;
      

      //Report average
      System.out.println( "The average of the numbers is " + average);
      System.out.println( "The maximum value is " + maximum + ".");
      System.out.println( "The minimum value is " + minimum + ".");
   }
}
