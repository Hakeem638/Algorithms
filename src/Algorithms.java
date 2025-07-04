import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithms {
    // Sequential search algorithm
    public static List<Integer> search(int[] array, int k) {
        // Dynamic array to store all matching indexes.
        List<Integer> matchingIndexes = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
               matchingIndexes.add(i);
            }
        }
        return matchingIndexes;
    }


    // Algorithm for finding the max element
    public static int max(int[] array) {
        int maxval = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxval) {
                maxval = array[i];
            }
        }
        return maxval;
    }

    // Algorithm to show if an array contains unique elements
    public static List<Integer>uniqueElement(int[] array) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates.add(array[i]);

                }
                break;
            }
        }
        return duplicates;
    }

    // Matrix multiplication algorithm
    public static double[][] matrixMultiplication(double[][] A, double[][] B) {
        // check if matrices are compatible for multiplication
        if (A == null || B == null || A.length == 0 || A[0].length == 0 || B.length == 0 || B[0].length == 0) {
            throw new IllegalArgumentException("Matrix A and B are null or empty");
        }

        int n = A.length;
        if (A[0].length != n || B[0].length != n) {
            throw new IllegalArgumentException("Matrix A and B must be n-by-n square matrices with same dimensions.");
        }

        // Initialize the result matrix C with zeros
        double[][] C = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0.0;
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    // Algorithm to check the number of binary digits in a positive number's binary representation
    public static int binary(int n) {
        // initialize count to 1 since every integer has at least one binary digit
        int count = 1;
        while (n > 1) {
            count += 1;

            n = n / 2;

        }
        return count;
    }

    // Algorithm for solving n! recursively
    public static long F(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return F(n - 1) * n;
        }
    }

    // Gaussian elimination of an n-by-(n+1) matrix A
    public static void gaussianElimination(double[][] A, int n) {
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 1; j++) {
                // ensure A[i][i] is not zero to avoid division by zero.
                if(A[i][i] == 0) {
                    System.out.println("Warning: Division by zero encountered, matrix might be singular or requires pivoting");
                    return;
                }

                double factor = A[i][j]/A[i][i];
                for (int k = 0; k <= n; k++) {
                    A[j][k] = A[j][k] - factor*A[i][k];
                }
            }
        }
    }

    // A method that would take size of an array and an array.
    public static int[] arrayFunction() {
        Scanner scanner = new Scanner(System.in);
        int size;

        // Validate array size
        while (true) {
            System.out.print("Enter the size of the array (positive integer): ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Error: Size must be a positive integer.");
                }
            } else {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); // clear invalid input
            }
        }

        int[] array = new int[size];

        // Validate array elements
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Enter integer for element " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Error: Please enter a valid integer.");
                    scanner.next(); // clear invalid input
                }
            }
        }

        return array;
    }


    // Method that would take a number with validations.
    public static int numberInput() {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Enter a number : ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
            }
            else {
                System.out.println("Enter a valid positive integer: ");
            }
        }
        return n;
    }


    // Matrix user input Method.

    public static double[][] userMatrix() {
        Scanner scanner = new Scanner(System.in);

        int rows, cols;

        // Take dimensions
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();

        // Declare matrix
        double[][] matrix = new double[rows][cols];

        // Take input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble(); // Use nextDouble for double matrix
            }
        }

        return matrix;
    }


    // Print Matrix method.
    public static void printMatrix(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.println(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

