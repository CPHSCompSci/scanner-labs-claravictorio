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
	   File inputFile = new File("LineCounter.txt");
	   try {
			Scanner fileIn = new Scanner(inputFile);
			System.out.println("LineCounter");
			while(fileIn.hasNextLine())
			{
				LineCounter lc = new LineCounter(fileIn.nextLine());
				System.out.println(lc.toString());
				System.out.println("count = " + lc.getCount() + "\n");
			}
		}
	   catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	   
	}
}