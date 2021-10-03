package books;

/**
 * A library class
 * @author Efe Beydoðan
 * @version 04.12.2019
 */
public class Library
{
   // properties
   private LibraryBook b1;
   private LibraryBook b2;
   private LibraryBook b3;
   private LibraryBook b4;
  

   // constructors
   public Library()
   {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   
   // methods
   
   /**
    * Shows if the library is empty or not
    * @return if the library is empty or not
    */
   public boolean isEmpty()
   {
      return (b1 == null) && (b2 == null) && (b3 == null) && (b4 == null);
   }
   
   /**
    * Shows the books in the library
    * @return the books
    */
   public String toString()
   {
      if ( (b1 == null) && (b2 == null) && (b3 == null) && (b4 == null) )
      {
         return "The library is empty.";
      }
      else
      {
         return b1 + "\n" + b2 + "\n" + b3 + "\n" + b4;
      }
   }
   
    /**
    * Adds title and author to a book
    * @param title title of the book
    * @param author author of the book
    */
   public void add( String title, String author )
   {
      if ( b1 == null )
      {
         b1 = new LibraryBook( title, author);
      }
      else if ( b2 == null )
      {
         b2 = new LibraryBook( title, author);
      }
      else if ( b3 == null )
      {
         b3 = new LibraryBook( title, author);
      }
      else if ( b4 == null )
      {
         b4 = new LibraryBook( title, author);
      }
      else
      {
         System.out.println( "There are no available books");
      }
   }
   
   /**
    * Removes a book from the library
    * @param the book which will be removed
    * @return true if book is removed, false if book is not found
    */
   public boolean remove( LibraryBook book )
   {
      if ( b1.equals( book) )
      {
         b1 = null;
      }
      else if ( b2.equals( book) )
      {
         b2 = null;
      }
      else if ( b3.equals( book) )
      {
         b3 = null;
      }
      else if ( b4.equals( book) )
      {
         b4 = null;
      }
      else
      {
         return false;
      }
      return true;
   }
   
   /**
    * Finds a book with the given title
    * @param title the title that will be checked
    * @return the book if it is found, null if it isn't
    */
   public LibraryBook findByTitle( String title )
   {
      if ( b1.getTitle().equals( title) )
      {
         return b1;
      }
      else if ( b2.getTitle().equals( title) )
      {
         return b2;
      }
      else if ( b3.getTitle().equals( title) )
      {
         return b3;
      }
      else if ( b4.getTitle().equals( title) )
      {
         return b4;
      }
      return null;
   }
}