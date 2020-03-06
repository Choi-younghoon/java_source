package me.study;

public class SungJukStudySimulation {

	public static void main(String[] args) {
		SungJukStudy sungjuk = new SungJukStudy();
		int arJumsu[] = {15,50,90,30,100};
		int rankMe[] = new int[arJumsu.length];//배열 선언 
		rankMe = sungjuk.getRank(arJumsu);
		for(int check:rankMe) {
			System.out.println("==================");
			System.out.println(check);
		}
	}

}
