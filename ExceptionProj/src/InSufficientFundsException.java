
//public class InSufficientFundsException extends Exception{ (To make it a checked one)
// whatever the class extends RunTime Exeption then its knows as Unckecked Exception
public class InSufficientFundsException extends RuntimeException{
	
	public InSufficientFundsException()
	{
		super("Insufficient Funds");
	}

}
