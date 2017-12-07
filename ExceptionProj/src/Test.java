
public class Test {

	public static void main(String[] args) {
		
		
		
		SavingsAccount account1 = new SavingsAccount(101,5000,"active",1234);
		
		account1 = null;
		
		//unchecked exception example
		//we need to write the program like, compiler should avoid tis
		if(account1 != null)
		{
			account1.withDraw(2000);
		}
		
		
		System.out.println("Done withdrawing");
		
		
		
		
		try
		{
			SavingsAccount account = new SavingsAccount(101,5000,"active",1234);
			
			account = null;
			
			account.withDraw(2000);
			
			System.out.println("Done withdrawing");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside Arithmetic exception");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("inside null pointer");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("catch block");
			e.printStackTrace();
		}
		
		System.out.println("End of main");
		
	}

}
