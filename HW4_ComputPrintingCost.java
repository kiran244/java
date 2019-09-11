package chapter3;
import java.util.Scanner;

//HW4
//Programmer:
//Input : Number of copies
//Output : Cost

public class HW4_ComputPrintingCost {

	public static void main(String[] args) {
		
		//Create a Scanner
       Scanner input = new Scanner(System.in);
       
       // 1. Declare variables
       
        final double PRINT_COST1 = 0.05;
		final double PRINT_COST2 = 0.06;
		final double PRINT_COST3 = 0.07;
		final double PRINT_COST4 = 0.08;
		final double PRINT_COST5 = 0.10;
		    
		double cost, rate;
		int copies;
       
       // 2. Input: Number
	    System.out.println("Please enter number of copies ");
        copies = input.nextInt();
       
       // 3. Compute use IF and ELSE	
		if  (copies >= 500)
			rate = PRINT_COST1;
		else if (copies >= 300)
			rate = PRINT_COST2;
		else if (copies >= 200)
			rate = PRINT_COST3;
		else if (copies >= 100)
			rate = PRINT_COST4;
		else 
			rate = PRINT_COST5;
			
		cost = rate * copies;
			
       // 4. Output Cost
		System.out.println(" The cost: $ " + cost);
	
	}
}
