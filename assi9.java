package assi;
import java.util.Scanner;
public class assi9 {
	
	    public static void main(String[] args)    
	    {
	        Scanner sc = new Scanner(System.in); 
	        System.out.println("Enter a number: ");  
	        int n = sc.nextInt();  
	        System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
	    }  
	   
	    public static double squareRoot(int num)   
	    {  
	        
	        double temp;  
	        double sqrtroot=num/2;  
	        do   
	        {  
	            temp=sqrtroot;  
	            sqrtroot=(temp+(num/temp))/2;  
	        }   
	        while((temp-sqrtroot)!= 0);  
	        return sqrtroot;  
	   }  
	}


