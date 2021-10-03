import java.util.Scanner;

/**
 * A program to test LibraryBook class 
 * @author Efe Beydoðan
 * @version 27.11.2019
 */ 
public class TestLibraryBook
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      LibraryBook book1;
      LibraryBook book2;
      LibraryBook book3;

      // program code
      //Enter the information of the books at first and print the results
      System.out.println( "Information of the books at first: ");
      book1 = new LibraryBook( "Big Java", "David Davenport");
      book2 = new LibraryBook( "Calculus", "Stewart");
      book3 = new LibraryBook( "Eng", "Hakan Güven");
      
      System.out.println( book1 + ", " + "Book on loan: " + book1.onLoan());
      System.out.println( book2 + ", " +  "Book on loan: " + book2.onLoan());
      System.out.println( book3 + ", " + "Book on loan: " + book3.onLoan());
      
      System.out.println();
      System.out.println();
      
      //Borrow the books and print information
      System.out.println( "Information of the books after loaning them: ");
      book1.loanBook( "30.11.2019");
      book2.loanBook( "12.12.2019");
      book3.loanBook( "25.12.2019");
      
      System.out.println( book1 + ", " + "Book on loan: " + book1.onLoan());
      System.out.println( book2 + ", " +  "Book on loan: " + book2.onLoan());
      System.out.println( book3 + ", " + "Book on loan: " + book3.onLoan());
      
      System.out.println();
      System.out.println();
      
      //Return the books and print information
      System.out.println( "Information after the books have been returned:");
      
      book1.returnBook();
      book2.returnBook();
      book3.returnBook();
      
      System.out.println( book1 + ", " + "Book on loan: " + book1.onLoan());
      System.out.println( book2 + ", " +  "Book on loan: " + book2.onLoan());
      System.out.println( book3 + ", " + "Book on loan: " + book3.onLoan());
      
      System.out.println();
      System.out.println();
      
      //Borrow only book1 and print information
      System.out.println( "Only book1 borrowed:");
      book1.loanBook( "15.12.2019");
      
      System.out.println( book1 + ", " + "Book on loan: " + book1.onLoan());
      System.out.println( book2 + ", " +  "Book on loan: " + book2.onLoan());
      System.out.println( book3 + ", " + "Book on loan: " + book3.onLoan());
      
      System.out.println();
      System.out.println();
            
      //Return book1 and print information
      System.out.println( "Book1 returned:");
      book1.returnBook();
      
      System.out.println( book1 + ", " + "Book on loan: " + book1.onLoan());
      System.out.println( book2 + ", " +  "Book on loan: " + book2.onLoan());
      System.out.println( book3 + ", " + "Book on loan: " + book3.onLoan());
      
      System.out.println();
      System.out.println();
     
      //Show how many times each book was loaned
      System.out.println( "The amount of times each book were loaned: ");
      System.out.println( "Book1 was loaned " + book1.getTimesLoaned() + " times.");
      System.out.println( "Book2 was loaned " + book2.getTimesLoaned() + " times.");
      System.out.println( "Book3 was loaned " + book3.getTimesLoaned() + " times.");
   }

}