/*
 * @author Dogukan Unal
 * @date 16.09.2023
 * This program is a simple calculator that can perform different operations.
*/

import java.util.Scanner;

public class Calculator {

  static double addition(Scanner sc){
    System.out.print("How many numbers will you enter? => ");
    int times = sc.nextInt();
    double result = 0;
    for(int i = 1; i <= times; i++){
      System.out.print("Enter " + i + ". number: ");
      double num = sc.nextDouble();
      result += num;
    }
    return result;
  }

  static double subtraction(Scanner sc){
    System.out.print("How many numbers will you enter? => ");
    int times = sc.nextInt();
    double result = 0;
    for(int i = 1; i <= times; i++){
      System.out.print("Enter " + i + ". number: ");
      double num = sc.nextDouble();
      if(i == 1){
        result = num;
        continue;
      }
      result -= num;
    }
    return result;
  }
  
  static double multiplication(Scanner sc){
    System.out.print("How many numbers will you enter? => ");
    int times = sc.nextInt();
    double result = 1;
    for(int i = 1; i <= times; i++){
      System.out.print("Enter " + i + ". number: ");
      double num = sc.nextDouble();
      result *= num;
    }
    return result;
  }

  static double division(Scanner sc){
    System.out.print("How many numbers will you enter? => ");
    int times = sc.nextInt();
    double result = 0;
    for(int i = 1; i <= times; i++){
      System.out.print("Enter " + i + ". number: ");
      double num = sc.nextDouble();
      if(i != 0 && num == 0){
        System.out.println("You can not enter 0 as divisor");
        i = -0;
        continue;
      } else if(i == 1){
        result = num;
        continue;
      } else{
        result /= num;
      }
    }
    return result;
  }

  static double exponent(Scanner sc){
    System.out.println("Important note: You can only enter integers as inputs in this program.");
    System.out.print("Enter number 1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter number 2: ");
    int num2 = sc.nextInt();
    double total = 1;
    if(num2 == 0){
      total = 1;
    } else if(num2 < 0){
      for(int i = 0; i > num2; i--){
        total /= num1;
      }
    } else{
      for(int i = 0; i < num2; i++){
        total *= num1;
      }
    }
    return total;
  }

  static long factorial(Scanner sc){
    System.out.print("Enter a number: ");
    long a = sc.nextLong();
    long result = 1;
    for(int i = 1; i <= a; i++){
      result *= i;
    }
    return result;
  }

  static double mod(Scanner sc){
    System.out.println("Important note: You can only enter integers as inputs in this program.");
    System.out.print("Enter number 1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter number 2: ");
    int num2 = sc.nextInt();
    double precise = num1 / (num2 * 1.0);
    double mod = (precise - (num1 / num2)) * num2;
    return mod;
  }

  static String rectangle(Scanner sc){
    System.out.print("Enter one side's length of the rectangle: ");
    double num1 = sc.nextDouble();
    System.out.print("Enter other side's length of the rectangle: ");
    double num2 = sc.nextDouble();
    double perimeter = (num1 + num2) * 2;
    double area = num1 * num2;
    return ("Perimeter = " + perimeter + "\n" + "Area = " + area);
  }

  static void menu(){
    System.out.println("---------- OPERATION MENU ----------\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
    System.out.println("5 - Exponent Calculation\n6 - Factorial Calculation\n7 - Module Calculation\n8 - Rectangle's Perimeter and Area");
    System.out.println("0 - Exit");
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int choice = 1;
    while(choice != 0){
      menu();
      System.out.print("Please enter the number of operation you would like to perform: ");
      choice = sc.nextInt();
      while(choice < 0 || choice > 8){
        System.out.print("Please enter a number between 0 and 8 => ");
        choice = sc.nextInt();
      }
      switch(choice){
        default:
        System.out.println("Error");
        case 0:
        break;
        case 1:
        System.out.println(addition(sc));
        break;
        case 2:
        System.out.println(subtraction(sc));
        break;
        case 3:
        System.out.println(multiplication(sc));
        break;
        case 4:
        System.out.println(division(sc));
        break;
        case 5:
        System.out.println(exponent(sc));
        break;
        case 6:
        System.out.println(factorial(sc));
        break;
        case 7:
        System.out.println(mod(sc));
        break;
        case 8:
        System.out.println(rectangle(sc));
        break;
      }
    }
    sc.close();
  }
}
