package Exercises;
import java.util.Scanner;
public class pizzaHut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceYes, toppingsChoice, size, PizzaKind, choiceHotDog;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Would you like a pizza? Yes or No >>");
		choiceYes = input.nextLine();
		
		if ("Yes".equalsIgnoreCase(choiceYes));
		{
			System.out.println("You said" + choiceYes + "to having pizza.");
				System.out.println("please choose a size small, medium or large? >>");
				size = input.nextLine();
				if ("small".equalsIgnoreCase(size));
				{
					displayPizzaSize(size);
					displayPizzatype();
					
				}
				if ("medium".equalsIgnoreCase(size));
				{
					
				}
				if ("large".equalsIgnoreCase(size));
				{
					
				}
				
				
				
				
				
				
				
	public static void displayPizzaSize(size)
	{
					System.out.println("You said " + size + " pizza size.");
	}
	
	public static void displayPizzaType(PizzaKind)
				{
					System.out.println("What kind of pizza do You want? "
							+ "\n Pepperoni, Sausage, cheese");
					PizzaKind = input.nextLine();
					if (("Pepperoni".equalsIgnoreCase(PizzaKind) || "Sausage".equalsIgnoreCase(PizzaKind)||("Chesse".equalsIgnoreCase(PizzaKind));
					{
						
					}
				}
				
		
	public static void displayPizzaPrice(size)
	{double mediumCost = 9.99, largeCost = 12.99, smallCost = 6.99;
	
	if("small".equalsIgnoreCase(size));
		System.out.println(smallCost);
		
	}
	
	}
	}
}
