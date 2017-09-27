package Exercises;
import java.util.Random;

import javax.swing.JOptionPane;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int x = 0; x<5; ++x)
	{
	displayRPS();
	}
	
	}
public static void displayRPS()
	{
	String userEntryString;
	String result = null;
	int userEntry;
	Random rand = new Random();
	int r = rand.nextInt(3) + 1;
	userEntryString = JOptionPane.showInputDialog(null, "Welcome to rock, paper, scissors./n1 = Rock /n2 = Paper /n3 = Scissors");
	userEntry = Integer.parseInt(userEntryString);
	
	if(userEntry == 1)//rock
	{
		if(r == 3)//sicssors
			result = "You won? Wow that surprising";
		if(r == 2)//Paper
			result = "You loose! Now thats not surpising";
		if(r == 1)//Rock
			result = "tie";
	}
	if(userEntry == 2)//Paper
	{
		if (r == 1)
			result = "You won? Wow thats surprising";
	}
	}
}
