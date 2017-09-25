package Exercises;
import java.util.Scanner;
public class CondoSales {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int  park = 150000 , lake = 210000 , golf = 170000;
		int num = 1;		
		System.out.println("What kind of view do you want? Enter in the number by you choice."
				+"\nPark Veiw 1"
				+"\nLake View 2"
				+"\nGolf View 3");		
		input = new Scanner(System.in);
		num = input.nextInt();
		
		if(num == 1)
		{
			System.out.println("You chose the Park view. Park View condos will cost " +park);
			 displayGaragePrice(park);
	    	//your price is this
		}
		
		if(num == 2)
	 	{
	 		System.out.println("You chose the Lake view. Lake View condos will cost " +lake);
	 		displayGaragePrice(lake);
	 	}
		if(num == 3)
	 	{
	 		System.out.println("You chose the Golf view. Golf View condos will cost " +golf);
		   displayGaragePrice(golf);
	 	}
		
	}

	private static void displayGaragePrice(int houseChoice) {
		// TODO Auto-generated method stub
		int add = 0;
		final int GaragePrice = 5000;
		String choiceYes = null;
		input = new Scanner(System.in);
		System.out.println("Would you like a garage also? That will cost $5,000 extra?");
        choiceYes = input.nextLine();//string choiceGarage = inputWhatever;
		if ("yes".equalsIgnoreCase (choiceYes))
		{
			add = houseChoice + GaragePrice;
			System.out.println("With garage your total will be "+add);
			
		}

}
}
