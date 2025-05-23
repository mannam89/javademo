package ANY;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		if (accountNumber.length() == 10) {
			this.accountNumber = accountNumber;
		} else {
			System.out.println("계좌번호는 10자리여야 합니다.");
		}
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println(amount + "원이 입금되었습니다.");
		} else {
			System.out.println("0원 이상 입금해주세요.");
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			this.balance-=amount;
			System.out.println(amount+"원이 출금되었습니다.");
			return true;
		}else {
			System.out.println("잔액이 부족합니다.");
			return false;
		}
	}
}
