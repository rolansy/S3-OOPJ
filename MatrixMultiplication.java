import java.util.Scanner;
//Trial 1
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of matrices A and B
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();

        // Check if the matrices can be multiplied
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied. Column count of A must be equal to row count of B.");
            return;
        }

        // Input matrix A
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter elements for matrix A:");
        inputMatrix(scanner, matrixA);

        // Input matrix B
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter elements for matrix B:");
        inputMatrix(scanner, matrixB);

        // Multiply the matrices
        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);

        // Display matrices A, B, and their product
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        System.out.println("Product Matrix:");
        displayMatrix(productMatrix);
    }

    // Function to input elements for a matrix
    private static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to multiply two matrices
    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
