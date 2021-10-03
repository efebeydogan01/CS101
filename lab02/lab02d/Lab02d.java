import java.util.Scanner;

/**
 * __A program for determining how many flowers can be planted in a triangular garden.__
 * @author __Efe Beydoðan__
 * @version 1.0 15.10.2019
 */ 
public class Lab02d
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
      
      //Ask for side lengths
      System.out.println( "Please enter the length of the first side ");
      side1 = scan.nextInt();
      
      System.out.println( "Please enter the length of the second side ");
      side2 = scan.nextInt();
      
      System.out.println( "Please enter the length of the third side ");
      side3 = scan.nextInt();
      
      //Calculate semi-perimeter
      s = (side1 + side2 + side3)/2;
         
      //Compute area
      area = Math.sqrt ( s * (s-side1) * (s-side2) * (s-side3));
     
      //Find number of flowers that can be planted
      flowers = area * FLOWER_PER_SQ;
      flowers2 = Math.floor(flowers);
      
      System.out.print( "You can plant ");
      System.out.print( flowers2);
      System.out.println( " flowers in your garden");
      
      //Thank you message
      System.out.print( "Thank you for using this program, see you.");
      
   }
     

}