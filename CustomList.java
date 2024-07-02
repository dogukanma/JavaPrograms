/*
 * @author Dogukan Unal
 * @date 02.07.2024
 * This program imitates a data structure similar to List in Java.
*/

public class CustomList {
  public static void main(String[] args) {
    // MyList<Integer> test = new MyList();
    // test.add(3);
    // test.add(2);
    // test.add(1);
    // test.add(4);
    // test.add(5);
    // test.add(6);
    // test.add(7);
    // test.add(8);
    // test.add(9);
    // test.add(10);
    // System.out.println(test.size());
    // System.out.println(test.getCapacity());
    // test.add(23432);
    // System.out.println(test);
    // System.out.println(test.size());
    // System.out.println(test.getCapacity());
  }
}

class MyList<T> {
  private T[] array;
  private int initialCapacity;
  private int counter = 0;

  MyList() {
    this.initialCapacity = 10;
    this.array = (T[]) new Object[initialCapacity];
  }

  MyList(int capacity) {
    this.initialCapacity = capacity;
  }

  public int size() {
    return counter;
  }

  public int getCapacity() {
    return this.array.length;
  }

  public void add(T data) {
    if (counter == array.length) {
      T[] newArr = (T[]) new Object[array.length * 2];
      System.arraycopy(array, 0, newArr, 0, array.length);
      this.array = newArr;
    }
    this.array[counter] = data;
    counter++;
  }

  public T get(int index) {
    if (index >= counter || index < 0) {
      return null;
    } else {
      return array[index];
    }
  }

  public T remove(int index) {
    if (index >= counter || index < 0) {
      return null;
    } else {
      T element = array[index];
      for (int i = index + 1; i < array.length; i++) {
        T second = array[i];
        array[i - 1] = second;
      }
      counter--;
      return element;
    }
  }

  public String toString(){
    String output = "[";
    for(int i = 0; i < counter - 1; i++){
      output += array[i] + ", ";
    }
    output += array[counter - 1] + "]";
    return output;
  }

}