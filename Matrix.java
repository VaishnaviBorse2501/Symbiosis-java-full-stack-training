package assi;

import java.util.Scanner;

public class Matrix{
	public static boolean searchMatrix(int[][] matrix, int target) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == target) {
					System.out.println("Number " + target + " found at position: (" + i + ", " + j + ")");
					return true;
					}
				}
			}
		return false;
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int cols = scanner.nextInt();
		
		int[][] matrix = new int[rows][cols];
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
				}
		}
		
		System.out.print("Enter the number to search: ");
		int target = scanner.nextInt();
		boolean found = searchMatrix(matrix, target);
		
		if (!found) {
			System.out.println("Number " + target + " not found in the matrix.");
			}
		
		scanner.close();
		}
	}



