/*
 * @author Dogukan Unal
 * @date 24.10.2024
 * This program evaluates the given operation's result.
*/

import java.util.Stack;

public class Evaluation {
  public static void main(String[] args) {
    System.out.println(evaluateExp("(1 + 5) * 3-12 / 4 + 9 * (9/3-2) - (512 / 16)")); // -8
    System.out.println(evaluateExp("((12 + (5 * 2)) - 3) / ((4 + 2) * (3 - 1))")); // 1
    System.out.println(evaluateExp("(8 * (3 + 6) - (14 / (7 / 2))) + (5 * (3 - 2))")); // 73
    System.out.println(evaluateExp("((20 / (4 + 1)) * (9 - 3) + (8 * (2 + 2))) / 2")); // 28
    System.out.println(evaluateExp("((25 * 3) - (48 / (4 * 2)) + (18 / (3 - 1))) * (5 - 2)")); // 234
    System.out.println(evaluateExp("(15 * ((12 - (5 + 3)) * (8 / 4) + 6)) / (9 - (3 / 3))")); // 26
  }

  public static int evaluateExp(String expression) {
    Stack<Character> opStack = new Stack<>();
    Stack<Integer> valStack = new Stack<>();
    expression += '$';
    // debugger("expression: " + expression);
    String lastElement = "digit";

    for (int i = 0; i < expression.length(); i++) {
      // debugger(i + ". iteration - opStack.size = " + opStack.size() + " | valStack.size = " + valStack.size()
          // + " | lastElement = " + lastElement);
      char c = expression.charAt(i);
      if (Character.isDigit(c)) {
        String str = "" + c;
        int num = Integer.parseInt(str);
        if (lastElement.equals("digit")) { // if last char was a value
          int val = valStack.pop();
          val = 10 * val + num;
          valStack.push(val);
        } else {
          valStack.push(num);
        }
        lastElement = "digit";
        // debugger("character is a digit: " + num);
      } else if (c == ' ') {
        // debugger("There is a space.");
        lastElement = "space";
        continue;
      } else if (c == '$') {
        lastElement = "operator";
        // debugger("" + c);
        while (!opStack.isEmpty()) {
          char op = opStack.pop();
          doOp(op, valStack);
        }
      } else {
        lastElement = "operator";
        // debugger("This is an operator: " + c);
        if (c == '(') {
          opStack.push(c);
        } else if (c == ')') {
          while (opStack.peek() != '(') {
            char op = opStack.pop();
            doOp(op, valStack);
          }
          opStack.pop();
        } else if (opStack.isEmpty()) {
          opStack.push(c);
        } else {
          while (!opStack.isEmpty() && precedence(opStack.peek()) >= precedence(c)) {
            // debugger("error on last part maybe");
            char op = opStack.pop();
            doOp(op, valStack);
          }
            opStack.push(c);
        }
      }
    }
    return valStack.pop();
  }

  public static void debugger(String message) {
    System.out.println(message);
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  // public static void repeatOps(Stack<Character> opStack, Stack<Integer>
  // valStack) {
  // if (!opStack.isEmpty() && valStack.size() > 1) {
  // char op = opStack.pop();
  // doOp(op, valStack);
  // } else {
  // System.out.println("Something went wrong in ending ops.");
  // }
  // }

  public static void doOp(char op, Stack<Integer> valStack) {
    int y = valStack.pop();
    int x = valStack.pop();
    switch (op) {
      case '+':
        valStack.push(x + y);
        // debugger("in operation: " + (x + y));
        break;
      case '-':
        valStack.push(x - y);
        // debugger("in operation: " + (x - y));
        break;
      case '/':
        valStack.push(x / y);
        // debugger("in operation: " + (x / y));
        break;
      case '*':
        valStack.push(x * y);
        // debugger("in operation: " + (x * y));
        break;
      default:
        break;
    }
  }

  public static int precedence(char op) {
    if (op == '*' || op == '/') {
      return 2;
    } else if (op == '+' || op == '-') {
      return 1;
    } else {
      return 0;
    }
  }
}
