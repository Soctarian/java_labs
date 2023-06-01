package edu.ntu.dp;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int MIN_RANDOM = -100;
    static final int MAX_RANDOM = 100;
    static final int MAX_MATRIX_HEIGHT = 20;
    static final int MIN_MATRIX_HEIGHT = 1;
    static final int MAX_MATRIX_WIDTH = 20;
    static final int MIN_MATRIX_WIDTH = 1;
    static final int SELECT_MANUAL_MODE = 1;
    static final int SELECT_RANDOM_MODE = 2;


    static int[][] createMatrix(){

        int height, width;
        Scanner scanner = new Scanner(System.in);


            System.out.println("Enter matrix dimensions: \n HEIGHT: " + MIN_MATRIX_HEIGHT + " to " + MAX_MATRIX_HEIGHT + "\n" +
                    " WIDTH: " + MIN_MATRIX_WIDTH + " to " + MAX_MATRIX_WIDTH);
            System.out.print("Height: ");
            height = scanner.nextInt();
            if (height > 20 || height < 1) {
                System.out.print("MATRIX HEIGHT IS NOT CORRECT! ");
            }
            System.out.print("Width: ");
            width = scanner.nextInt();
            if (width > 20 || width < 1) {
                System.out.print("MATRIX WIDTH IS NOT CORRECT! ");
            }

            int[][] matrix = new int[height][width];

            System.out.println("Choose how to create the matrix: ");
            System.out.println("1. Manually");
            System.out.println("2. Randomly");
            int choice = scanner.nextInt();

            if (choice == SELECT_MANUAL_MODE) {
                System.out.println("Enter matrix elements:");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = scanner.nextInt();
                    }
                }
            } else if (choice == SELECT_RANDOM_MODE) {
                Random random = new Random();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
                    }
                }
            } else {
                System.out.println("ERROR, YOU CHOSE WRONG MODE");
            }

            return matrix;

    }

    public static void printMatrix(int[][] matrix)
    {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int findMaxMatrixValue(int[][] matrix)
    {
        int maxMatrixValue = MIN_RANDOM;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxMatrixValue) {
                    maxMatrixValue = matrix[i][j];
                }
            }
        }
        return maxMatrixValue;
    }
    public static int findMinMatrixValue(int[][] matrix)
    {
        int minMatrixValue = MAX_RANDOM;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minMatrixValue) {
                    minMatrixValue = matrix[i][j];
                }
            }
        }
        return minMatrixValue;
    }
    public static double findAverage(int[][] matrix)
    {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return sum / count;
    }
    public static void main(String[] args) {

        int[][] matrix = createMatrix();
        printMatrix(matrix);
        System.out.println("Max element: " + findMaxMatrixValue(matrix));
        System.out.println("Min element: " + findMinMatrixValue(matrix));
        System.out.println("Average: " + findAverage(matrix));
        //lab1
    }
}

