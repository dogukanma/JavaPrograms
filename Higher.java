

public class Higher {
  public static void main(String[] args){
    int num1 = 50;
    int num2 = 200;
    System.out.println("Higher: " + higher(num1, num2));
  }

  public static int higher(int x, int y){
    if(x > y){
      return x;
    } else{
      return y;
    }
  }
  
}