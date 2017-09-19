package Exercises;
import java.util.Scanner;
public class EnterYourAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age? >>");
		age = input.nextInt();
		if(age >= 23 & age <=30);
		{
			System.out.println("The user is older then 23, but younger the 30.");
		}
		if (age >=31 & age <=50);
		{
			System.out.println("The user is older then 30, but younger then 50.");
		}
		if (age >=51 & age <=65);
		{
			System.out.println("The user is older then 51, but younger then 65.");
		}
		if (age >= 66 & age <= 100);
		{
			System.out.println("The user is older then 66, but younger then 100.");
		}
		if (age > 18);
		{
			System.out.println("You are under 18 you are not able to vote.");
		}
		
	}

}
