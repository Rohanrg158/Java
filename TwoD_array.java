package test;

import java.util.Scanner;

public class TwoD_matrix {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int columns = sc.nextInt();
		int [][] matrix = new int [rows][columns];
		System.out.println("Enter the matrix elements: ");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Normal Matrix:");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		int[][] transpose = new int[columns][rows];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.println("Transposed Matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}

}
