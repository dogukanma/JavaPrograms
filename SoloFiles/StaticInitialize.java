/*
 * @author Dogukan Unal
 * @date 25.09.2023
 * Hackerrank Java Static Initializer Block => https://www.hackerrank.com/challenges/java-static-initializer-block/problem
*/

import java.util.*;

public class StaticInitialize {
  static {
    Scanner sc = new Scanner(System.in);
    int B, H;
    B = sc.nextInt();
    H = sc.nextInt();
    if (B <= 0 || H <= 0) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    } else {
      System.out.println(B * H);
    }
    sc.close();
  }

  public static void main(String[] args) {

  }
}
