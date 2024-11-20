package assi;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static int[] removeAdjacentDuplicates(int[] nums) {
		if (nums.length == 0) {
			return nums;
			}
		int[] result = new int[nums.length];
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
          if (i == 0 || nums[i] != nums[i - 1]) {
        	  result[index] = nums[i];
        	  index++;
        	  }
          }
        
        int[] finalResult = new int[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
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
        int[] result = removeAdjacentDuplicates(nums);
        System.out.println("Array after removing adjacent duplicates:");
        printArray(result);

        scanner.close();
    }
}



