import java.util.Scanner;

/**
 * A program that prints rectangular patterns
 * @author Efe Beydo?an
 * @version 1.0 06.11.2019
 */ 
public class Lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      Scanner scan2 = new Scanner( System.in);
      
      // variables
      int width;
      int height;
      int thickness;
      int i;
      int k;
      String space = " ";
      String answer;
      
      // program code
      
      do
      {
         //Ask for width, height and thickness values from the user and check if they're appropriate
         System.out.print( "Please enter the width: ");
         width = scan.nextInt();
         while ( width <= 0 )
         {
            System.out.print( "Width must be a positive integer, please enter again: ");
            width = scan.nextInt();
         }
         
         System.out.print( "Please enter the height: ");
         height = scan.nextInt();
         while ( height <= 0 )
         {
            System.out.print( "Height must be a positive integer, please enter again: ");
            height = scan.nextInt();
         }
         
         System.out.print( "Please enter the thickness: ");
         thickness = scan.nextInt();
         while ( thickness <= 0 )
         {
            System.out.print( "Thickness must be a positive integer, please enter again: ");
            thickness = scan.nextInt();
         }
         
         //Draw the rectangle
         
         //If the rectangle has a hole run this code
         
         //First draw the rectangle until height reaches thickness
         if ( width > (2 * thickness ) && height > (2 * thickness) )
         {
            for ( i = 1; i <= thickness; i++ )
            {
               for ( k = 1; k <= width; k++ )
               {
                  System.out.print( "*");
               }
               System.out.println();
            }
            //Draw the rectangle's part that has the hole
            for ( i = 1; i <= (height - (2 * thickness)); i++ )
            {
               for ( k = 1; k <= thickness; k++ )
               {
                  System.out.print( "*");
               }
               for ( k = 1; k <= (width - (2 * thickness)); k++ )
               {
                  System.out.print( space);
               }
               for ( k = 1; k <= thickness; k++ )
               {
                  System.out.print( "*");
               }
               System.out.println();
            }
            //Draw the rest of the rectangle until it reaches thickness
            for ( i = 1; i <= thickness; i++ )
            {
               for ( k = 1; k <= width; k++ )
               {
                  System.out.print( "*");
               }
               System.out.println();
            }
         }
         else 
         //If the rectangle doesn't have a hole run this code
         {
            for ( i = 1; i <= height; i++ )
            {
               for ( k = 1; k <= width; k++ )
               {
                  System.out.print( "*");
               }
               System.out.println();
            }
            System.out.println( "The rectangle has no hole.");
         }
         System.out.print( "Do you want to draw another rectangle? ");
         answer = scan2.nextLine();
      } while ( answer.equals( "Y" ) || answer.equals( "y" ));
      
      System.out.print( "Goodbye");
   }
}