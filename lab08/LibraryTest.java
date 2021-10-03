import java.util.Scanner;
import books.LibraryBook;
import books.Library;

/**
 * A program to test Library class
 * @author Efe Beydoðan
 * @version 04.12.2019
 */ 
public class LibraryTest
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //constants
      
      //variables
      Library library;
      String cmd;
      String title;
      String author;
      LibraryBook book;
      String cmdFind;
      String dueDate;
         
      // program code
      
      library = new Library();
      
      //Show a menu until the user exits
      do
      {
         System.out.println( "-----------------------------------");
         System.out.println( "Show");
         System.out.println( "Find");
         System.out.println( "Add");
         System.out.println( "Exit");
         System.out.println( "-----------------------------------");
         
         //Receive an input from the user
         System.out.println( "Please enter a command: ");
         cmd = scan.next();
         
         //If the command is Show
         if ( cmd.equals( "Show"))
         {
            System.out.println( library);
         }
         
         //Else if the command is Find
         else if ( cmd.equals( "Find"))
         {
            //Scan the title
            title = scan.next();
            //If a book with the title exists, show the book and give the user the options to loan, return or remove it
            if ( library.findByTitle( title) != null )
            {
               System.out.println( library.findByTitle( title));
               book = library.findByTitle( title);
               
               //Show a menu to the user
               System.out.println( "-----------------------------------");
               System.out.println( "Loan");
               System.out.println( "Return");
               System.out.println( "Remove");
               System.out.println( "Exit");
               System.out.println( "-----------------------------------");
               
               //Receive an input from the user
               System.out.println( "Please enter a Find menu option: ");
               cmdFind = scan.next();
               
               //Do what the user enters
               if ( cmdFind.equals( "Loan"))
               {
                  System.out.println( "Enter the due date: ");
                  dueDate = scan.next();
                  book.loanBook( dueDate);
               }
               else if ( cmdFind.equals( "Return"))
               {
                  book.returnBook();
               }
               else if ( cmdFind.equals( "Remove"))
               {
                  library.remove( book);
               }
            }
            else
            {
               System.out.println( "A book with that title does not exist.");
            }
         }
         
         //Else if the command is Add
         else if ( cmd.equals( "Add"))
         {
            //Get title and author information from the user
            System.out.println( "Please enter the title  of the book: ");
            title = scan.nextLine();
            title = scan.nextLine();
            System.out.println( "Please enter the author of the book: ");
            author = scan.nextLine();
            
            //Add the book to the library
            library.add( title, author);
         }
      } while ( !(cmd.equals( "Exit")));
      System.out.println( "See you later!");
   }
}