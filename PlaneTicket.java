/*
* @author Dogukan Unal
* @date 13.09.2023
* This program calculates the price of a plane ticket while taking several variables into account and giving discounts accordingly
*/

import java.util.Scanner;

public class PlaneTicket{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    double distance, total;
    int discountRate = 0;
    int age, typeTicket;
    final double pricePerKM = 0.10;
    System.out.print("Enter the distance: ");
    distance = sc.nextDouble();
    System.out.print("Enter your age: ");
    age = sc.nextInt();
    if(age < 1 || age > 150){
      System.out.println("Please enter your true age.");
      System.out.println("Exiting program...");
      return;
    }
    System.out.println("Enter the flight type\n1 => One-way\n2 => Round-trip ");
    typeTicket = sc.nextInt();

    if(typeTicket == 1){
      discountRate += 0;
    } else if(typeTicket == 2){
      discountRate += 20;
    } else{
      System.out.println("Please enter 1 or 2.");
      System.out.println("Exiting program...");
      return;
    }
    if(age < 12){
      discountRate += 50;
    } else if(age >= 12 && age <= 24){
      discountRate += 10;
    } else if(age > 65){
      discountRate += 30;
    }
    total = distance * pricePerKM * (100 - discountRate) / 100;
    System.out.print("Total price => " + total);


  }
}