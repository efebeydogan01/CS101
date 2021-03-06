import java.util.Scanner;
import books.LibraryBook;
import books.Library;

/**
 * A program to test LibraryBook class 
 * @author Efe Beydo?an
 * @version 04.12.2019
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
      LibraryBook book4;
      LibraryBook book5;
      LibraryBook book6;
      LibraryBook book7;

      // program code
      //Two references to a single object
      book1 = new LibraryBook( "Calculus", "David Davenport");
      book4 = book1;
      System.out.print( "Two references to a single object using ==: " + (book4 == book1));
      System.out.println( ", Two references to a single object using .equals: " + (book4.equals( book1)));
     
      //Two references to two individual objects with different properties
      book2 = new LibraryBook( "Eng", "Stewart");
      System.out.print( "Two references to two individual objects with different properties using ==: " + (book1 == book2));
      System.out.println( ", Two references to two individual objects with different properties using .equals: " + (book1.equals(book2)));
     
      //Two references to two individual objects with identical relevant properties
      book3 = new LibraryBook( "Eng", "Hakan G?ven");
      book5 = new LibraryBook( "Eng", "Hakan G?ven");
      System.out.print( "Two references to two individual objects with identical relevant properties using ==: " + (book3 == book5));
      System.out.println( ", Two references to two individual objects with identical relevant properties using .equals: " + (book3.equals(book5)));
      
      
      //Clone book 1
      book6 = new LibraryBook( book1);
      System.out.println( "book6: " + book6 + " book1: " + book1);
      
      //Compare authors
      book7 = new LibraryBook( "Math", "Stewart");
      System.out.println( "book2 and book7 have the same author: " + book2.hasSameAuthor( book7)); 
      
      //Compare titles
      System.out.println( "book2 and book3 have the same title: " + book2.hasSameTitle( book3)); 
      
      Library lib = new Library();
      System.out.println( lib.toString());
   }
}