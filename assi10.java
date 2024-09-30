package assi;
import java.io.*;
public class assi10 {

	    static int getRemainder(int num, int divisor)
	    {
	        return (num - divisor * (num / divisor));
	    }
	 
	    // Driver program to test above functions
	    public static void main(String[] args)
	    {
	 
	        // print 100 % 0;
	        System.out.println(getRemainder(200, 7));
	    }
	}


