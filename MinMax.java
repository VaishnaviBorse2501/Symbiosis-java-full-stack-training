package assi;

import java.util.Scanner;

public class MinMax{
	
	public static void findMinMax(int[] array) {
		int min = array[0];
	    int max = array[0];
	    int minIndex = 0;
	    int maxIndex = 0;
	    
	    for (int i = 1; i < array.length; i++) {
	    	if (array[i] < min) {
	    		min = array[i];
	    		minIndex = i;
	    		}
	    	if (array[i] > max) {
	    		max = array[i];
	    		maxIndex = i;
	    		}
	    	}
	    System.out.println("Minimum value: " + min + " at index: " + minIndex);
	    System.out.println("Maximum value: " + max + " at index: " + maxIndex);
	    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
			}
		findMinMax(array);
		
		scanner.close();
	}
	}



