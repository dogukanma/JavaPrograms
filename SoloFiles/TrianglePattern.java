/*
 * @author Dogukan Unal
 * @date 14.09.2023
 * This program outputs a triangle pattern on terminal.
*/

import java.util.Scanner;

public class TrianglePattern {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("How many lines do you want your triangle to be? => ");
    int line = sc.nextInt();
    int temp = line;
    for(int i = 1; i <= line; i++){
      for(int k = 0; k < temp - 1; k++){
        System.out.print(" ");
      }
      temp--;
      for(int j = 0; j < (i * 2 - 1); j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();

  }
}

//     *
//    ***
//   *****
//  *******
// *********