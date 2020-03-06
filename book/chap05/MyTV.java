package book.chap05;

import java.util.Scanner;

public class MyTV {
	//전역변수는 그 클래스가 활동 중에는 계속 유지(기억) 됩니다.
	//TV속성 정의
	boolean power = false; //전원상태(on/off)
	int channel = 2; //채널 바꾸기
	int speaker = 0; //소리 키우기
	
	//TV의 기능을 구현하기.
	/****************************************************
	 	power의 경우 값에 상관없이 항상 반대의 값으로 변경해주면 되므로
	 	굳이 if문을 사용하지 않아도 될 것 같다.
	 ****************************************************/
	
	void power() {
		power = !power;
	}//end of power
	/*
	 * 메소드의 파라미터 자리는 사용자가 선택한 값, 입력한 값 등을 받아오는 자리 입니다.
	 * u_power = true가 저장됨
	 * 28라인에서 그 변수에 not이 있으므로 반대인 false 변환 후 대입된다.
	 * false->true
	 */
	void power(boolean u_power) { //호출할 때 결정된 값이 넘어오는 값이 넘어오는 변수입니다.
		power = !u_power;
	}
	
	void channelUp() {
		++channel;
	}//end of channelUp
	
	void channerDown() {
		--channel;
	}//end of channelDown
	
	void volume() {
		++speaker;
	}//end of volume
	
	public static void main(String[] args) {
		System.out.println("전원을 켜시겠습니까?(키려면 True, 끄시려면 False)");
		Scanner scan = new Scanner(System.in);
		boolean on = scan.nextBoolean();
		//On
		if(on) {
			System.out.println("전원이 켜졌습니다.");
		}
		else {
			System.out.println("전원이 꺼졌습니다.");
		}
		MyTV pow = new MyTV();
		//pow.power(); //false => !false => true
		//파라미터가 있어야 내 의사를 표현할 수 있다. => 소통시작.
		pow.power(on); //false => !false => true
		//현재 TV는 전원이 켜진 상태입니까?
		System.out.println(pow.power); //true출력
		if(pow.power) {
			System.out.println("현재 TV를 시청중입니다.");
		}
		else {
			System.out.println("아무도 TV를 보고있지 않아요.");			
		}
		
	}//end of main

}
