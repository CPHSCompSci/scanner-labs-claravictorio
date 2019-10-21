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
	   setLine(s);
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getEvenCount()
	{
		int count = 0;
		Scanner chopper = new Scanner(line);
		while (chopper.hasNextInt())
		{
			if (chopper.nextInt() % 2 == 0)
				count++;
		}
		return count;
	}

	public int getOddCount()
	{
		int count = 0;
		Scanner chopper = new Scanner(line);
		while (chopper.hasNextInt())
		{
			if (chopper.nextInt() % 2 == 1)
				count++;
		}
		return count;
	}

	public String toString( )
	{
		return "even count = " + getEvenCount() + "\nodd count = " + getOddCount();
	}
}