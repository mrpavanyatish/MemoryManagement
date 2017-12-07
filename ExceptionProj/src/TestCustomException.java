
public class TestCustomException {

	public static void main(String[] args) {
		
		SavingsAccount account1 = new SavingsAccount(101,5000,"active",1234);
		
		account1.withDraw(10000);
		
		System.out.println("Done withdrawing");
		

	}

}
