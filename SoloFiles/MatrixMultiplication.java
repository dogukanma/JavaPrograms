/*
 * @author Dogukan Unal
 * @date 09.03.2024
 * This is a program contains methods to create matrices with specific formulas and multiply matrices. I wrote this program to help my homework
 */

public class MatrixMultiplication {
  public static void main(String[] args) {
    double[][] matrixA = createMatrix(4, 10);
    matrixA = formMatrixA(matrixA);
    double[][] matrixB = createMatrix(10, 3);
    matrixB = formMatrixB(matrixB);
    double[][] matrixAB = multiplyMatrix(matrixA, matrixB);
    System.out.println(matrixAB[1][0]);
  }

  public static double[][] createMatrix(int row, int col) {
    double[][] matrix = new double[row][col];
    return matrix;
  }

  // O(n^3)
  public static double[][] multiplyMatrix(double[][] firstMatrix, double[][] secondMatrix) {
    double[][] multipliedMatrix = new double[firstMatrix.length][secondMatrix[0].length];
    for (int i = 0; i < firstMatrix.length; i++) {
      for (int j = 0; j < secondMatrix[0].length; j++) {
        for (int k = 0; k < firstMatrix[0].length; k++) {
          multipliedMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
        }
      }
    }
    return multipliedMatrix;
  }

  // O(n^2)
  public static double[][] formMatrixA(double[][] matrixA) {
    double[][] newMatrix = matrixA.clone();
    for (int i = 0; i < newMatrix.length; i++) {
      for (int j = 0; j < newMatrix[0].length; j++) {
        newMatrix[i][j] = (j + 1) / (double) (j + i + 2);
      }
    }
    return newMatrix;
  }

  // O(n^2)
  public static double[][] formMatrixB(double[][] matrixB) {
    double[][] newMatrix = matrixB.clone();
    for (int i = 0; i < newMatrix.length; i++) {
      for (int j = 0; j < newMatrix[0].length; j++) {
        newMatrix[i][j] = (j + 1) / (double) ((Math.pow((i + 1), 2)) + i + 1);
      }
    }
    return newMatrix;
  }
}
