/*
 * @author Dogukan Unal
 * @date 04.10.2023
 * This program outputs the sorted version of given array in Java.
*/

import java.util.Scanner;

public class SortArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of integers: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the integers: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int[] sortedArr = sort(arr.clone());
    System.out.println("---------- Unsorted array ----------");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println("---------- Sorted array ----------");
    for (int i = 0; i < sortedArr.length; i++) {
      System.out.println(sortedArr[i] + " ");
    }
    sc.close();
  }

  static int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }
}