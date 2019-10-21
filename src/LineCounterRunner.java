//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;  

public class LineCounterRunner
{
   public static void main( String args[] ) throws FileNotFoundException
   {		   
	   Scanner scan = new Scanner(new File("LineCounter.txt"));
	   
	   while (scan.hasNextLine())
	   {
		   String line = scan.nextLine();
		   LineCounter lc = new LineCounter(line);
		   
		   System.out.println(line);
		   System.out.println(lc);
	   }
	   
	}
}