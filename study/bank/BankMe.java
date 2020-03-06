package study.bank;

import java.util.Scanner;

public class BankMe {
	String name = null;
	String account = null;
	int cash = 0;
	int inmoney = 0;
	int outmoney = 0;
	int start = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public BankMe(String name, String account, int cash) {
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
	
	public void start() {
		System.out.println("입금은 1번 , 출금은2번.");
		start = sc.nextInt();
		if(start == 1) {
			incash(inmoney);
		}
		else if(start == 2) {
			outcash(outmoney);
		}
		else {
			System.out.println("안녕히가세요.");
		}
	}
	
	//입금
	public void incash(int inmoney) {
		System.out.println("입금하실 금액을 적어주세요.");
		inmoney = sc.nextInt();
		cash += inmoney;
		System.out.println(inmoney + "원이 입금되었습니다.");
		System.out.println("잔액 : " + cash + "원");
	}
	
	//출금
	public void outcash(int outmoney) {
		System.out.println("출금하실 금액을 적어주세요.");
		outmoney = sc.nextInt();
		if(cash >= outmoney) {
			cash -= outmoney;
			System.out.println(outmoney + "원이 출금되었습니다.");
			System.out.println("잔액 : " + cash + "원");
		}//출금이 되었을 때
		else {
			System.out.println("잔액이 부족합니다.");
		}//출금 x (잔액부족)
	}

	//=======================메인메소드
	public static void main(String[] args) {
		BankMe bank = new BankMe("자바나라", "123-456-789",50000);
		bank.start();
		bank.print();
	}//end of main
}
