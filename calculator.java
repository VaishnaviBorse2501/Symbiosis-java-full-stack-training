package project;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class calculator {
	
         public static void main(String[] args) 
		{
			LocalDate birthdate = LocalDate.of(2004, 05, 01);
			LocalDate currentDate = LocalDate.now();
			int age = calculateAge(birthdate, currentDate);
			System.out.println("Age: " + age + " years");
	    }
        public static int calculateAge(LocalDate birthdate, LocalDate currentDate) 
	    {
	        Period period = Period.between(birthdate, currentDate);
	        return period.getYears();
	    }
	}






