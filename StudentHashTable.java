package assi;
	
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	class Human {
	    private String dob;  // Date of Birth
	    private String name; // Student Name
	    private String course; // Course Enrolled

	    public Human(String dob, String name, String course) {
	        this.dob = dob;
	        this.name = name;
	        this.course = course;
	    }

	    @Override
	    public String toString() {
	        return "DOB: " + dob + ", Name: " + name + ", Course: " + course;
	    }
	}

	public class StudentHashTable {
	    

		public static void main(String[] args) {
	        HashMap<Integer, Student> studentHashTable = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);

	        // Accepting student data
	        while (true) {
	            System.out.print("Enter Roll No (or -1 to stop): ");
	            int rollNo = scanner.nextInt();
	            if (rollNo == -1) {
	                break; // Exit the loop if the user enters -1
	            }
	            scanner.nextLine(); // Consume newline

	            System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
	            String dob = scanner.nextLine();

	            System.out.print("Enter Student Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter Course Enrolled: ");
	            String course = scanner.nextLine();

	            // Create a new Student object and add it to the hash table
	            Human human = new Human(dob, name, course);
	            studentHashTable.put(rollNo, human);
	            System.out.println("Student added successfully.\n");
	        }

	        // Printing the hash table
	        System.out.println("\n--- Student Hash Table ---");
	        for (Map.Entry<Integer, Student> entry : studentHashTable.entrySet()) {
	            System.out.println("Roll No: " + entry.getKey() + ", " + entry.getValue());
	        }

	        // Closing the scanner
	        scanner.close();
	    }
	}


