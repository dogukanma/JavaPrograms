/*
 * @author Dogukan Unal
 * @date 13.09.2023
 * This program decides whether a given year is a leap year or not
*/

import java.util.Scanner;

public class LeapYear {
  public static void main(String[]args){

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the year: ");
  int year = sc.nextInt();
  boolean decide = false;
  if(year < 0){
    System.out.println("Enter a number greater than 100.");
    sc.close();
    return;
  } else if(year % 4 == 0){
    if(year % 100 == 0){
      if(year % 400 == 0){
        decide = true;
      } else{
        decide = false;
      }
    } else{
      decide = true;
    }
  }
  if(decide == true){
    System.out.print("" + year + " is a leap year.");
  } else{
    System.out.print("" + year + " is not a leap year.");
  }
  sc.close();

  }
}
