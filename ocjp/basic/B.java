package ocjp.basic;

public class B {
	void methodA() {
		
	}//end of methodA
	static void methodB() {
		
	}//end of methodB
	public static void main(String[] args) {
		B b = new B();
		b.methodA(); //static 없기때문에 옆 코딩처럼 해야 선언 가능.
		methodB(); //static 이있어서 바로 선언 가능
	}//end of main

}
