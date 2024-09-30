package screen;
/* java program create a hashtable or student data like (rollno,dateofbirth)
studentname and course enrolled where rollno is the key will be hashtable and 
print the hashtable. 
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Hashtable;

class StudentHash {
    private String dateOfBirth;
    private String name;
    private String course;

    public StudentHash(String dateOfBirth, String name, String course) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Date of Birth: " + dateOfBirth + ", Course: " + course;
    }
}

public class Smanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, StudentHash> students = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of students: ");
            int numberOfStudents = sc.nextInt();
            sc.nextLine();  

            for (int i = 0; i < numberOfStudents; i++) {
                System.out.print("Enter roll number: ");
                int rollNo = sc.nextInt();
                sc.nextLine(); 

                if (rollNo < 0) {
                    System.out.println("Roll number cannot be negative. Please enter again.");
                    i--;
                    continue;
                }

                System.out.print("Enter date of birth (YYYY-MM-DD): ");
                String dateOfBirth = sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter course enrolled: ");
                String course = sc.nextLine();

                students.put(rollNo, new StudentHash(dateOfBirth, name, course));
            }

            System.out.println("\nStudent Data in Hashtable:");
            for (Integer rollNo : students.keySet()) {
                System.out.println("Roll No: " + rollNo + ", " + students.get(rollNo));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
        } finally {
            sc.close();
        }

	}

}
