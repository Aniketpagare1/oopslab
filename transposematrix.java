import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns of the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        // Read matrix elements from the user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Transpose the matrix
        int[][] transposeMatrix = transpose(matrix);

        System.out.println("Transpose Matrix:");
        displayMatrix(transposeMatrix);

        scanner.close();
    }

    // Method to calculate the transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Create a new matrix to store the transpose
        int[][] transposeMatrix = new int[columns][rows];

        // Iterate over the original matrix and assign elements to transpose matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Swap rows and columns while assigning elements
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        // Return the transpose matrix
        return transposeMatrix;
    }

    // Method to display the elements of a matrix
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
