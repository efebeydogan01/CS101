import java.util.Scanner;

/**
 * Applications of the while statement
 * @author Efe Beydoðan
 * @version 1.0 30.10.2019
 */ 
public class Lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //variables
      int n;
      int x; //Integer values from 0 up to n exclusive on the same line
      double k;
      double i; //1/x
      int counter;
      
      //Receive a positive integer value from the user
      System.out.print( "Please enter a positive integer value: ");
      n = scan.nextInt();
      
      //If the value is negative ask for another value
      while ( n <= 0 )
      {
         System.out.print( "Value must be a positive integer, please enter again: ");
         n = scan.nextInt();
      }
      
      //Print all the integer values from 0 up to n exclusive on the same line
      System.out.println( "All the integer values from 0 up to " + n + " exclusive on the same line:");
      x = 0;
      while ( x < n )
      {
         System.out.print( x + " ");
         x++;
      }
      
      System.out.println( " ");
      System.out.println( " ");
      
      //Print all the integer values from 0 up to n exclusive (5 integers on the same line)
      System.out.println( "All the integer values from 0 up to " + n + " exclusive (5 integers per line):");
      x = 0;
      while ( x < n )
      {
         System.out.print( x + " ");
         x++;
         if ( x % 5 == 0)
         {
            System.out.println( " ");
         }
      }
      
      System.out.println( " ");
      System.out.println( " ");
     
      //Print all the integer values from n down to 0 inclusive on the same line
      System.out.println( "All the integer values from " + n + " down to 0 inclusive on the same line:");
      x = n;
      while ( x >= 0 )
      {
         System.out.print( x + " ");
         x--;
      }
     
      System.out.println( " ");
      System.out.println( " ");
     
      //Print all the even values from -n to n inclusive on the same line
      System.out.println( "All the even values from -" + n + " to " + n + " inclusive on the same line:");
      x = -n;
      while ( x <= n )
      {
         if ( x % 2 == 0)
         {
            System.out.print( x + " ");
         }
         x++;
      }
     
      System.out.println( " ");
      System.out.println( " ");
     
      //Print the squares of all the even values from 0 up to n inclusive (5 values per line)
      System.out.println( "The squares of all the even values from 0 up to " + n + " inclusive (5 values per line):");
      x = 0;
      while ( x <= n )
      {
         System.out.print( x * x + " ");
         x = x + 2;
         if ( x * x % 5 == 0)
         {
            System.out.println( " ");
         }
      }
      
      System.out.println( " ");
      System.out.println( " ");
      
      //Print the values which are divisible by 3 or 4 but not both from n down to 3 inclusive (5 values per line),
      System.out.println( "The values which are divisible by 3 or 4 but not both from " + n + " down to 3 inclusive (5 values per line):");
      x = n;
      counter = 0;
      while ( x >= 3 )
      {
         if ( x % 3 == 0 && x % 4 == 0 )
         {
         }
         else 
         {
            if ( x % 3 == 0 || x % 4 == 0 )
            {
               System.out.print( x + " ");
               counter++;
               if ( counter % 5 == 0)
               {
                  System.out.println( " ");
               }
            } 
         }
         x--;
      }
            
      System.out.println( " ");
      System.out.println( " ");
      
      //Print all the divisors of the number entered
      System.out.println( "All the divisors of " + n + ":");
      x = 2;
      while ( x <= n )
      {
         if ( n % x == 0)
         {
            System.out.print( x + " ");
         }
         x++;
      }
      
      System.out.println( " ");
      System.out.println( " ");
      
      //For every integer k from n down to 1, print the value 1/k if it is greater than 0.01
      System.out.println( "For every integer k from " + n + " down to 1, the value 1/k, if it is greater than 0.01, is:");
      k = n;
      while ( k > 0 )
      {
         i = (1/k);
         i = Math.round(i * 100.0) / 100.0;
         if ( i > 0.01 )
         {
            System.out.print( i + " ");
         }
         k--;
      }
   }
}