/*
 * @author Dogukan Unal
 * @date 14.10.2023
*/

package MineSweeper;

import java.util.Scanner;

public class MineSweeper {
  // Declaring properties
  int row;
  int col;
  int numberOfMines;
  int[][] map;
  int[][] board;
  boolean[][] state;
  Scanner sc = new Scanner(System.in);

  void getMapInputs() { // Gets the map inputs required to create the map. (row number, column number)
    System.out.print("Enter the number of rows: ");
    int localRow = sc.nextInt();
    while (localRow < 2) {
      System.out.println("Number of rows can't be less than 2.");
      System.out.print("Enter the number of rows: ");
      localRow = sc.nextInt();
    }
    System.out.print("Enter the number of columns: ");
    int localCol = sc.nextInt();
    while (localCol < 2) {
      System.out.println("Number of columns can't be less than 2.");
      System.out.print("Enter the number of columns: ");
      localCol = sc.nextInt();
    }
    this.row = localRow;
    this.col = localCol;
  }

  int[] getGameInputs() { // Gets the location inputs from user.
    System.out.print("Enter the row location: ");
    int selectRow = sc.nextInt();
    while (selectRow < 0 || selectRow > this.row - 1) {
      System.out.println("Please select an existing row location.");
      System.out.print("Enter the row location: ");
      selectRow = sc.nextInt();
    }
    System.out.print("Enter the column location: ");
    int selectCol = sc.nextInt();
    while (selectCol < 0 || selectCol > this.col - 1) {
      System.out.println("Please select an existing column location.");
      System.out.print("Enter the column location: ");
      selectCol = sc.nextInt();
    }
    int[] result = { selectRow, selectCol };
    return result;
  }

  void createMap() { // Creates the map
    getMapInputs();
    this.map = new int[this.row][this.col];
    this.state = new boolean[this.row][this.col];
    this.numberOfMines = (row * col) / 4;
    while (numberOfMines > 0) {
      int randomRow = (int) (Math.random() * (this.row));
      int randomCol = (int) (Math.random() * (this.col));
      if (this.map[randomRow][randomCol] != 9) {
        this.map[randomRow][randomCol] = 9;
        numberOfMines--;
      }
    }
    numberPlacer();
    this.board = map.clone();
  }

  void numberPlacer() { // Places the number of near mines to every single location.
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        int nearMines = 0;
        if (this.map[i][j] == 9) {
          continue;
        }
        if (i > 0) {
          if (this.map[i - 1][j] == 9) { // check top
            nearMines++;
          }
          if (j > 0) {
            if (this.map[i - 1][j - 1] == 9) { // check top-left
              nearMines++;
            }
          }
          if (j < this.col - 1) {
            if (this.map[i - 1][j + 1] == 9) { // check top-right
              nearMines++;
            }
          }
        }
        if (i < this.row - 1) {
          if (this.map[i + 1][j] == 9) { // check bottom
            nearMines++;
          }
          if (j > 0) {
            if (this.map[i + 1][j - 1] == 9) { // check bottom-left
              nearMines++;
            }
          }
          if (j < this.col - 1) {
            if (this.map[i + 1][j + 1] == 9) { // check bottom-right
              nearMines++;
            }
          }
        }
        if (j > 0) {
          if (this.map[i][j - 1] == 9) { // check left
            nearMines++;
          }
        }
        if (j < this.col - 1) {
          if (this.map[i][j + 1] == 9) { // check right
            nearMines++;
          }
        }
        this.map[i][j] = nearMines;
      }
    }
  }

  void printMap() { // Prints the map
    for (int i = 0; i < this.map.length; i++) {
      for (int j = 0; j < this.map[i].length; j++) {
        System.out.print(this.map[i][j] + " ");
      }
      System.out.println();
    }
  }

  void printBoard() {
    for (int i = 0; i < this.map.length; i++) {
      for (int j = 0; j < this.map[i].length; j++) {
        if(state[i][j] == true){
          System.out.print(this.map[i][j] + " ");
        } else{
          System.out.print("- ");
        }
      }
      System.out.println();
    }
  }

  boolean gameCheck() { // Checks whether the game is over or not.
    for (int i = 0; i < state.length; i++) {
      for (int j = 0; j < state[i].length; j++) {
        if (this.state[i][j] == false && this.map[i][j] != 9) {
          return false;
        }
      }
    }
    return true;
  }

  void run() { // Runs the game.
    createMap();
    printMap();
    System.out.println("Map printed for control. Delete later.");
    System.out.println("===================================");
    boolean gameEnd = gameCheck();
    while (gameEnd == false) {
    int[] selections = getGameInputs().clone();
    int locationRow = selections[0];
    int locationCol = selections[1];
      if (this.map[locationRow][locationCol] == 9) {
        System.out.println("You have pressed a mine. Game over...");
        printMap();
        return;
      } else {
        state[locationRow][locationCol] = true;
        printBoard();
      }
      gameEnd = gameCheck();
      if (gameEnd == true) {
        System.out.println("Congratulations! You have won the game.");
        return;
      }
    }
  }
}