package assi;

import java.util.Scanner;

public class MoveZero {
	
	public static void moveZerosToEnd(int[] nums) {
		int nonZeroIndex = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[nonZeroIndex] = nums[i];
				nonZeroIndex++;
				}
			}
		for (int i = nonZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
			}
		}
	
	public static void printArray(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
			}
		System.out.println();
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();
		
		int[] nums = new int[n];
		
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
			}
		
		moveZerosToEnd(nums);
		
		System.out.println("Array after moving zeros to the end:");
		
		printArray(nums);
		
		scanner.close();
		}
	}



