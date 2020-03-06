package me.study;

public class NunSan {
	
	public void forTest() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print("*");
				}//i랑j가 같을때
				else if(i >j) {
					System.out.print("*");
				}//i가 j보다 클때
				else {
					System.out.print(" ");
				}//i가j보다 작을때
			}
			System.out.println();
		}
	}
	
	public void whileTest() {
		int i = 1;
		while(i<=5) {
			int j = 5;
			while(j>=1) {
				if(i==j) {
					System.out.print("*");
				}
				else if(i<j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				j--;
			}
//			j=1;
			i++;
			System.out.println();
		}
	}
	
	public void whileTest1(int floor) {
		int i = 1;
		while(i<=floor) {
			int j = floor;
			while(j>=1) {
				if(i==j) {
					System.out.print("*");
				}
				else if(i<j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				j--;
			}
//			j=1;
			i++;
			System.out.println();
		}
	}
	
	public void twice(int num) {
		System.out.println(num*2);
	}
}
