package Delgados;
import java.util.Scanner;
public class Delgados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		
		
		double taco , riceAndBeans , TacoSalad , Horchata  , burritos , MexicanPop , chipsAndSalsa ;
		double tamales , enchiladas, fajita;
		double tacoOrdered, riceAndBeansOrdered, TacoSaladOrdered, HorchataOrdered, burritosOrdered, MexicanPopOrdered, chipsAndSalsaOrdered,tamalesOrdered, enchiladasOrdered, fajitasOrdered;
		double tacoPrice= 1.99, riceAndBeansPrice= 2.50, TacoSaladPrice= 5.99, HorchataPrice = 1.99, burritosPrice= 5.99, MexicanPopPrice= 1.99, chipsAndSalsaPrice= 2.00, tamalesPrice= 1.50, enchiladasPrice = 1.00, fajitasPrice = 4.99, total;
		
		
		System.out.println("How many tacos would you like? >>");
		tacoOrdered = input.nextDouble();
		taco = tacoOrdered * tacoPrice;
		
		System.out.println("How many orders of rice and beans would you like? >>");
		riceAndBeansOrdered = input.nextDouble();
		riceAndBeans = riceAndBeansOrdered * riceAndBeansPrice;
		
		System.out.println("How many taco salads would you like? >>");
		TacoSaladOrdered = input.nextDouble();
		TacoSalad = TacoSaladOrdered * TacoSaladPrice;
		
		System.out.println("How many orders of burritos would you like? >>");
		burritosOrdered = input.nextDouble();
		burritos = burritosOrdered * burritosPrice;
		
		System.out.println("How many orders of Mexican Pop would you like? >>");
		MexicanPopOrdered = input.nextDouble();
		MexicanPop = MexicanPopOrdered * MexicanPopPrice;
		
		System.out.println("How many orders of chips and salsa would you like? >>");
		chipsAndSalsaOrdered = input.nextDouble();
		chipsAndSalsa = chipsAndSalsaOrdered * chipsAndSalsaPrice;
		
		System.out.println("How many orders of  tamales would you like? >>");
		 tamalesOrdered = input.nextDouble();
		 tamales =  tamalesOrdered *  tamalesPrice;
		
		System.out.println("How many orders of  enchiladas would you like? >>");
		 enchiladasOrdered = input.nextDouble();
		 enchiladas =  enchiladasOrdered *  enchiladasPrice;
		
		System.out.println("How many orders of  fajitas would you like? >>");
		 fajitasOrdered = input.nextDouble();
		 fajita =  fajitasOrdered *  fajitasPrice;
		
		System.out.println("How many orders of horchata would you like? >>");
		HorchataOrdered = input.nextDouble();
		Horchata = HorchataOrdered * HorchataPrice;
		
		
		total = taco + riceAndBeans + TacoSalad + Horchata + burritos + MexicanPop +  chipsAndSalsa + tamales + enchiladas + fajita;
		
		System.out.println("Your total is $" +total);
		
		
	}

	}

}
