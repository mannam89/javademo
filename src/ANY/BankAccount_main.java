package ANY;

public class BankAccount_main {
	public static void main(String[] args) {
		BankAccount account=new BankAccount();
				
		account.setAccountNumber("1234567890");
		account.setAccountHolder("Alex");
		
		account.deposit(0);
		account.deposit(6000);
		
		account.withdraw(4000);
		
		System.out.println("계좌번호: " + account.getAccountNumber());
		System.out.println("예금주: " + account.getAccountHolder());
		System.out.println("잔액: " + account.getBalance()+"원");
	}
}