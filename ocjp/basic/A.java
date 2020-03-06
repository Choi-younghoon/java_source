package ocjp.basic;

public class A {
	int x; //전변
	void methodA() {
		int z; //지역변수
		z = 0;
	} //end of methodA
	boolean check() {//메소드 선언하기 
		x++; // 0->1->2
		return true;
	} //end of check
	void zzz() {
		x = 0;
		// 앞에 괄호에서 결과가 True이므로 뒤에 명제가 참이든 거짓이든 상관없이 실행문은 반드시 실행.
		if((check() | check()) || check()) { //(2+3)*5
			x=x+1; //현재 변수  x값은 유지되고 있다.
		}
		System.out.println("x ===> " + x);
	}//end of zzz
	public static void main(String[] args) {
		new A().zzz();
	}//end of main

}
