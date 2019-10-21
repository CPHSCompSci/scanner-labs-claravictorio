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
	   this.amount = 0;
   }

   public DogFood(String line)
   {
		double cups = 0;
		double dailyCups = 0;
		Scanner chopper = new Scanner(line);
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
				dailyCups = 4.5;
			else if (weight <= 79)
				dailyCups = 6.0;
			else if (weight >= 80)
				dailyCups = 7.5;
			
			cups += dailyCups*7;
			
		}
		double pounds = cups/6;
		double bags = pounds/10;
		this.amount = (int)Math.ceil(bags);
		
   }

   public double getAmount()
   {
   	return amount;
   }

	public String toString()
	{
		return (int) amount + " - 10 POUND BAGS";
	}
}