package ocjp.control;

public class Q54 {
	public void testIfA() {
		if(testIfB("True")) {
			 System.out.println("True");
		}
		else {
			 System.out.println("Not true");
		}
	}//end of testIfA
	public Boolean testIfB(String str) {
		return Boolean.valueOf(str);
	}//end of testIfB	
	public static void main(String[] args) {
		//내 안에 있는 메소드이더라도 static영역에서 non-static을 호출할 수 없다.
		//인스턴스화를 하면 할 수 있다.
		Q54 q54 = new Q54();
		q54.testIfA();
	}//end of main

}
