package friday0131;

public class BreakTest {

	public static void main(String[] args) {
		for(int i=1; i<4; i++) {
			if(i==2) {
				break;
				//System.out.println("break 다음....");
			}
			System.out.println("여기....");
		}
		System.out.println("for문 밖....");
	}//end of main

}
