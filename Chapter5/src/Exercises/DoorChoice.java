package Exercises;
import javax.swing.JOptionPane;
public class DoorChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceString;
		int doorChoice;
		int GAEEEEM = 0;
		
		while (GAEEEEM != 5) {	
			
			doorChoice = Integer.parseInt(JOptionPane.showInputDialog(null,"Pick a door, 1, 2, or 3.",
					"Door Choice", JOptionPane.INFORMATION_MESSAGE));
			
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null, "You win nothing .....");
		}
		if(doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null, "You win nothing again....");
		}
		if(doorChoice == 3)
		{
			JOptionPane.showMessageDialog(null, " You win a banana.");
		}
		if(doorChoice == 999)
		{
			JOptionPane.showMessageDialog(null, "why did you choose that number?"
					+ "Its not even a choice.... ");
		}
		GAEEEEM++;
		
		
		}
	}

}
