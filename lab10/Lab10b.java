import java.util.*;
import bignumber.*;

/**
 * Lots of BigNums
 * @author Efe Beydo?an
 * @version 18.12.2019
 */ 
public class Lab10b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int SIZE_OF_ARRAY = 10;

      // variables
      BigNum[] bigNums;
      int digit;
      String numString;
      int n;
      BigNum max;
      int pos;
      BigNum temp;

      // program code
      bigNums = new BigNum[SIZE_OF_ARRAY];
      
      for ( int x = 0; x < SIZE_OF_ARRAY; x++  )
      {
         numString = "";
         //For every index in the array create a random BigNum
         for ( int i = 0; i < BigNum.SIZE; i++ )
         {
            //Add all the random created digits to a string and then pass the string into BigNum constructor
            digit = (int) (Math.random() * BigNum.BASE);
            if ( digit >= 10 )
            {
               numString = numString + Character.forDigit( digit, BigNum.BASE );
            }
            else
            {
               numString = numString + digit;
            }
         }
         bigNums[x] = new BigNum( numString);
         System.out.println( bigNums[x]);
      }
      
      //Ask the user to enter an n value
      System.out.println( "Please enter an n value: ");
      n = scan.nextInt();
      
      //Continue until n is 0 or negative
      while ( n > 0)
      {
         //Make the first BigNum in the string max and set the pos to 0
         max = bigNums[0];
         pos = 0;
         //Find the max BigNum using the for loop and store it in max and store its position in pos
         for ( int i = 1; i < n; i++ )
         {
            if ( max.isLessThan( bigNums[i]))
            {
               max = bigNums[i];
               pos = i;
            }
         }
         //Print out the max BigNum
         System.out.println( "The max value is " + max);
         
         //Store the max BigNum in a variable to swap it's position with the n'th BigNum
         temp = new BigNum( bigNums[pos]);
         //Change the n'th BigNums position with the max BigNum
         bigNums[pos] = bigNums[n-1];
         bigNums[n-1] = temp;
         //Print all the BigNums
         for ( BigNum x : bigNums )
         {
            System.out.println( x);
         }
         
         n = scan.nextInt();
      }
   }
}