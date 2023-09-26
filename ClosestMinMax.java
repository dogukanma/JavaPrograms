/*
 * @author Dogukan Unal
 * @date 26.09.2023
 * This program outputs the numbers that are less than or greater than and closest to given number.
*/

import java.util.Scanner;

public class ClosestMinMax {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1, 7, -4, 9, 2, 0, -15, 6, 28};
    int num = sc.nextInt();
    closest(arr, num);
    sc.close();
  }

  static void closest(int[] arr, int num){
    int greater = num;
    int less = num;
    for(int i = 0; i < arr.length; i++){
      if(greater <= num && arr[i] > num){
        greater = arr[i];
      } else if(less >= num && arr[i] < num){
        less = arr[i];
      }
    }
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > num && (arr[i] - num) < (greater - num)){
        greater = arr[i];
      } else if(arr[i] < num && (num - arr[i]) < (num - less)){
        less = arr[i];
      }
    }
    System.out.println("Greater than and closest number to " + num + " => " + greater);
    System.out.println("Less than and closest number to " + num + " => " + less);
  }
}
