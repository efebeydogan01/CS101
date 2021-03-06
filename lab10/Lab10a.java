import java.util.*;
import bignumber.*;

/**
 * A program to test BigNums
 * @author Efe Beydo?an
 * @version 18.12.2019
 */ 
public class Lab10a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      BigNum b1;
      BigNum b2;
      BigNum b3;
      BigNum b4;
      BigNum b5;

      // program code
      
      //Show that the constructors are working
      b1 = new BigNum();
      b2 = new BigNum( "1200");
      b3 = new BigNum( b2);
      b4 = new BigNum( "10B0");
      b5 = new BigNum( "2332");
      
      //Print the BigNums
      System.out.println( "b1= " + b1);
      System.out.println( "b2= " + b2);
      System.out.println( "b3 = " + b3);
      System.out.println( "b4 = " + b4);
      System.out.println( "b5 = " + b5);
      
      //Test all methods
      
      //1 - Test equals method
      System.out.println( "b2 equals b3= " + b2.equals( b3));
      System.out.println( "b1 equals b3= " + b1.equals( b3));
      System.out.println( "b2 equals b1= " + b2.equals( b1));
      
      //2 - Test isZero method
      System.out.println( "b1.isZero()= " + b1.isZero());
      System.out.println( "b2.isZero()= " + b2.isZero());
      System.out.println( "b3.isZero()= " + b3.isZero());
      
      //3 - Test shift method
      b3.shift( true);
      System.out.println( "b3 shifted = " + b3);
      
      //4 - Test add method
      System.out.println( "overflow: " + b4.add( b5) + " b4 + b5 = " + b4);
   }
}