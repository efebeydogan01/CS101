import java.util.Scanner;
/**
 * A program that finds the sum, difference, product, the result of dividing and the remainder after such division of two integers. 
 * @author Efe Beydoðan
 * @version 1.0 16.10.2019
 */
public class Lab02c
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //variables
      int int1;
      int int2;
      int sum;
      int difference;
      int product;
      int quotient;
      int remainder;
      
      //program code
      
      //1. Welcome message
      System.out.println( "Welcome to Basic Calculator");
      
      //2. Ask for two integers
      System.out.println ( "Please enter the first integer: ");
      int1 = scan.nextInt();
      
      System.out.println ( "Please enter the second integer: ");
      int2 = scan.nextInt();
      
      //3. Find the sum, difference, product, result of dividing and remainder
      sum = int1 + int2;
      difference = int1 - int2;
      product = int1 * int2;
      quotient = int1 / int2;
      remainder = int1 % int2;
      
      //4. Report the findings
      System.out.print( "The sum of the two integers is ");
      System.out.println( sum);
      System.out.print( "The difference of the two integers is ");
      System.out.println( difference);
      System.out.print( "The product of the two integers is ");
      System.out.println( product);
      System.out.print( "The quotient after dividing the first integer by the second one is ");
      System.out.print( quotient);
      System.out.print( " and the remainder is ");
      System.out.println( remainder);
      System.out.print( "The greater of the two numbers is ");
      System.out.print( Math.max(int1 , int2));
      System.out.print( " and the smaller of the two numbers is ");
      System.out.println( Math.min(int1 , int2));
      
      //5. Thank you message
      System.out.print( "Thank you for using Basic Calculator, hope to see you again soon.");
   }
}
      
      //end class Basic Calculator