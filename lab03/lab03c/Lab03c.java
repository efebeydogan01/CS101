import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;

/**
 * Webpage 
 * @author Efe Beydoðan
 * @version 2.0 23.10.2019
 */ 
public class Lab03c
{
   public static void main( String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner( System.in); 
      PrintStream originalStdOut = System.out;
      
      //constants
      final int FIXED_AMOUNT = 100;
      final double FIVE_PRCNT_TAX = 0.95;
      final double FIFTEEN_PRCNT_TAX = 0.85;
      final double TWNTYFIVE_PRCNT_TAX = 0.75;
      final String DOCTYPE = "<!DOCTYPE html>";
      final String HTML = "<html>";
      final String HEAD = "<head>";
      final String TITLE = "<title>";
      final String SLASH_TITLE = "</title>";
      final String SLASH_HEAD = "</head>";
      final String BODY = "<body>";
      final String HR = "<hr>";
      final String HL = "<h1>";
      final String SLASH_HL = "</h1>";
      final String P = "<p>";
      final String SLASH_P = "/<p>";
      final String SLASH_BODY = "</body>";
      final String SLASH_HTML = "</html>";
      

      // variables
      String title;
      String name;
      String comments;
      String taxRate;
      int age;
      double grossSalary;
      double fixedSalary;
      double actualSalary;

      // program code
      
      //Get necessary information from the user
      
      System.out.println( "Please enter the title for the employee's webpage.");
      title = scan.nextLine();
      
      System.out.println( "Please enter the employee's name.");
      name = scan.nextLine();
      
      System.out.println( "Please enter the employee's age.");
      age = scan.nextInt();
      
      //Make sure the entered age value is acceptable
      if ( age < 0)
      {
         System.out.print( "Age can't be negative!");
      }
      else
      {
         System.out.println( "Please enter the employee's salary.");
         grossSalary = scan.nextDouble();
      
         //Make sure the entered gross salary value is acceptable
         if ( grossSalary < 0)
         {
            System.out.print( "Salary can't be negative!");
         }
         else
         {
            if ( grossSalary >= 10000)
            {
               System.out.print( "Salary can't be more than or equal to 10000!");
            }
            else
            {
               //Apply necessary tax rates to the values entered
               fixedSalary = grossSalary - FIXED_AMOUNT;
      
               if ( grossSalary > 5000)
               {
                  actualSalary = fixedSalary * TWNTYFIVE_PRCNT_TAX;
                  taxRate = " 25% ";
               }
               else 
               {
                  if ( grossSalary >= 1000)
                  {
                     actualSalary = fixedSalary * FIFTEEN_PRCNT_TAX;
                     taxRate = " 15% ";
                  }
                  else
                  {
                     actualSalary = fixedSalary * FIVE_PRCNT_TAX;
                     taxRate = " 5% ";
                  }
               }
               
               //Receive any comments about the employee
               System.out.println( "Please enter comments about the employee.");
               comments = scan.nextLine();
               comments = scan.nextLine();
      
               System.setOut( new PrintStream( "magic.htm" ) );
      
               //Run the site
               System.out.println( DOCTYPE);
               System.out.println( HTML);
               System.out.println( HEAD);
               System.out.println( TITLE + title + SLASH_TITLE);
               System.out.println( SLASH_HEAD);
               System.out.println( BODY);
               System.out.println( HR);
               if ( Files.exists( Paths.get( name + ".jpg" ) ) )
               {
                  System.out.println( "<img src=\"" + name + ".jpg\">");
               }
               System.out.println( HL + name + SLASH_HL);
               System.out.println( P + "Age: " + age + SLASH_P);
               System.out.println( P + "Net Salary: " + actualSalary + " (Tax rate: " + taxRate + ")" + SLASH_P);
               System.out.println( P + "Comments: " + comments + SLASH_P);
               System.out.println( HR);
               System.out.println( SLASH_BODY);
               System.out.print( SLASH_HTML);
            }
         }
     
      System.out.close();
      System.setOut( originalStdOut);
      System.out.println( "Webpage created.");
      
      }
   }
}             