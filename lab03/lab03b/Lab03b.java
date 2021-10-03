import java.util.Scanner;

/**
 * A program for determining how many flowers can be planted in a triangular garden.
 * @author Efe Beydoðan
 * @version 2.0 23.10.2019
 */ 
public class Lab03b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //constants
      final int FLOWER_PER_SQ = 17;
      
      // variables
      double side1;
      double side2;
      double side3;
      double area;
      double flowers;
      double s;
      double flowers2;
      
      // program code
      
      //Welcome message
      System.out.println( "Welcome to Flower Machine.");
      
      //Ask for side lengths and see if the entered values are acceptable
      System.out.println( "Please enter the length of the first side ");
      side1 = scan.nextInt();
      if ( side1 <= 0)
      {
         System.out.println( "Side can't be negative or zero!");
      }
      else
      {
         System.out.println( "Please enter the length of the second side ");
         side2 = scan.nextInt();
         if ( side2 <= 0)
         {
            System.out.println( "Side can't be negative or zero!");
         }
         else
         {
            System.out.println( "Please enter the length of the third side ");
            side3 = scan.nextInt();
            if ( side3 <= 0)
            {
               System.out.println( "Side can't be negative or zero!");
            }
            else
            {
               //Determine if the sides entered form a triangle
               if ( side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2 )
               {
                  System.out.println( "Not a triangle!");
               }
               else
               {
                  //Calculate semi-perimeter
                  s = ( side1 + side2 + side3)/2;
         
                  //Compute area
                  area = Math.sqrt ( s * (s-side1) * (s-side2) * (s-side3));
     
                  //Find number of flowers that can be planted
                  flowers = area * FLOWER_PER_SQ;
                  flowers2 = Math.floor(flowers);
      
                  System.out.print( "You can plant ");
                  System.out.print( flowers2);
                  System.out.println( " flowers in your garden.");
      
                  //Thank you message
                  System.out.print( "Thank you for using this program, see you.");
               }
            }
         }
      }
   }
}