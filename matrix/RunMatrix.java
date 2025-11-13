import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int matrixSize;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the size of your matrix: ");
    matrixSize = input.nextInt();
    System.out.println();

    Matrix matrix = new Matrix(matrixSize);

    System.out.println("Printing matrix with default values:");
    matrix.printMatrix();
    System.out.println();

    System.out.println("Populating matrix...matrix populated");
    matrix.populateMatrix();
    System.out.println();

    System.out.println("Printing matrix:");
    matrix.printMatrix();
    System.out.println();

    System.out.println("Flipping matrix...matrix flipped");
    matrix.flipMatrix();
    System.out.println();

    System.out.println("Printing flipped matrix:");
    matrix.printMatrix();

    input.close();
  }
}
