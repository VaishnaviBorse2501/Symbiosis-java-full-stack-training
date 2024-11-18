package assi;

import java.util.Scanner;

	class Teacher {
	    private String name;
	    private String subject;

	    public Teacher(String name, String subject) {
	        this.name = name;
	        this.subject = subject;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getSubject() {
	        return subject;
	    }
	}

	class Star {
	    private String name;
	    private String department;

	    public Star(String name, String department) {
	        this.name = name;
	        this.department = department;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDepartment() {
	        return department;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Accepting data for the teacher
	        System.out.print("Enter teacher's name: ");
	        String teacherName = scanner.nextLine();
	        System.out.print("Enter subject taught by the teacher: ");
	        String subject = scanner.nextLine();
	        
	        // Creating Teacher object
	        Teacher teacher = new Teacher(teacherName, subject);
	        
	        // Accepting data for the student
	        System.out.print("Enter student's name: ");
	        String studentName = scanner.nextLine();
	        System.out.print("Enter student's department: ");
	        String department = scanner.nextLine();
	        
	        // Creating Student object
	        Star star = new Star(studentName, department);
	        
	        // Displaying the message
	        System.out.println(teacher.getName() + " teaches " + teacher.getSubject() + " to the " + star.getDepartment() + " student.");
	        
	        // Closing the scanner
	        scanner.close();
	    }
	}


