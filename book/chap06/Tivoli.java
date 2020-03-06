package book.chap06;
/*
 * 10번 12번 14번의 주소번지 모두 다른 값일 것이다.
 * 10번 15번은 같지만 19번은 다를 것이다.
 * 10번 12번 14번 모두 같은 주소값을 가질 것이다.
 */
public class Tivoli {
	public int speed = 0;

	public static void main(String[] args) {
		Tivoli myCar = new Tivoli(); //생성자 호출 1 //디폴트 생성자 호출하기 -11-14(50)
		//myCar.speed = 30;
		System.out.println("myCar 주.번 : " + myCar);
		System.out.println("나는 현재 " + myCar.speed + "로 가는 중이야.");
		//자바에서는 같은 이름의 변수를 중복선언 불가. (10번과 다른점)
		myCar = new Tivoli(); //Tivoli myCar ~ 안됨. //생성자호출 2
		myCar.speed = 50;
		System.out.println("myCar2 주.번 : " + myCar);
		System.out.println("나는 현재 " + myCar.speed + "로 가는 중이야.");
		Tivoli herCar = new Tivoli(); //생성자 호출 3
		herCar.speed = 100;
		System.out.println("herCar 주.번 : " + herCar);
		System.out.println("나는 현재 " + herCar.speed + "로 가는 중이야.");
	}

}
