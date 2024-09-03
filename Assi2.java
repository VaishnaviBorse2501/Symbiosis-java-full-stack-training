//Write a menu driven program for basic arithmatic program
package demo1;
import java.util.Scanner;
public class Assi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int add,sub,mult,div, num1,num2,opt;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Addition\n  2.Substraction\n  3.Multiplication\n  4.Division");
        System.out.println("Select one option:");
        opt=sc.nextInt();
        System.out.println("Enter first no.:");
        num1=sc.nextInt();
        System.out.println("Enter second no.:");
        num2=sc.nextInt();
        
        add=num1+num2;
        sub=num1-num2;
        mult=num1*num2;
        div=num1/num2;
        
        switch(opt) {
        case 1:
        	System.out.println("Addition="+add);
        	break;
        case 2:
        	System.out.println("Substraction="+sub);
        	break;
        case 3:
        	System.out.println("Multiplication="+mult);
        	break;
        case 4:
        	System.out.println("Division="+div);
        	break;
        case 5:
        	System.out.println("Not valid");
        	
        }
	}

}
