public class BankAccount
{
	double balance;
	
	public BankAccount(double balance)
	{
		this.balance = balance;
	}

	public BankAccount()
	{
		this.balance = balance;
	}


	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double amount)
	{
		balance = amount;
	}

	public String toString()
	{
		return "The balance is " + balance + ".";
	}
}