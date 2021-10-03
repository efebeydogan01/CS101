import java.util.Scanner;

/**
 * Prints all the numbers from 1 to 50 and computes the sum of all the numbers from 1 to an integer
 * @author Efe Beydoðan
 * @1.0 23.10.2019
 */ 

public class Lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //variables
      int oddNumbers;
      int evenNumbers;
      int n;
      int sum;
      int formulaSum;
      
      //Receive integer value from the user
      oddNumbers = 0;
      evenNumbers = 0;
      sum = 0;
      System.out.print( "Please enter the value: ");
      n = scan.nextInt();
      if ( n < 0)
      {
        System.out.println( "The value must be zero or a positive integer!");
      }
      else
      {
         
         for ( int x = 0; x <= 50; x++ )   
         {
            if ( x < 12 || x > 25)
            {
               System.out.print( x + " out of range 12-25 ");
            }
            else
            {
               System.out.print( x);
            }
      
            if ( x % 5 == 0)
            {
               System.out.println( " Hi Five");
            }
            else if ( x % 2 == 0)
            {  
               System.out.println( " Hi Two");
            }
            else if ( x % 3 == 0 || x % 7 == 0)
            {
               System.out.println( " Hi ThreeOrSeven");
            }
            else 
            {
               System.out.println( " Hi Others!");
            }
          
            if ( x % 2 == 1)
            {
               oddNumbers++;
            }
            else 
            {
               evenNumbers++;
            }
            if (x <= n)
            {
               sum = sum + x;
            }
         }
      
         //Compute the sum of all the integers from 1 to n using the formula
         formulaSum = 0;
         formulaSum = ( n * (n+1))/2;
      
         System.out.println( "Number of even numbers: " + evenNumbers);
         System.out.println( "Number of odd numbers: " + oddNumbers);
         System.out.println( "The sum of all the integers from 1 to " + n + " computed by the loop is " + sum + ".");
         System.out.println( "The sum of all the the integers from 1 to " + n + " according to the formula is " + formulaSum + ".");
      
         if ( sum == formulaSum)
         {
            System.out.println( "The sum values computed by the loop and the formula are the same.");
         }
         else
         {
            System.out.println( "The sum values computed by the loop and the formula are different.");
         }
      }
   }
}
      
   
