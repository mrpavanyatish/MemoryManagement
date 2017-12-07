
public class SavingsAccount {
	
	private int accountNumber;
	private int accountBalance;
	private String status;
	private int pin;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(int accountNumber, int accountBalance, String status, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.status = status;
		this.pin = pin;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	//withDraw(int)
	//public void withDraw(int amount) throws InsufficientEundsException(Checked Exception) 
	//and the class should extends any other exception other than RunTime
	public void withDraw(int amount)
	{
		if(this.status == "active")
		{
			if(amount<this.accountBalance)
			{
				this.accountBalance = this.accountBalance - amount;
			}
			else
			{
				throw new InSufficientFundsException();
			}
		}
		else
		{
			System.out.println("Your card is inactive");
		}
		
	}
	
	public void withdraw(int withdrawalAmount,int pin)
	{
		if(withdrawalAmount<this.accountBalance)
		{
			this.accountBalance = this.accountBalance - withdrawalAmount;
		}
		else
		{
			System.out.println("You have insufficient funds");
		}
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return (accountNumber+accountBalance+status+pin);
}
}
