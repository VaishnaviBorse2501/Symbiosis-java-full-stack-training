package assi;
	
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your date of joining (YYYY-MM-DD): ");
        String dojInput = scanner.nextLine();

        LocalDate dateOfJoining = LocalDate.parse(dojInput);
        
        LocalDate retirementDate = dateOfJoining.plusYears(58);

        System.out.println("Your retirement date will be: " + retirementDate);

        scanner.close();
    }
}