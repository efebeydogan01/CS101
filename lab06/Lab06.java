import java.util.Scanner;

/**
 * Methods
 * @author Efe Beydoðan
 * @version 13.11.2019
 */ 
public class Lab06
{
   /**
    * A method that computes and returns x to the power y
    * @param x is the number that will be raised to a power
    * @param y the number that x will be raised to the power of
    * @return x to the power y
    */
   public static double power( double x, int y)
   {
      double power;
      power = 1;
      int i;
      for ( i = 0; i < y; i++ )
      {
         power = power * x;
      }
      return power;
   }
   
   /**
    * A method that computes n factorial
    * @param n the number whose factorial will be computed
    * @return n factorial
    */
   public static long factorial( int n)
   {
      int i;
      long factorial;
      factorial = 1;
      int number;
      number = 0;
      for ( i = n; i >= 1; i-- )
      {
         factorial = factorial * (n - number);
         number++;
      }
      return factorial;
   }
   
   /**
    * A method that prints the reverse of a string
    * @param s the string that will be reversed
    * @return the reverse of the string
    */
   public static String reverse( String s)
   {
      String s1;
      String stringChar;
      char c;
      s1 = "";
      for( int i = (s.length() - 1); i >= 0; i-- )
      {
         c = s.charAt(i);
         stringChar = String.valueOf( c);
         s1 = s1 + stringChar;
      }
      return s1;
   }
   
   /**
    * A method that changes a base2 string to its decimal equivalent
    * @param base2 the string that's in binary
    * @return the decimal equivalent
    */
   public static int toDecimal( String base2)
   {
      int base10;
      base10 = Integer.parseInt(base2, 2);
      return base10;
   }
   
   /**
    * A method that changes a base10 string to its binary equivalent
    * @param base10 the integer that's in decimal
    * @return the binary equivalent
    */
   public static String toBinary( int base10)
   {
      String binary;
      binary = Integer.toBinaryString( base10);
      return binary;
   }
   
   /**
    * A method that computes the sin of a value
    * @param x the value that the sin of will be computed
    * @return the sin of the number
    */
   public static double sin( double x)
   {
      double sin = 0;
      double sinComputation = x;
      for( int i = 1; i <= 10; i++ )
      {
         if ( i % 2 == 1)
         {
            sin = sin + sinComputation;
         }
         else
         {
            sin = sin - sinComputation;
         }
         if ( i != 0 )
         {
            sinComputation = (sinComputation * power( x,2)) / (2 * i * ((2*i)+1));
         }
      }
      return sin;
   }
   
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      // constants
      final String space = " ";
      // variables
      int i;
      String binary1;
      String binary2;
      int decimalSum;
      String sentence;
      String word;
      String wordTotal;
      int sinX;
      double currentSin;
      double sumSin;
      
      
      // CODE
      
      //A table with columns n, n-squared, n-cubed & n to the power 4, for values of n from -1 to 10 inclusive
      System.out.println( "A table with columns n, n-squared, n-cubed & n to the power 4, for values of n from -1 to 10 inclusive");
      for ( i = -1; i <= 10; i++ )
      {
         //Print n
         for ( int k = String.valueOf( i).length(); k < 10; k++ )
         {
            System.out.print( space);
         }
         System.out.print( i);
         //Print n squared
         for ( int k = String.valueOf( power( i,2)).length(); k < 10; k++ )
         {
            System.out.print( space);
         }
         System.out.print( power( i,2));
         //Print n cubed
         for ( int k = String.valueOf( power( i,3)).length(); k < 10; k++ )
         {
            System.out.print( space);
         }
         System.out.print( power( i,3));
         //Print n to the power 4
         for(int k = String.valueOf( power( i,4)).length(); k < 10; k++ )
         {
            System.out.print( space);
         }
         System.out.println( power( i,4));
      }
      
      System.out.println( "---------------------------------------------------");
      System.out.println();
      
      //A table of n and n-factorial, for values of n from 1 to 15
      System.out.println( "A table of n and n-factorial, for values of n from 1 to 15");
      for ( i = 1; i <= 15; i++ )
      {
         //Print n itself
         for ( int k = String.valueOf( i).length(); k < 15; k++ )
         {
            System.out.print( space);
         }
         System.out.print( i);
         //Print n factorial
         for ( int k = String.valueOf( factorial( i)).length(); k < 15; k++ )
         {
            System.out.print( space);
         }
         System.out.println( factorial( i));
      }
      
      System.out.println( "---------------------------------------------------");
      System.out.println();
      
