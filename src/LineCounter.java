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
	   setLine("");
   }

   public LineCounter(String s)
   {
	   setLine(s);
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getCount()
	{
		int count = 0;
		Scanner chopper = new Scanner(line);
		while (chopper.hasNextInt())
		{
			chopper.nextInt();
			count++;
		}
		return count;
	}

	public String getLine()
	{
		
		return line;
	}

	public String toString()
	{
		return "count = " + getCount();
	}
}