public class Algorithms {
    // Sequential search algorithm
    public static int search(int[] array, int k) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                return i;
            }
        }
        return -1;
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
    public static boolean uniqueElement(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }

            }
        }
        return true;
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

}

