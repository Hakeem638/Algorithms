import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Algorithms hub, which algorithm would you like to use?");

        System.out.println("1. Sequential search\n" +
                        "2. Max element\n" +
                        "3. Unique elements\n" +
                        "4. Recursive !\n" +
                        "5. Check number of Binary digits\n" +
                        "6. Matrix Multiplication\n" +
                        "7. Gaussian Elimination\n");

        System.out.println("Please select an option:");

        int option = (new Scanner(System.in)).nextInt();

        if (option == 1) {
            int[] array2 = Algorithms.arrayFunction();

            Scanner scanner = new Scanner(System.in);
            int k;

            while (true) {
                System.out.println("Enter the search key (positive integer): ");
                if (scanner.hasNextInt()) {
                    k = scanner.nextInt();
                    if (k > 0){
                        break;
                    }
                    else {
                        System.out.println("Enter a positive integer as your key: ");
                    }
                }
                else {
                    System.out.println("Please enter a valid number: ");
                }
            }

            // plays the role of doing int returned in the beginning.
            List<Integer> returned = Algorithms.search(array2,k);

            // now instead of if (returned != -1)
            if (!returned.isEmpty()) {
                System.out.println("The number " + k + " is found at index(es) " + returned + ".");
            }
            else {
                System.out.println("The number " + k + "is not found in the array.");
            }

        }


        if (option == 2) {
            // Finding the maximum element in an array.
            int[] numbers = Algorithms.arrayFunction();
            int maximumNumber = Algorithms.max(numbers);
            System.out.println("The maximum number is " + maximumNumber);
        }


        if (option == 3) {
            // Checking if an array has unique elements.
            int[] numbers = Algorithms.arrayFunction();
            List<Integer> unique = Algorithms.uniqueElement(numbers);
            if (!unique.isEmpty()) {
                System.out.println("The numbers are not unique, the repeated numbers are: " + Arrays.toString(unique.toArray()));
            } else {
                System.out.println("The numbers are unique");
            }
        }


        if (option == 4) {
            // n! recursively
            int number2 = Algorithms.numberInput();
            long factorial = Algorithms.F(number2);
            System.out.println("The factorial of " + number2 + " is " + factorial);
        }


        if (option == 5) {
            // Binary count
            int number1 = Algorithms.numberInput();
            int digit = Algorithms.binary(number1);
            System.out.println("The number of binary digit of " + number1 + " is " + digit);
        }


        if (option == 6) {
            // matrix multiplication
            System.out.println("Enter Matrix A: ");
            double[][] matrixA = Algorithms.userMatrix();
            System.out.println("Enter Matrix B: ");
            double[][] matrixB = Algorithms.userMatrix();

            try {
                double[][] resultMatrix = Algorithms.matrixMultiplication(matrixA, matrixB);

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

        }


        if (option == 7) {
            // Gaussian Elimination
            double[][] matrix = Algorithms.userMatrix();
            System.out.println("Enter the dimension of the Matrix again: ");
            int dimension =  (new Scanner(System.in)).nextInt();

            Algorithms.gaussianElimination(matrix, dimension);
            System.out.println("Matrix after Gaussian elimination is: ");
            Algorithms.printMatrix(matrix, dimension);

            Algorithms.gaussianElimination(matrix, dimension);

        }

    }

}

