package assi;


	import java.util.Arrays;
	public class Char{
	   public static void checkDupliChar(String str) {
	      System.out.println("The string is: " + str);
	      char[] carray = str.toCharArray();
	      // sorting the character array
	      Arrays.sort(carray);
	      System.out.println("Duplicate Characters in the above string are: ");
	      // for loop to print duplicate character
	      for (int i = 0; i < carray.length - 1; i++) {
	         if (carray[i] == carray[i + 1]) {
	            System.out.println(carray[i]);
	            // loop to skip next occurrence of same character
	            while (i < carray.length - 1 && carray[i] == carray[i + 1]) {
	               i++;
	            }
	         }
	      }
	   }
	   // main method
	   public static void main(String[] args) {
	      checkDupliChar("tutorialspoint");
	   }
	}


