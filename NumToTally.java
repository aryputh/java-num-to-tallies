import java.util.Scanner;

public class NumToTally
{
   public static void main(String[] args)
   {
      //Creates a scanner object to get input from the user.
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a number to convert to tally marks...");
      
      //Sets the number value based on what the user responds with.
      int number = input.nextInt();
      System.out.println("Converting " + number + " to tallies...");
      
      //Close the scanner since it isn't in use.
      input.close();
      
      //Adds a visually appealing spacer.
      System.out.println("------------------------------");
      
      //Find the number of fives the number has.
      int numOfFives = number / 5;
      System.out.println("Number of fives: " + numOfFives);
      
      //Adds a visually appealing spacer.
      System.out.println("------------------------------");
      
      //Find the number of ones the number has.
      int numOfOnes = number % 5;
      System.out.println("Number of ones: " + numOfOnes);
      
      //Adds a visually appealing spacer.
      System.out.println("------------------------------");
      
      //Print the final output with groups of five and groups of 1.
      String tallyFinal = "";
      for (int i = 0; i < numOfFives; i++)
      {
         tallyFinal = tallyFinal + "5";
      }
      for (int i = 0; i < numOfOnes; i++)
      {
         tallyFinal = tallyFinal + "1";
      }
      
      //Print out the final tally marks.
      System.out.println(tallyFinal);
   }
}