//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private double amount;

   public DogFood()
   {		
   }

   public DogFood(String line)
   {
		Scanner chopper = new Scanner(line);
		double cups = 0;
		double dailyCups = 0;
		while (chopper.hasNextInt())
		{
			int weight = chopper.nextInt();
			if (weight >= 2 && weight <= 4)
				dailyCups = 0.5;
			else if (weight <= 7)
				dailyCups = 1.0;
			else if (weight <= 9)
				dailyCups = 1.5;
			else if (weight <= 19)
				dailyCups = 2.0;
			else if (weight <= 39)
				dailyCups = 3.5;
			else if (weight <= 59)
				dailyCups = 3.5;
			else if (weight <= 79)
				dailyCups = 3.5;
			else if (weight >= 80)
				dailyCups = 3.5;
			cups += dailyCups*7;
		}

		//calc code goes here

   }

   public double getAmount()
   {
   	return 0;
   }

	public String toString()
	{
		return "";
	}
}