/**
 * A class that shows the number of rolls until two sixes are thrown
 * @author Efe Beydoðan
 * @version 27.11.2019
 */
public class DiceGame 
{
   // properties
   private Dice dice;

   // constructors
   public DiceGame()
   {
      dice = new Dice();
   }
   
   // methods
   
   /**
    * Rolls two dice and gives the number of rolls until two sixes
    * @return how many rolls until two sixes
    */
   public int play()
   {
      int counter;
      counter = 0;
      do
      {
         dice.roll();
         counter++;
      } while( dice.getDiceTotal() != 12 );
      return counter;
   }
}