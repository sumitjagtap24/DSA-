package array;

public class ArrayTest {
	public static void main(String[] args) {
		
	//	Account accArray[] = new Account[5];
		
		System.out.println("Begin Main");
	//	System.out.println(accArray[0]);
		
		Account accObj = new Account(101, "John", 5000);
		System.out.println("accObj : " +accObj);
		accObj.withdraw(400);
		System.out.println("accObj : " +accObj);
		System.out.println("End main");
	}
}

class Account {
	
	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	
	
	
	
	public Account(int accountNumber, String accountHolderName, float accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	float withdraw(float amtToWithdraw) {
		accountBalance = accountBalance- amtToWithdraw;
		return accountBalance;
		
		
	}
	


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
}