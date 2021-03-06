package bignumber;
import java.util.Arrays;

/**
 * A BigNum class
 * @author Efe Beydo?an
 * @version 18.12.2019
 */
public class BigNum
{
   // properties
   public static final int SIZE = 4;
   public static final int BASE = 10;
   private int[] number;
   
   // constructors
   public BigNum()
   { 
      number = new int[SIZE];
   }
   
   public BigNum( String num)
   {
      number = new int[SIZE];
      char numChar;
      int numInt;
      int counter;
      counter = 0;
      for ( int i = num.length() - 1; i >= 0; i-- )
      {
         //Get the char at the last position of the string
         numChar = num.charAt(i);
         //Take the numeric value of the char at last position
         numInt = Character.getNumericValue( numChar);
         //Set the first value of the string to the least significant digit
         number[counter] = numInt;
         counter++;
      }
      //Set all the remaining values in the string to 0
      if ( SIZE > num.length())
      {
         for ( int i = num.length(); i < SIZE; i++ )
         {
            number[i] = 0;
         }
      }
   }
   
   public BigNum( BigNum other)
   {
      number = new int[SIZE];
      this.number = other.number.clone();
   }
   // methods
   
   /**
    * A method that returns BigNum as a string
    * @return BigNum as a string
    */
   public String toString()
   {
      String string;
      string = "";
      for ( int i = 0; i < number.length; i++ )
      {
         if ( number[i] >= 10 )
         {
            string = (char) ( 55 + number[i] ) + string;
         }
         else
         {
            string = number[i] + string; 
         }
      }
      return string;
   }
   
   /**
    * A method that checks if two BigNums are equal or not
    * @param other BigNum to be checked
    * @return whether if BigNums are equal
    */
   public boolean equals( BigNum other)
   {
      for ( int i = 0; i < SIZE; i++ )
      {
         if ( this.number[i] != other.number[i] )
         {
            return false;
         }
      }
      return true;
   }
   
   /**
    * A method that checks if a BigNum is equal to zero
    * @return whether if BigNum is zero or not
    */
   public boolean isZero()
   {
      for ( int x : number)
      {
         if ( x != 0 )
         {
            return false;
         }
      }
      return true;
   }
   
   /**
    * A method that shifts BigNum
    * @param left determines if number will be divided or multiplied by 10
    */
   public void shift( boolean left)
   {
      if ( left)
      {
         //If left is true then shift the numbers up and set the first number to zero
         for ( int i = SIZE - 1; i > 0; i--)
         {
            number[i] = number[i - 1];
         }
         number[0] = 0;
      }
      else
      {
         //If left is false then shift the numbers down and set the last number to zero
         for ( int i = 0; i < SIZE - 1; i++)
         {
            number[i] = number[i + 1];
         }
         number[SIZE - 1] = 0;
      }
   }
   
   /**
    * A method that adds two bignums
    * @param other the bignum that will be added
    * @return the overflow
    */
   public int add( BigNum other)
   {
      int overflow;
      //Set the overflow to 0 at first 
      overflow = 0;
      
      //Add all the digits in the array
      for ( int i = 0; i < SIZE; i++ )
      {
         int sum;
         //Add the digits and the overflow
         sum = this.number[i] + other.number[i] + overflow;
         //If the sum of the digits is bigger than BASE - 1 then subtract the base from the sum and set the overflow to 1
         if ( sum > BASE - 1 )
         {
            overflow = 1;
            sum = sum - BASE;
            this.number[i] = sum;
         }
         //Else if the sum is smaller than or equal to BASE - 1 then the new digit is the sum and there is no overflow
         else
         {
            overflow = 0;
            this.number[i] = sum;
         }
      }
      return overflow;
   }
   
   /**
    * A method that checks if a BigNum is smaller than an other one
    * @param other the BigNum that will be checked
    * @return if the bignum is smaller or not
    */
   public boolean isLessThan( BigNum other)
   {
      for ( int i = BigNum.SIZE - 1; i >= 0; i--)
      {
         //If the first digit is smaller, return true
         if ( this.number[i] < other.number[i])
         {
            return true;
         }
         //Else if the first digit is bigger return false, if they are the same, continue for loop
         else if ( this.number[i] > other.number[i])
         {
            return false;
         }
      }
      //If both are equal return false
      return false;
   }
}

