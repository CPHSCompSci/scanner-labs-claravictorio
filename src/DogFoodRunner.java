//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("DogFood.txt"));
		   
		   while (scan.hasNextLine())
		   {
			   String line = scan.nextLine();
			   DogFood df = new DogFood(line);
			   
			   System.out.println(line);
			   System.out.println(df.getAmount());
			   System.out.println(df);
		   }
	}
}