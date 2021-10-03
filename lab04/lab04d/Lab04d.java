import java.util.Scanner;

/**
 * A program that prints out a triangle using the prompts entered by the user
 * @author Efe Beydoðan
 * @version 1.0 30.10.2019
 */ 
public class Lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //variables
      String ch;
      int width;
      int count;
      String ch2;
      
      //Ask for a character and a width value from the user
      System.out.print( "Please enter a character for your triangle: ");
      ch = scan.nextLine();
      
      System.out.print( "Please enter the width of your triangle: ");
      width = scan.nextInt();
      
      //Form the triangle
      count = 0;
      ch2 = ch;
      while ( count < width )
      {
         System.out.println( ch2);
         ch2 = ch + ch2;
         count++;
      }
   }
}