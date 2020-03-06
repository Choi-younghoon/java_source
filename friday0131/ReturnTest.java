package friday0131;
/*
 * return의 용도
 	- 메소드 안에서 사용할 때는 대입연산자를 통하여 반호나값을 저장할 수 있다.
 	- if문 안에서 return을 사용할 수 있다.
 	- 이렇게 하면 if문을 탈출하는가? 아니면 메소드 전체를 탈출하는지?
 */
public class ReturnTest {
	void methodA() {
		System.out.println("methodA 호출");
	}
	int[] methodB() {
		return new int[3];
	}
	void methodC() {
		System.out.println("methodC 호출");
		if(5==5) {
			return; //methodC를 탈출하는 것임. if문을 탈출하는 것이 아님.
		}
		System.out.println("methodA 호출");
	}
	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		int ar[] = rt.methodB();
		for(int a:ar) {
			System.out.println(a); //0 0 0
		}
/*
 * 18번에서 return을 만났을때 if문만 탈출하는거면  20번이 실행될것이다.
 * 만일 18번이 methodC전체를 탈출하는 거라면 33번이 출력되고 종료.		
 */
		rt.methodC();
		System.out.println("여기까지 출력...");
	}//end of main

}
