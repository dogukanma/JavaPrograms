/*
 * @author Dogukan Unal
 * @date 04.10.2023
 * This program outputs the recurring even numbers of an array in Java.
 */

public class FindRecurrings {
  public static void main(String[] args) {
    int[] arr = new int[20];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 10 + 1);
    }
    System.out.println("============= ARRAY =============");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
    System.out.println("========== RECURRING ===========");
    for (int i = 0; i < arr.length; i++) {
      boolean flag = false;
      for (int k = i - 1; k >= 0; k--) {
        if (arr[i] == arr[k]) {
          flag = true;
          break;
        } else {
          flag = false;
        }
        // System.out.print("arr[" + k + "] => " + arr[k] + " | ");
      }
      // System.out.println("flag for arr[" + i + "] => " + flag);
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j] && flag == false) {
          if(arr[i] % 2 == 0){
            System.out.print(arr[i] + ", ");
          }
          break;
        }
      }
    }
  }
}
