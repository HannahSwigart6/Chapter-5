package Exercises;
import java.util.Scanner;
public class PizzaHut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String choiceYes, toppingsChoice, size, kind, choiceHotDog, price;
		
		
		
		System.out.println("Would you like a pizza?  yes or no >>");
		choiceYes = input.nextLine();
		
		if ("Yes".equalsIgnoreCase(choiceYes))
		{

			System.out.println("You said" + choiceYes + "to having pizza.");
				System.out.println("please choose a size small, medium or large? >>");
				size = input.nextLine();
				if ("small".equalsIgnoreCase(size));
				{
					displayPizzasize();
					displayPizzaKind();
					displayPizzaprice(size);
				}
				if ("medium".equalsIgnoreCase(size));
				{
					displayPizzasize();
					displayPizzaKind();
					displayPizzaprice(size);
				}
				if ("large".equalsIgnoreCase(size));
				{
				displayPizzasize();
				displayPizzaKind();
				displayPizzaprice(size);
				}
				}
	
	}

		private static void displayPizzasize()
		{
			String size = null;
			System.out.println("You said " + size + " pizza size.");
		}
		
		private static void displayPizzaKind()
		{
			Scanner input = new Scanner (System.in);
			String kind, size;
			
			System.out.println("What kind of pizza do You want? "
					+ "\n Pepperoni, Sausage, or cheese");
			kind = input.nextLine();
			if ("Pepperoni".equalsIgnoreCase(kind) || "Sausage".equalsIgnoreCase(kind)||"Chesse".equalsIgnoreCase(kind))
			{
			}
			
			public static void displayPizzaprice(size)
			{
				double mediumCost = 9.99, largeCost = 12.99, smallCost = 6.99;
				
				if("small".equalsIgnoreCase(size))
				{
					System.out.println(smallCost);
				}
				else if ("medium".equalsIgnoreCase(size))
			{
				System.out.println(mediumCost);
			}
				else if ("large".equalsIgnoreCase(size))
			{
				System.out.println(largeCost);
			}
			}
		}
}
