package test0219;

public class Qu_2 {
	int i = 0;
	int sum = 0;
	
	public void forTest() {
		for(i=1; i<=1000; i++) {
			if(i%2 == 0 || i%5 == 0) {
				if(i %10 != 0) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
	}
	
	public void whileTest() {
		while(i<=1000) {
			if(i%2==0 || i%5 ==0) {
				if(i %10 != 0) {
					sum += i;
				}
			}	
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Qu_2 qu_2 = new Qu_2();
		qu_2.forTest();
		qu_2.whileTest();
	}

}
