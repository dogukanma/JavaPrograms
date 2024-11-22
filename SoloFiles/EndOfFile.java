/*
 * @author Dogukan Unal
 * @date 22.09.2023
 * Hackerrank Java End-of-file => https://www.hackerrank.com/challenges/java-end-of-file/problem
*/

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
import java.util.Scanner;

public class EndOfFile {

  public static void main(String[] args) {
    int count = 0;
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      count++;
      System.out.print(count + " ");
      System.out.println(sc.nextLine());
    }
    sc.close();
  }
}
