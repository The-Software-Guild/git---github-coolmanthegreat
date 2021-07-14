
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author james
 */
public class LuckySevens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int currMoney = -1;
        
        //Checks for a valid input
        while (currMoney == -1) {
            System.out.println("How many dollars do you have?");
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("You did not enter anything in, please try again");
            } else {
                try {
                    currMoney = Integer.parseInt(input);
                } catch (Exception e) {
                    System.out.println("That is not a numerical number, please try again");
                }
            }
        }

        //Creates variables
        int maxMoney = currMoney;
        int rolls = 0;
        int rollsAtMax = 0;
        Random rng = new Random();
        
        //This is something extra I added. Keeps track of the largest win streak 
        int currStreak = 0;
        int maxStreak = 0;
        
        
        //Rolls 2 dice until there is no money left
        while (currMoney > 0) {
            int firstDice = rng.nextInt(6) + 1;
            int secondDice = rng.nextInt(6) + 1;
            rolls++;
            if (firstDice + secondDice == 7) {
                currMoney += 4;
                currStreak++;
                if (maxMoney < currMoney) {
                    maxMoney = currMoney;
                    rollsAtMax = rolls;
                }
                if (maxStreak < currStreak) {
                    maxStreak = currStreak;
                }
            } else {
                currMoney--;
                currStreak = 0;
            }

        }
        System.out.println("You are broke after " + rolls + " rolls");
        System.out.println("You should have quit after " + rollsAtMax + " rolls when you had $" + maxMoney);
        System.out.println("Your longest win streak was " + maxStreak + " wins");
    }

}
