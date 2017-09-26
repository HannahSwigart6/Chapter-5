package Exercises;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class PhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int planA, planB, planC, planD, planE, planF;
		final int planAprice = 49, planBprice = 55, planCprice = 61, planDprice = 70, planEprice = 79, planFprice = 87;
		Scanner input = new Scanner (System.in);
		String UsersChoiceString; 
		
		
		UsersChoiceString = JOptionPane.showInputDialog(null,"Pick a plan that best fits you."
				+"\nPlan A: Less then 500 mins of talk, no text, or data."
				+"\nPlan B: Less then 500 mins of talk and any text messages."
				+"\nPlan C: 500 or more of mins, up to 100 text messages , and no data."
				+"\nPlan D: 100 text messages or more."
				+"\nPlan E: 2 gigabytes of data."
				+"\nPlan F: 2 gigabytes of data or more.");
		
		
		if( "Plan A".equalsIgnoreCase(UsersChoiceString))
		{
			JOptionPane.showMessageDialog(null, " You picked Plan A this will cost $" +planAprice+ " per month.");
			}
		if("Plan B".equalsIgnoreCase(UsersChoiceString))
		{
			JOptionPane.showMessageDialog(null, " You picked Plan B this will cost $" +planBprice+ " per month.");	
		}
		
		if("Plan C".equalsIgnoreCase(UsersChoiceString))
		{
			JOptionPane.showMessageDialog(null, " You picked Plan C this will cost $" +planCprice+ " per month.");	
		}
		
		if( "Plan D".equalsIgnoreCase(UsersChoiceString))
		{
			JOptionPane.showMessageDialog(null, " You picked Plan D this will cost $" +planDprice+ " per month.");	
		}
		
		if("Plan E".equalsIgnoreCase(UsersChoiceString)) 
		{
			JOptionPane.showMessageDialog(null, " You picked Plan E this will cost $" +planEprice+ " per month.");	
		}
		
		if("Plan F".equalsIgnoreCase(UsersChoiceString)) 
		{
			JOptionPane.showMessageDialog(null, " You picked Plan F this will cost $" +planFprice+ " per month.");	
		}
	}

}
