import java.util.Scanner;

/**
 * A program that computes the sum of entered values
 * @author Efe Beydoðan
 * @version 1.0 30.10.2019
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //variables
      double sum;
      int count;
      int i;
      double average;
      int minimum;
      int maximum;
      
      //Set sum to 0
      sum = 0;
      
      //The first integer entered is the min and max value 
      minimum = scan.nextInt();
      maximum = minimum;
      
      //Add the first integer to sum
      sum = sum + minimum;
      
      
      //Receive 100 values from the user and find their sum, count, the min value and the max value
      count = 1;
      while ( count < 100 )
      {
         i = scan.nextInt();
         sum = sum + i;
         if ( i < minimum )
         {
            minimum = i;
         }
         if ( i > maximum )
         {
            maximum = i;
         }
         count++;
      }
      
      //Compute the average of the values
      average = sum / 100.0;
      
      System.out.println( "The sum of the values is " + sum + ".");
      System.out.println( "You've entered " + count + " values.");
      System.out.println( "The average of the 100 values is: " + average);
      System.out.println( "The maximum value is " + maximum + ".");
      System.out.println( "The minimum value is " + minimum + ".");
   }
}