/**
 * A class that rolls two dice
 * @author Efe Beydoðan
 * @version 27.11.2019
 */
public class Dice
{
   // properties
   private Die die1;
   private Die die2;
      
   // constructors
   public Dice()
   {
      die1 = new Die();
      die2 = new Die();
   }
   
   // methods
   
   /**
    * Rolls two dice and returns their values
    * @return current the sum of the face values
    */
   public int roll()
   {
      return die1.roll() + die2.roll();
   }
   
   /**
    * Gives the current face value of the first die
    * @return current face value of the first die
    */
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }
   
   /**
    * Gives the current face value of the second die
    * @return current face value of the second die
    */
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }
   
   /**
    * Gives the sum of the two face values
    * @return the sum of the face values
    */
   public int getDiceTotal()
   {
      return die1.getFaceValue() + die2.getFaceValue();
   }
   
   /**
    * Converts the sum of the face values to a string
    * @return sum of the face values as a string
    */
   public String toString()
   {
      return String.valueOf( this.getDiceTotal());
   }
}