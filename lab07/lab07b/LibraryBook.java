/**
 * A class to borrow a book from the library
 * @author Efe Beydoðan
 * @version 27.11.2019
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
}