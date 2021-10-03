package library;
import java.util.*;

/**
 * A library class
 * @author Efe Beydoðan
 * @version 11.12.2019
 */
public class Library
{
   // properties
   private ArrayList<LibraryBook> books;
   
   
   // constructors
   public Library()
   {
      books = new ArrayList<LibraryBook>();
   }
   
   // methods
   
   /**
    * Shows if the library is empty or not
    * @return if the library is empty or not
    */
   public boolean isEmpty()
   {
      return books.size() == 0;
   }
   
   /**
    * Shows the books in the library
    * @return the books
    */
   public String toString()
   {
      String booksInLibrary;
      booksInLibrary = "";
      if ( books.size() == 0 )
      {
         return "The library is empty.";
      }
      else
      {
         for ( LibraryBook b : books )
         {
            booksInLibrary = booksInLibrary + b + "\n";
         }
      }
      return booksInLibrary;
   }
   
   /**
    * Adds title and author to a book
    * @param title title of the book
    * @param author author of the book
    */
   public void add( String title, String author )
   {
      books.add( new LibraryBook( title, author ));
   }
   
   /**
    * Removes a book from the library
    * @param the book which will be removed
    * @return true if book is removed, false if book is not found
    */
   public boolean remove( LibraryBook book )
   {
      int counter;
      counter = 0;
      for ( LibraryBook b : books)
      {
         if ( book.equals( b) )
         {
            books.remove( counter);
            return true;
         }
         counter++;
      }
      return false;
   }
   
   /**
    * Finds a book with the given title
    * @param title the title that will be checked
    * @return the book if it is found, null if it isn't
    */
   public LibraryBook findByTitle( String title )
   {
      for ( LibraryBook b : books)
      {
         if ( b.getTitle().equals( title))
         {
            return b;
         }
      }
      return null;
   }
}
      
        
               
        
     