import java.util.Scanner;
 
public class Lab04d_2
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      double d;
      d = 0.1;
      while ( d < 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");
     
   }

}