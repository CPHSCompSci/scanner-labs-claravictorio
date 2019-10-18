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
				OddEvenCounter oec = new OddEvenCounter(fileIn.nextLine());
				System.out.println(oec.toString());
				System.out.println("even count = " + oec.getEvenCount());
				System.out.println("odd count = " + oec.getOddCount() + "\n");

			}
		}
	   catch (FileNotFoundException e) {
			e.printStackTrace();
		}
   }
}