import java.util.Scanner;

/**
 * A simple calculator
 * @author Efe Beydoðan
 * @version 1.0 06.11.2019
 */ 
public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      Scanner scan2 = new Scanner( System.in);
      
      //constants
      final String ADD = "+";
      final String SUB = "-";
      final String MUL = "*";
      final String DIV = "/";
      
      
      //variables
      double value;
      String operation;
      char operationFirstChar;
      String operationNumberString;
      double operationNumber;
      String operationString;
      
      // program code
      value = 0;
      do
      {
         System.out.println( "------------------");
         System.out.println( "[ " + value + " ]");
         System.out.println( "------------------");
         System.out.println( "+,-,*,/ value");
         System.out.println( "Clear");
         System.out.println( "Quit");
         System.out.println( "------------------");
         System.out.print( "Select: ");
         operation = scan2.nextLine();
         if ( operation.equals( "Clear") || operation.equals( "clear") || operation.equals( "C") || operation.equals( "c") )
         {
            value = 0;
         }
         else if ( operation.equals( "Quit") || operation.equals( "quit") || operation.equals( "Q") || operation.equals( "q") )
         {
            operation = operation;
         }
         else
         {
            operationFirstChar = operation.charAt(0);
            operationNumberString = operation.substring(2);
            operationString = String.valueOf(operationFirstChar);
            operationNumber = Double.valueOf(operationNumberString);
            if ( !operationString.equals( ADD) && !operationString.equals( SUB) && !operationString.equals( MUL) && !operationString.equals( DIV) )
            {
               System.out.println( "Invalid operation!");
            }
            else if ( operationNumberString.equals( "0") && operationString.equals( DIV) )
            {
               System.out.println( "Undefined");
            }
            else
            {
               if (  operationString.equals( ADD) )
               {
                  value += operationNumber;
               }
               else if ( operationString.equals( SUB))
               {
                  value -= operationNumber;
               }
               else if ( operationString.equals( MUL))
               {
                  value *= operationNumber;
               }
               else if ( operationString.equals( DIV))
               {
                  value /= operationNumber;
               }
            }
         }
      } while ( !operation.equals( "Quit") && !operation.equals( "quit") && !operation.equals( "Q") && !operation.equals( "q") );
      
      System.out.print( "Thanks for using Simple Calculator, goodbye");
   }
}      