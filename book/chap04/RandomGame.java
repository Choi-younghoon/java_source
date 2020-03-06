package book.chap04;

import java.util.Random;

/*
 0부터 9사이의 임의의 숫자를 채번하기
 */
public class RandomGame {

	public static void main(String[] args) {
		Random r = new Random();
		int cnt = 0;
		while(cnt < 6) {
			int imsi = r.nextInt(10);
			System.out.println("imsi:" + imsi);
			cnt ++;
		}
	}//end of main

}
