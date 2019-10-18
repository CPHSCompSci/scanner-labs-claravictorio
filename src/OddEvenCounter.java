//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
   }

   public OddEvenCounter(String s)
   {
   }

	public void setLine(String s)
	{
	}

	public int getEvenCount()
	{
		int count= 0;
		return count;
	}

	public int getOddCount()
	{
		int count=0;
		File inputFile = new File("LineCounter.txt");
		   try {
			Scanner fileIn = new Scanner(inputFile);
			while (fileIn.hasNextInt())
			{
				if (fileIn.nextInt() % 2 == 1);
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return count;
	}

	public String toString( )
	{
		return "";
	}
}