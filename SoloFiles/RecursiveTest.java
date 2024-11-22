/*
 * @author Dogukan Unal
 * @date 27.02.2024
 * This program outputs the given string's characters as many as the given number. Also takes parameters from command line.
*/

public class RecursiveTest {
  public static void main(String[] args) {
    String str = args[0];
    int num = Integer.parseInt(args[1]);
    if (num <= str.length()) {
      System.out.println(str.substring(0, num));
    } else {
      int n = num;
      while (n > str.length()) {
      System.out.print(str);
      n -= str.length();
      }
      System.out.print(str.substring(0, n));
    }
  }
}
