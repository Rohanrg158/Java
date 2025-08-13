package test;

import java.util.Scanner;

public class array_copy {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int columns = sc.nextInt();
		int [][] matrix = new int [rows][columns];
		System.out.println("Enter the matrix elements: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Normal Matrix:");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		int[][] matrix1 = new int[rows][columns];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns ; j++) {
				matrix1[i][j] = matrix[i][j];
			}
		}
		System.out.println("Copied Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
	}
}
