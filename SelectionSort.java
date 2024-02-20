/*
 * @author Dogukan Unal
 * @date 23.01.2024
 * This program uses Selection Sort Algorithm to sort the custom generated array.
 * O(n^2)
*/

import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the width of array: ");
    int width = sc.nextInt();
    System.out.print("Enter the LOWER limit of range ");
    int min = sc.nextInt();
    System.out.print("Enter the UPPER limit of range ");
    int max = sc.nextInt();
    int[] randomArr = generateArr(width, min, max);
    printArr(sortArr(randomArr));
    sc.close();
  }

  static int[] generateArr(int width, int min, int max) {
    int[] arr = new int[width];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) ((Math.random() * (max - min + 1)) + min);
    }
    return arr;
  }

  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
  }

  static int[] sortArr(int[] arr) {
    // // CONTROL
    // System.out.print("Initial arr: ");
    // printArr(arr);
    // System.out.println();

    // ALGORITHM
    for (int i = 0; i < arr.length; i++) {
      int indexMin = i;
      int min = arr[i];
      for (int j = i; j < arr.length; j++) {
        if(arr[j] < min){
          min = arr[j];
          indexMin = j;
        }
      }
      // SWAP
      int temp = arr[i];
      arr[i] = min;
      arr[indexMin] = temp;

      // // CONTROL
      // System.out.print("After " + i + ". iteration: ");
      // printArr(arr);
      // System.out.println();
    }
    return arr;
  }

}