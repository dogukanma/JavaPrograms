import java.util.Scanner;

public class SortSimple{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    double first, second, third;
    System.out.print("Enter first number: ");
    first = sc.nextDouble();
    System.out.print("Enter second number: ");
    second = sc.nextDouble();
    System.out.print("Enter third number: ");
    third = sc.nextDouble();
    System.out.println("1. Number: " + first);
    System.out.println("2. Number: " + second);
    System.out.println("3. Number: " + third);

    if(first >= second && first >= third){
      if(second >= third){
        System.out.println("" + third + " <= " + second + " <= " + first);
      } else{
        System.out.println("" + second + " <= " + third + " <= " + first);
      }
    } else if(second >= first && second >= third){
      if(first >= third){
          System.out.println("" + third + " <= " + first + " <= " + second);
      } else{
        System.out.println("" + first + " <= " + third + " <= " + second);
      }
    } else{
      if(first >= second){
        System.out.println("" + second + " <= " + first + " <= " + third);
      } else{
        System.out.println("" + first + " <= " + second + " <= " + third);
      }
    }

  }
}