      //Read two binary (base-2) Strings from the user, convert them to decimal, then add them together and print the result in binary form.
      System.out.println( "Read two binary (base-2) Strings from the user, convert them to decimal, then add them together and print the result in binary form.");
      System.out.print( "Please enter the first binary string: ");
      binary1 = scan.nextLine();
      System.out.println();
      System.out.print( "Please enter the second binary string: ");
      binary2 = scan.nextLine();
      System.out.println();
      //Change the binary values to decimal and add them together
      decimalSum = toDecimal( binary1) + toDecimal( binary2);
      //Change the decimal sum value to binary and print it
      System.out.println( "The result of the addition in binary form is: " + toBinary( decimalSum));
      
      System.out.println( "---------------------------------------------------");
      System.out.println();
      
      //Read a line of text from the user and output it again, but with each word reversed.
      System.out.println( "Read a line of text from the user and output it again, but with each word reversed.");
      System.out.print( "Please enter a sentence: ");
      sentence = scan.nextLine();
      System.out.println();
      word = "";
      wordTotal = "";
      for ( i = 0; i < sentence.length(); i++ )
      {
         if ( sentence.charAt( i) == ' ' )
         {
            wordTotal = wordTotal + reverse( word) + " ";
            word = "";
         }
         else
         {
            word = word + String.valueOf( sentence.charAt( i));
         }
      }
      System.out.println( wordTotal + reverse( word));
      
      System.out.println( "---------------------------------------------------");
      System.out.println();
      
      //A table that shows the "raw" calculations for the Taylor series expansion of sin(x), where x is read from the user
      System.out.print( "Please enter the x value that you want to calculate the sin of according to the Taylor series: ");
      sinX = scan.nextInt();
      currentSin = 0;
      sumSin = 0;
      //Print "n"
      for ( int k = "n".length(); k < 25; k++ )
      {
         System.out.print( space);
      }
      System.out.print( "n");
      //Print "(-1)^n"
      for ( int k = "(-1)^n".length(); k < 25; k++)
      {
         System.out.print( space);
      }
      System.out.print( "(-1)^n");
      //Print "x^(2n+1)"
      for ( int k = "x^(2n+1)".length(); k < 26; k++)
      {
         System.out.print( space);
      }
      System.out.print( "x^(2n+1)");
      //Print "(2n+1)!"
      for ( int k = "(2n+1)!".length(); k < 24; k++)
      {
         System.out.print( space);
      }
      System.out.print( "(2n+1)!");
      //Print "Term"
      for ( int k = "Term".length(); k < 30; k++)
      {
         System.out.print( space);
      }
      System.out.print( "Term");
      //Print "Sum"
      for ( int k = "Sum".length(); k < 30; k++)
      {
         System.out.print( space);
      }
      System.out.println( "Sum");
   
      for ( int n = 0; n <= 10; n++ )
      {
         //Print the value of n
         for ( int k = String.valueOf( n).length(); k < 25; k++ )
         {
            System.out.print( space);
         }
         System.out.print( n);
         //Print the value of (-1)^n
         for ( int k = String.valueOf( power( (-1),n)).length(); k < 25; k++ )
         {
            System.out.print( space);
         }
         System.out.print( power( (-1),n));
         //Print the value of x^(2n+1)
         for ( int k = String.valueOf( power( sinX,2*n+1)).length(); k < 25; k++ )
         {
            System.out.print( space);
         }
         System.out.print( power( sinX,(2*n+1)));
         //Print the value of (2n+1)!
         for ( int k = String.valueOf( factorial( (2*n+1))).length(); k < 25; k++ )
         {
            System.out.print( space);
         }
         System.out.print( factorial( (2*n+1)));
         //Print the term itself
         currentSin = power( (-1),n) * power( sinX, (2*n+1)) / factorial( (2*n+1));
         for ( int k = String.valueOf( currentSin).length(); k < 30; k++ )
         {
            System.out.print( space);
         }
         System.out.print( currentSin);
         //Print the sum so far
         sumSin = sumSin + currentSin;
         for ( int k = String.valueOf( sumSin).length(); k < 30; k++ )
         {
            System.out.print( space);
         }
         System.out.println( sumSin);
      }
      
      System.out.println( "---------------------------------------------------");
      System.out.println();
      
      //A comparison of sinx computed by my method and Math.sin(x)
      System.out.println( "The sin of " + sinX + " computed by my method is: " + sin( sinX));
      System.out.println( "The sin of " + sinX + " computed by Math.sin function is: " + Math.sin(sinX));  
   }
}