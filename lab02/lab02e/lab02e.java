import java.util.Scanner;

/**
 * Webpage 
 * @author Efe Beydoðan
 * @1.0 16.10.2019
 */ 
public class lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      String title;
      String name;
      String comments;
      int age;
      double salary;

      // program code
      
      //Get necessary information from the user
      
      title = scan.nextLine();
      
      name = scan.nextLine();
    
      age = scan.nextInt();
     
      salary = scan.nextDouble();
      
      comments = scan.nextLine();
      comments = scan.nextLine();
      
      //Run the site
      System.out.println( "<!DOCTYPE html>");
      System.out.println( "<html>");
      System.out.println( "<head>");
      System.out.println( "<title>" + title + "</title>");
      System.out.println( "</head>");
      System.out.println( "<body>");
      System.out.println( "<hr>");
      System.out.println( "<h1>" + name + "</h1>");
      System.out.println( "<p>Age: " + age + "</p>");
      System.out.println( "<p>Salary: " + salary + "</p>");
      System.out.println( "<p>Comments: " + comments + "</p>");
      System.out.println( "<hr>");
      System.out.println( "</body>");
      System.out.print( "</html>");
      
      
     

                         
      
   }

}