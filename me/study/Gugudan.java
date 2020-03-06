package me.study;

public class Gugudan {

	public void forTest() {
		int su = 0;
		int dan = 0;
		for(su = 2; su < 10; su++) {
			for(dan = 1; dan < 10; dan++) {
				System.out.println(su + "*" + dan + " : " + su*dan);
			}//end of dan
			System.out.println();
		}//end of su
	}//end of forTest
	
	public void forTest2() {
		int su = 0;
		int dan = 0;
		for(su=1; su<10; su++) {
			for(dan=2; dan<10; dan++) {
				System.out.print(dan + "*" + su + " : " + dan*su+ "  ");
//				System.out.printf("%2d*%d=%-2d", dan, su, (dan*su));
			}
			System.out.println();
		}
	}
}//end of Gugudan 