import java.util.Scanner;

/**
 * A program that computes the value of PI
 * @author Efe Beydo?an
 * @version 1.0 06.11.2019
 */ 
public class Lab05d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final double PI = Math.PI;
      
      // variables
      double terms;
      double i;
      double sum;
      double acc;
      
      // program code
      
      //Show the value of pi according to Math.PI
      System.out.print( "The value of pi according to the java constant Math.PI is " + PI);
      
      System.out.println();
      System.out.println();
      
      //Show the value of pi by receiving the desired number of terms of the series to compute
      System.out.print( "Please enter the number of terms you want to be computed: ");
      terms = scan.nextDouble();
      
      sum = 0;
      for ( i = 1; i <= terms; i++ )
      {
         if ( i % 2 == 0 )
         {
            sum = sum - (4.0 / ((2.0 * i) - 1));
         }
         else
         {
            sum = sum + (4.0 / ((2.0 * i) - 1));
         }
      }
      System.out.print( "The value of pi calculated by computing " + terms + " terms is " + sum);
      
      System.out.println();
      System.out.println();
      
      //Compute pi to a user specified accuracy
      System.out.print( "Please enter how accurate you want the value of pi to be: ");
      acc = scan.nextDouble();
      
      while ( Math.abs( PI - sum ) > acc )
      {
         if ( i % 2 == 0 )
         {
            sum = sum - (4.0 / ((2.0 * i) - 1));
         }
         else
         {
            sum = sum + (4.0 / ((2.0 * i) - 1));
         }
         i++;
      }
      System.out.print( "The value of pi with your desired accuracy is: " + sum);
   }
}