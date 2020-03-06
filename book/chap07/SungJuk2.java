package book.chap07;

public class SungJuk2 {
	int jumsus2[][] = {
			 {100,80,90}
			,{60,70,90}
			,{80,70,70}
			,{90,90,90}
			,{80,80,80}
	};
	public static void main(String[] args) {
		SungJuk2 sj2 = new SungJuk2();
		System.out.println("no  kor  eng  math  total  avg");
		System.out.println("==============================");
		int i = 0;
		int j = 0;
		int korTot = 0;
		int engTot = 0;
		int mathTot = 0;
		for(i=0; i<sj2.jumsus2.length; i++) {
			int sum2 = 0;
			//double avg2 = sum2/sj2.jumsus2[i].length;
			korTot = korTot + sj2.jumsus2[i][0];
			engTot = engTot + sj2.jumsus2[i][1];
			mathTot = mathTot + sj2.jumsus2[i][2];
			for(j=0; j<sj2.jumsus2[i].length; j++) {
				sum2 = sum2 + sj2.jumsus2[i][j];
				System.out.printf("%4d", sj2.jumsus2[i][j]);
			}
			System.out.printf("%4d\n", sum2);
		}
		System.out.println("=======================================================");
		System.out.println("  총점 :  " + korTot + "    " + engTot + "    " + mathTot);
	}//end of main

}
