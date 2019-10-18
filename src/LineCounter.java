//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Clara

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		
   }

   public LineCounter(String s)
   {
	   this.line = s;
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getCount()
	{
		/*int count=0;
		File inputFile = new File("LineCounter.txt");
		   try {
			Scanner fileIn = new Scanner(inputFile);
			while (fileIn.hasNextInt())
			{
				fileIn.nextInt();
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return count;*/
		
		String[] nums = line.split(" ");
		return nums.length;
	}

	public String getLine()
	{
		
		return this.line;
	}

	public String toString()
	{
		return getLine();
	}
}