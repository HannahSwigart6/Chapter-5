package Exercises;
import java.util.Scanner;
public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int  park = 150000 , lake = 210000 , golf = 170000, garage = 5000 ;
		int num;
		String choiceGarage;
		System.out.println("What kind of view do you want? Enter in the number by you choice."
				+"\nPark Veiw 1"
				+"\nLake View 2"
				+"\nGolf View 3");		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		int add;
		if(park == 1)
		{
			System.out.println("You chose the Park view. Park View condos will cost " +park);
	       
			System.out.println("Would you like a garage also? That will cost $5,000 extra?");
	        //string choiceGarage = inputWhatever;
			 if("yes".equalsIgnoreCase(choiceGarage))
			{		
					add = park + garage;
					System.out.println( "With garage your total will be "+add);
			
			}
	    	else
	    		System.out.println(" You total is $"+park);
	    	//your price is this
		}
		
		if(lake == 2)
	 	{
	 		System.out.println("You chose the Lake view. Lake View condos will cost " +lake);
		       
	 		System.out.println("Would you like a garage also? That will cost $5,000 extra?");
		        //string choiceGarage = inputWhatever;
		    	if("yes".equalsIgnoreCase(choiceGarage))
				{		
						add = lake + garage;
						System.out.println("With garage your total will be "+add);
				
				}
		    	else
		    		System.out.println(" You total is $"+lake);
		    	//your price is this
	 	}
	 	
	 	
		if(golf == 3)
	 	{
	 		System.out.println("You chose the Golf view. Golf View condos will cost " +golf);
		       
	 		System.out.println("Would you like a garage also? That will cost $5,000 extra?");
		        //string choiceGarage = inputWhatever;
		    	if("yes".equalsIgnoreCase(choiceGarage))
				{		
						add = golf + garage;
						System.out.println("With garage your total will be "+add);
				
				}
		    	else
		    		System.out.println(" You total is $"+golf);
		    	//your price is this
	 	}
		
		
	}

}
