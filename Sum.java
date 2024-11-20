package assi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sum {
	
	public static int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
				}
			numMap.put(nums[i], i);
			}
		return new int[] {};
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
		
		System.out.print("Enter the target sum: ");
		int target = scanner.nextInt();
		
		int[] result = findTwoSum(nums, target);
		
		if (result.length == 0) {
			System.out.println("No two numbers add up to the target sum.");
			} else {
				System.out.println("The indices of the two numbers that add up to the target sum are: "
	                               + result[0] + " and " + result[1]);
				}
		scanner.close();
		}
	}


