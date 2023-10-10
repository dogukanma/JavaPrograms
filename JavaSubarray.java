/*
 * @author Dogukan Unal
 * @date 10.10.2023
 * Hackerrank Java Subarray => https://www.hackerrank.com/challenges/java-negative-subarray/problem.
*/

import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int counter = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n - i; j++){
                int[] arr = new int[j];
                int sum = 0;
                for(int k = 0, y = i; k < j && y < n; k++, y++){
                    arr[k] = A[y];
                }
                for(int f = 0; f < j; f++){
                    sum += arr[f];
                }
                if(sum < 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
        
        sc.close();
    }
}