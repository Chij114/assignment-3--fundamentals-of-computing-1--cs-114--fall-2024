public class Matrix {

  private int matrixSize, row, col, keptCol, keptRow;
  private static int[][] matrix;

  public Matrix(int size){
    matrixSize = size;
    matrix = new int[matrixSize][matrixSize];

    System.out.println();
    System.out.println("Your matrix is " + matrixSize + " x " + matrixSize);
  }

  public static void swap(int x1, int y1, int x2, int y2){
    int newX1Y1Element = matrix[y2][x2];
    int newX2Y2Element = matrix[y1][x1];

    matrix[y1][x1] = newX1Y1Element;
    matrix[y2][x2] = newX2Y2Element;
  }

  public void printMatrix(){
    keptCol = matrixSize - 1;
    keptRow = 0;

    System.out.println();

    for(row = 0; row < matrixSize; row++){
      System.out.println();

      for(col = 0; col < matrixSize; col++){
        if(col != keptCol || row != keptRow){
          System.out.print(matrix[row][col] + "\t");
        }
        else{
          System.out.print("\u001B[33m" + matrix[row][col] + "\t" + "\u001B[0m");
        }
      }

      keptCol--;
      keptRow++;
    }

    System.out.println();
    System.out.println();
  }

  public void populateMatrix(){
    System.out.print("Populating matrix... ");

    for(row = 0; row < matrixSize; row++){
      for(col = 0; col < matrixSize; col++){
        matrix[row][col] = (row * matrixSize) + col + 1;
      }
    }

    System.out.println("Matrix populated!");
  }

  public void flipMatrix(){
    System.out.print("Flipping matrix... ");

    int newCol;
    int newRow;
    keptCol = matrixSize - 1;
    keptRow = 0;
    int halfMatrix;

    halfMatrix = (int) (matrixSize / 2) + (matrixSize % 2) - 1;

    for(row = 0; row <= halfMatrix; row++){
      newRow = (int) matrixSize - row - 1;

      if(row < halfMatrix){
        for(col = 0; col < matrixSize; col++){
          newCol = (int) matrixSize - col - 1;

          if(col != keptCol || row != keptRow){
            swap(row, col, newRow, newCol);
          }
        }

        keptCol--;
        keptRow++;
      }
      else{
        for(col = 0; col < halfMatrix; col++){
          newCol = (int) matrixSize - col - 1;

          if(col != keptCol || row != keptRow){
            swap(row, col, newRow, newCol);
          }
        }

        keptCol--;
        keptRow++;
      }
    }

    System.out.print("Matrix flipped!");
  }
}
