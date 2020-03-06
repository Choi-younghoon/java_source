package test0219;

public class Bank {
	
	String name = null; 
	String account = null;
	int cash = 0; 

	public Bank(String name, String account, int cash) {
		this.name = name;
		this.account = account;
		this.cash = cash;
	}
	
	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return String.format("예금주 : %s, 계좌번호 : %s, 잔액 : %s"
				            ,name
				            ,account
				            ,cash);
	}
	
	public void take(int money) {
		//잔액이 인출 금액보다 큰가요?
		//잔액이 부족하면 인출이 안되는거죠
		if(cash >= money) {
			cash = cash - money;
			System.out.println("출금액 : "+money);
			System.out.println("잔액 : "+cash);
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public void deposit(int money) {
		cash += money;
		System.out.println("입금액 : "+money);
		System.out.println("잔액 : "+cash);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank("자바맨","123-456",10000);
		bank.deposit(25000);
		bank.take(30000);
		bank.print();
	}

}
