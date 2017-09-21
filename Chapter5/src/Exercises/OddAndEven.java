	package Exercises;
import javax.swing.JOptionPane;
public class OddAndEven {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String numStr, result;
		int num, again = 0;
	do {
		numStr = JOptionPane.showInputDialog("Enter in a number>>");
		num = Integer.parseInt(numStr);
		
		result = ("That number is " + ((num % 2 ==0) ? "even" : "odd"));
		JOptionPane.showConfirmDialog(null, result);
		
		again = JOptionPane.showConfirmDialog(null, result);
		} while (again == JOptionPane.YES_OPTION);
	
	}

}
