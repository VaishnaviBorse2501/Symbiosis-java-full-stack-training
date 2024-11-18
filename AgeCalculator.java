package assi;


	import java.util.Scanner;
	import java.time.LocalDate;
	import java.time.Period;

	public class AgeCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accepting the date of birth from the user
	        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
	        String dobInput = scanner.nextLine();

	        // Parsing the input date
	        LocalDate dob = LocalDate.parse(dobInput);
	        LocalDate currentDate = LocalDate.now();

	        // Calculating the age
	        Period age = Period.between(dob, currentDate);
	        
	        // Displaying the age
	        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

	        // Closing the scanner
	        scanner.close();
	    }
	}


