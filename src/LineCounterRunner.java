//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("Enter a group of numbers");
	   String line = scan.nextLine();
	   LineCounter lc = new LineCounter(line);
	}
}