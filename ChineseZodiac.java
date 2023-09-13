/*
 * @author Dogukan Unal
 * @date 13.09.2023
 * This program calculates the Chinese Zodiac of user
*/

import java.util.Scanner;

public class ChineseZodiac{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Which year were you born? => ");
    int birthYear = sc.nextInt();
    int zodiacKey = birthYear % 12;
    String chineseZodiac = "";

    switch(zodiacKey){
      case 0:
      chineseZodiac = "Monkey";
      break;
      case 1:
      chineseZodiac = "Rooster";
      break;
      case 2:
      chineseZodiac = "Dog";
      break;
      case 3:
      chineseZodiac = "Pig";
      break;
      case 4:
      chineseZodiac = "Rat";
      break;
      case 5:
      chineseZodiac = "Ox";
      break;
      case 6:
      chineseZodiac = "Tiger";
      break;
      case 7:
      chineseZodiac = "Rabbit";
      break;
      case 8:
      chineseZodiac = "Dragon";
      break;
      case 9:
      chineseZodiac = "Snake";
      break;
      case 10:
      chineseZodiac = "Horse";
      break;
      case 11:
      chineseZodiac = "Sheep";
      break;
      default:
      System.out.println("An error just occurred. Please contact the site admin.");
      sc.close();
      return;
    }
    System.out.print("Your Chinese Zodiac is: " + chineseZodiac);
    sc.close();

  }
}