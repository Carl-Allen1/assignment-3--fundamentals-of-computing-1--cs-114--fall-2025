public class Matrix {
  int[][] matrix;

  public Matrix(int size) {
    matrix = new int[size][size];

    System.out.println("Your matrix is " + size + " by " + size);
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];

    matrix[x1][y1] = matrix[x2][y2];

    matrix[x2][y2] = temp;
  }

  public void printMatrix() {
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        int coordSum = j + i;

        if(coordSum == matrix[i].length - 1) {
          System.out.print("\u001B[33m");
        }

        System.out.print(matrix[i][j]);

        if(coordSum == matrix[i].length - 1) {
          System.out.print("\u001B[0m");
        }

        System.out.print("\t");
      }

      System.out.println();
    }
  }

  public void populateMatrix() {
    int currVal = 1;

    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = currVal;

        currVal++;
      }
    }
  }

  public void flipMatrix() {
    for(int i = 0; i < matrix.length - 1; i++) {
      for(int j = 0; j < matrix[i].length - i - 1; j++) {
        swap(i, j, matrix[i].length - i - 1, matrix[i].length - j - 1);
      }
    }
  }
}
