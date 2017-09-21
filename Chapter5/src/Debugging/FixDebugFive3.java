// FixDebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
package Debugging;
import java.util.Scanner;
public class FixDebugFive3
{
   public static void main (String args[])
   {
      int item;
      //String output;
      final int LOW = 111;
      final int HIGH = 500;
      final int CUTOFF = 999;
      Scanner input = new Scanner(System.in);
      calculateOutPut();
   }
   public static void calculateOutPut()
   {
	   
	   int LOW;
	   int HIGH;
	   int CUTOFF;
	   Scanner input = new Scanner(System.in);
	   
      System.out.println("Please enter item number");
	Object item = input.nextInt();
      if(item =< LOW)
    	   System.out.println("Item number too low");
      else
    	  if(item => HIGH) 
    		  System.out.println("Item number too high");
    		  else
      if(item == CUTOFF)
             System.out.println("Valid - in Automotive Department");
          else
              System.out.println("Valid - Item in Housewares Department");
       //System.out.println(output);
   }
}


