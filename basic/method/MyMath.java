package basic.method;
//메소드를 설계할 수 있다.
//리턴타입은 뭘로 하지? - 나는 실수영역까지 처리할거야 - double - 1개
//파라미터는 몇 개로 할까? -두 개중에서 - double, double - 2개
//파라미너틔 타입은 어떡하지? - 실수영역까지
//메소드의 이름은 무엇으로 할까? - max
/*
 두 개의 정수 중에서 큰 숫자를 반환하는 max함수를 구인하시오.
 두 개의 정수를 입력 받고 큰 숫자를 출력합니다.
 출력) 정수(두 개) : 5 8
 	  최대값 : 8
 */
public class MyMath {
	double max(double fn,double sn){
		double maxNumber = 0.0;
		//둘(fn과sn)중에 누가 더 크니?
		if(fn > sn) {
			//실행문
			maxNumber = fn;
		}
		else if(sn > fn) {
			maxNumber = sn;
		}
		else {
			maxNumber = 0;
		}
		return maxNumber;
	}//end of max
	
	public static void main(String[] args) {
		MyMath mt = new MyMath();
		double maxNumber = mt.max(65, 8);
		System.out.println(maxNumber);
	}//end of main 

}//end of MyMath
