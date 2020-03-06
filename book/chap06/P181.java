package book.chap06;

import javax.swing.JOptionPane;

public class P181 {
	void methodA() {
		System.out.println("methodA호출 성공");
	}//end of methodA
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("숫자를 입력하세요.");
		int i = Integer.parseInt("20");
		//P181.methodA(); //메소드 선언시  static을 사용하지 않았으므로 에러발생함.
		//static이 없는 메소드를 호출할땐 반드시 인스턴스화 할것.
		//만일 static이 있다면  클래스타입.메소드명
		P181 p = new P181();
		p.methodA();
		//System.out.println(input + 10);
		System.out.println(Integer.parseInt(input) + 10);
	}//end of main

}
