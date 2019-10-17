//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
	   File inputFile = new File("Accounts.txt");
	   try {
		Scanner fileIn = new Scanner(inputFile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   LineCounter lc = new LineCounter();
	}
}