//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
	   File inputFile = new File("OELine.txt");
	   try {
			Scanner fileIn = new Scanner(inputFile);
			System.out.println("OddEvenCounter");
			while(fileIn.hasNextLine())
			{
				String line = fileIn.nextLine();
				OddEvenCounter oec = new OddEvenCounter(line);
				System.out.println(line);
				System.out.println(oec);
			}
		}
	   catch (FileNotFoundException e) {
			e.printStackTrace();
		}
   }
}