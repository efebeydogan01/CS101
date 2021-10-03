package books;

/**
 * A class to borrow a book from the library
 * @author Efe Beydoðan
 * @version 04.12.2019
 */
public class LibraryBook 
{
   // properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;
   

   // constructors
   public LibraryBook ( String title, String theAuthor )
   {
      this.title = title;
      author = theAuthor;
      dueDate = "";
      timesLoaned = 0;
   }
   
   public LibraryBook ( LibraryBook other )
   {
      title = other.title;
      author = other.author;
      dueDate = other.dueDate;
      timesLoaned = other.timesLoaned;
   }
   
   // methods
   
   /**
    * Gives the information of the book
    * @return information about the book
    */
   public String toString()
   {
      return title + ", " + author + ", " + dueDate + ", " + String.valueOf( timesLoaned);
   }
   
   /**
    * Loans the book, specifies a due date for the borrower to return the book and increases the amount of times loaned
    * @param theDueDate the date at which the book must be returned
    */
   public void loanBook( String theDueDate)
   {
      dueDate = theDueDate;
      timesLoaned++;
   }
   
    /**
    * When the book is returned resets the due date
    */
   public void returnBook()
   {
      dueDate = "";
   }
   
   /**
    * Gives the amount of times the book was loaned
    * @return amount of times the book was loaned
    */
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   
   /**
    * Shows whether the book is on loan or not
    * @return if the book is on loan or not
    */
   public boolean onLoan()
   {
      if ( dueDate.equals( ""))
      {
         return false;
      }
      else 
      {
         return true;
      }
   }
   /**
    * Checks whether two books have the same information
    * @param other book that will be checked with another book
    * @return whether the books have the same title and author or not
    */
   public boolean equals( LibraryBook other)
   {
      return title.equals( other.title) && author.equals( other.author);
   }
   
   /**
    * Checks whether two books have the same title
    * @param other book that will be checked with another book
    * @return whether the books have the same title or not
    */
   public boolean hasSameTitle( LibraryBook other)
   {
      return title.equals( other.title);
   }
   
   /**
    * Checks whether two books have the same author
    * @param other book that will be checked with another book
    * @return whether the books have the same author or not
    */
   public boolean hasSameAuthor( LibraryBook other)
   {
      return author.equals( other.author);
   }
   
   /**
    * Gives the title
    * @return the title
    */
   public String getTitle()
   {
      return title;
   }
   
}