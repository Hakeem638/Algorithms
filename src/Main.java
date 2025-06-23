import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] num = {2, 5, 6, 8, 9, 1, 4, 0, 7, 3};
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of integer you want to search: ");
        int k = scan.nextInt();

        int returned = Algorithms.search(num, k);
        if (returned != -1) {
            System.out.println("The number is found in Index " + returned);
        } else {
            System.out.println("The number " + k + " was not found in the array");
        }


        int maximumNumber = Algorithms.max(num);
        System.out.println("The maximum number is " + maximumNumber);


        boolean unique = Algorithms.uniqueElement(num);
        if (unique == true) {
            System.out.println("The numbers are unique");
        } else {
            System.out.println("The numbers are not unique");
        }

    // matrix multiplication
        double[][] A = {
                {1, 2},
                {3, 4}
        };

        double[][] B = {
                {5, 6},
                {7, 8}
        };

       try {
            double[][] resultMatrix = Algorithms.matrixMultiplication(A, B);

            // Print the resulting matrix
            System.out.println("Result of Matrix Multiplication: ");
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
           System.out.println("An error occurred: " + e.getMessage());
        }

        // Binary count
        int n = 10;
        int digit = Algorithms.binary(n);
        System.out.println("The number of binary digit of " + n + " is " + digit);


        // n! recursively
        long factorial = Algorithms.F(n);
        System.out.println("The factorial of " + n + " is " + factorial);


        // Gaussian Elimination
        int m = 3;
        double[][] matrix = {
                {2,1,-1,8},
                {3,-1,2,-11},
                {-2,1,2,-3}
        };

        Algorithms.gaussianElimination(matrix, m);
        System.out.println("Matrix after Gaussian elimination is: ");
        printMatrix(matrix, m);




    }
    public static void printMatrix(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.println(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

