package assi;

import java.util.Scanner;

class Person {
	protected String name;
	protected int age;

public void acceptDetails() {
	Scanner scanner = new Scanner(System.in);
	        
	System.out.print("Enter student's name: ");
	name = scanner.nextLine();
	        
	System.out.print("Enter student's age: ");
	age = scanner.nextInt();
	}
}

class Student extends Person {
	private int[] marks = new int[5];

	public void acceptMarks() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter marks for 5 subjects:");

	for (int i = 0; i < 5; i++) {
		System.out.print("Subject " + (i + 1) + ": ");
	    marks[i] = scanner.nextInt();
	    }
	}
	public char calculateGrade() {
		int total = 0;
	    for (int mark : marks) {
	    	total += mark;
	    	}
	    double average = total / 5.0;
	    
	    if (average >= 90) {
	    	return 'A';
	    	}
	    else if (average >= 80) {
	    	return 'B';
	        }
	    else if (average >= 70) {
	        return 'C';
	        }
	    else if (average >= 60) {
	        return 'D';
	        }
	    else {
	        return 'F';
	        }
	    }
	
	public void displayDetails() {
		System.out.println("\nStudent Details:");
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Grade: " + calculateGrade());
	    }
	}

public class Students {
	public static void main(String[] args) {
		Student student = new Student();
		student.acceptDetails(); 
		student.acceptMarks();   
	    student.displayDetails();
	    }
	}


