/*
 * @author Dogukan Unal
 * @date 10.10.2023
 * Simple number guessing game.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class NumberGuess {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int num = rd.nextInt(100);
    System.out.print("Welcome! You have 5 tries in total. Guess the number: ");
    int guess = -1;
    int tries = 4;
    int[] arr = new int[5];
    int counter = 0;
    while (guess != num) {
      guess = sc.nextInt();
      if (guess == num) {
        System.out.println("Congrats! You won!");
        break;
      } else {
        System.out.print("Wrong guess. ");
        arr[counter] = guess;
        counter++;
        if (tries > 0) {
          if (guess > num) {
            System.out.println("The number is less than your guess.");
          } else {
            System.out.println("The number is greater than your guess.");
          }
          System.out.print("You have " + tries + " tries left. Guess the number: ");
          tries--;
        } else {
          System.out.println("You lost... The answer was: " + num);
          System.out.println("Your guesses: " + Arrays.toString(arr));
          break;
        }
      }
    }
    sc.close();
  }
}