package assi;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Scanner;

	class Employee {
	    private int empId;
	    private String name;
	    private double salary;
	    private String location;

	    public Employee(int empId, String name, double salary, String location) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	        this.location = location;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public String getLocation() {
	        return location;
	    }

	    @Override
	    public String toString() {
	        return "Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary + ", Location: " + location;
	    }
	}

	public class EmployeeManagement {
	    private List<Employee> employees;
	    private Scanner scanner;

	    public EmployeeManagement() {
	        employees = new ArrayList<>();
	        scanner = new Scanner(System.in);
	    }

	    public void addEmployee() {
	        System.out.print("Enter Employee ID: ");
	        int empId = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        System.out.print("Enter Employee Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Employee Salary: ");
	        double salary = scanner.nextDouble();
	        scanner.nextLine(); // Consume newline
	        System.out.print("Enter Employee Location: ");
	        String location = scanner.nextLine();

	        Employee employee = new Employee(empId, name, salary, location);
	        employees.add(employee);
	        System.out.println("Employee added successfully.");
	    }

	    public void searchEmployee() {
	        System.out.print("Enter Employee ID to search: ");
	        int empId = scanner.nextInt();
	        boolean found = false;

	        for (Employee employee : employees) {
	            if (employee.getEmpId() == empId) {
	                System.out.println("Employee found: " + employee);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Employee with ID " + empId + " not found.");
	        }
	    }

	    public void sortEmployees() {
	        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
	        System.out.println("Employees sorted by salary:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }

	    public void displayMenu() {
	        while (true) {
	            System.out.println("\n--- Employee Management System ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Search Employee");
	            System.out.println("3. Sort Employees by Salary");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    addEmployee();
	                    break;
	                case 2:
	                    searchEmployee();
	                    break;
	                case 3:
	                    sortEmployees();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        EmployeeManagement management = new EmployeeManagement();
	        management.displayMenu();
	    }
	}


