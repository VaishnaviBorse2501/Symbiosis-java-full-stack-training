package assi;

import java.util.Scanner;

public class Search {
	
	public static int findIndexOfSearchValue(String value, String searchValue) {
		return value.indexOf(searchValue);
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the main string (value): ");
		String value = scanner.nextLine();
		
		System.out.print("Enter the string to search for (searchValue): ");
		String searchValue = scanner.nextLine();
		
		int index = findIndexOfSearchValue(value, searchValue);
		
		if (index != -1) {
			System.out.println("The first occurrence of \"" + searchValue + "\" is at index: " + index);
			} else {
				System.out.println("\"" + searchValue + "\" is not found in the value string.");
				}
		scanner.close();
		}
	}



