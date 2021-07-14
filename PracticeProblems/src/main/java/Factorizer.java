
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author james
 */
public class Factorizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num == -1) {
            System.out.println("What number would you like to factor?");
            try {
                num = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("You have not entered a number, please try again");
            }

        }
        int numFactors = 0;
        int sum = 0;
        System.out.println("The factors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                numFactors++;
                sum += i;
            }
        }
        System.out.println("\n" + num + " has " + numFactors + " factors.");
        if (sum - num == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        if (numFactors <= 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
