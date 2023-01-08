import java.util.Scanner;

// ATM Machine Project

public class Driver {
	public static void main(String args[]) 
	{
		// Create balance object using Balance class
		Balance balance = new Balance();
		
		// Create scanner to read in user's choices
		Scanner scnr = new Scanner(System.in);
		
		// Create variables to store choices and amount to change the balance
		int userChoice = 0;
		double changeAmt = 0;
		
		// Run the ATM Machine loop until user chooses to exit
		while(userChoice != 4)
		{
			// Print statements to introduce ATM Machine
			System.out.println("ATM Machine");
			System.out.println("Current Balance: " + balance.getBalance());
			
			// Print choice options for the user
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			
			// Allow the user to input their choice
			userChoice = scnr.nextInt();
			
			// Conditional statements based on user's input
			if (userChoice == 1)
			{
				// Withdraw using Balance class
				System.out.println("How much would you like to withdraw?");
				changeAmt = scnr.nextDouble();
				balance.setBalance(changeAmt, "withdraw");
			}
			else if (userChoice == 2)
			{
				// Deposit using Balance class
				System.out.println("How much would you like to deposit?");
				changeAmt = scnr.nextDouble();
				balance.setBalance(changeAmt, "deposit");
			}
			else if (userChoice == 3)
			{
				// Find current balance using Balance class
				System.out.println("Your balance currently is: " + balance.toString());
			}
			else if (userChoice == 4)
			{
				// will quit the program
			}
			else
			{
				System.out.println("Invalid input, please try again.");
			}
		}
		// Closes the scanner
		scnr.close();
		
		// Final message for the user
		System.out.println("Thank you for using this ATM Machine!");
	}
}