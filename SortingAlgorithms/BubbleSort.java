import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(-1000, 1000);
    }

    System.out.println("Before: ");
    System.out.println(Arrays.toString(arr));

    // Bubble Sort Algorithm
    while(!checker(arr)){
      System.out.println("works");
      for(int i = 0; i < arr.length - 1; i++){
        if(arr[i] > arr[i + 1]){
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }

    System.out.println("After: ");
    System.out.println(Arrays.toString(arr));
  }

  public static boolean checker(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          return false;
        }
      }
    }
    return true;
  }
}