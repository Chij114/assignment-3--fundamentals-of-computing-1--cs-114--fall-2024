import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inputSize;

    System.out.print("Please enter the size of your matrix: ");
    inputSize = input.nextInt();

    Matrix myMatrix = new Matrix(inputSize);

    input.close();

    System.out.println("Printing matrix with default values:");
    System.out.println();

    myMatrix.printMatrix();

    myMatrix.populateMatrix();
    myMatrix.printMatrix();

    myMatrix.flipMatrix();
    myMatrix.printMatrix();
  }
}
