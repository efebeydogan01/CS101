import java.util.Scanner;

/**
 * A program that generates a table according to the information entered by the user
 * @author Efe Beydoðan
 * @version 1.0 06.11.2019
 */ 
public class Lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int row;
      int col;
      String cell;
      int cellLength;
      int i;
      int k;
      int n;
      int number;
      String space;
      
      // program code
      
      //Ask the user for row and column values and check if they're appropriate
      System.out.print( "Please enter the number of rows you want: ");
      row = scan.nextInt();
      while ( row <= 0 )
      {
         System.out.print( "Number of rows must be a positive integer, please enter again: ");
         row = scan.nextInt();
      }
      
      System.out.print( "Please enter the number of columns you want: ");
      col = scan.nextInt();
      while ( col <= 0 )
      {
         System.out.print( "Number of columns must be a positive integer, please enter again: ");
         col = scan.nextInt();
      }
      
      //Show the row and column numbers
      space = " ";
      
      System.out.println( "The table of row and column numbers: ");
      for ( i = 1; i <= row; i++ )
      {
         for ( k = 1; k <= col; k++ )
         {
            cell = i + "," + k;
            cellLength = cell.length();
            for ( n = cellLength; n < 6; n++)
            {
               System.out.print( space);
            }
            System.out.print( i + "," + k);
         }
         System.out.println();
      }
      
      System.out.println();
      System.out.println();
      
      //Show the product of the row and column numbers
      System.out.println( "The products of the row and column numbers: ");
      for ( i = 1; i <= row; i++ )
      {
         for ( k = 1; k <= col; k++ )
         {
            cell = String.valueOf(i * k);
            cellLength = cell.length();
            for ( n = cellLength; n < 6; n++)
            {
               System.out.print( space);
            }
            System.out.print( i * k);
         }
         System.out.println();
      }
      
      System.out.println();
      System.out.println();
      
      //Show the cell numbers
      System.out.println( "The table of the cell numbers: ");
      number = 0;
      for ( i = 1; i <= row; i++ )
      {
         for ( k = 1; k <= col; k++ )
         {
            cell = String.valueOf(number);
            cellLength = cell.length();
            for ( n = cellLength; n < 6; n++)
            {
               System.out.print( space);
            }
            System.out.print( number);
            number = number + 1;
         }
         System.out.println();
      }
      
      System.out.println();
      System.out.println();
      
      //Show the row numbers
      System.out.println( "The table of the row numbers: ");
      for ( i = 1; i <= row; i++ )
      {
         System.out.print( i);
         for ( k = 2; k <= col; k++ )
         {
            System.out.print( ",-" );
         }
         System.out.println();
      }
   }
}