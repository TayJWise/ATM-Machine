public class Balance 
{
	// Create the balance variable
	private static double balance = 0.0;
	
	// Allow the user to make a Balance object
	public Balance()
	{
	}
	
	// Method to get the balance
	public double getBalance()
	{
		return balance;
	}
	
	// Method to set the balance with deposit or withdraw
	public boolean setBalance(double changeAmt, String userChoice)
	{
		// Conditional statements for if the user chose deposit/withdraw and gave a valid change amount
		if (userChoice.equals("deposit") && validBalance(changeAmt, userChoice))
		{
			// Adjusts the current balance to reflect added result
			this.balance = getBalance() + changeAmt;
			return true;
		}
		else if (userChoice.equals("withdraw") && validBalance(changeAmt, userChoice))
		{
			// Adjusts the current balance to reflect subtracted result
			this.balance = getBalance() - changeAmt;
			return true;
		}
		return false;
	}
	
	// Method to check if the balance will be valid with the change amount
	private boolean validBalance(double changeAmt, String userChoice)
	{
		// Makes sure change amount is a positive number
		if (changeAmt < 0)
		{
			System.out.println("Invalid input, please try again.");
			return false;
		}
		
		// Makes sure the change amount is not greater than the balance for withdraw
		if (userChoice.equals("withdraw") && changeAmt <= getBalance())
		{
				return true;
		}
		// Deposit will result in true since it's addition
		else if (userChoice.equals("deposit"))
		{
			return true;
		}
		
		// Tells the user to try again because the input was invalid
		System.out.println("Invalid input, please try again.");
		return false;
	}
	
	// Method to print out the class object
	public String toString()
	{
		// Stores the value of balance in a variable that's returned
		String result = String.valueOf(balance);
		return result;
	}
	
}
