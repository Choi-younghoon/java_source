package book.chap02;

public class SungJuk {
/*
  * 내 안에 있는 메소드라 하더라도 메소드 선언시 static이 없으면 main메소드에서
  	호출할수 없다.
  * 총점을 구해주는 메소드가 있다. 이름은 hap임.
  * 파라미터가 있다 | 없다
 */
	int hap(int kor, int eng) {
		int tot = 0;
		tot = kor + eng;
		return tot;
	}//end of hap
	//평균은 소수점이 나올 수 있다.
	//리턴값은 실수형으로 선언한다.
	//메소드 선언하기
	//반환타입 메소드이름(파라미터1, 파라미터2,...)
	double avg(int tot) {
		return tot / 2.0;
	}//end of avg
	/*
	 25->28->29(국어)->30(영어)->31->10[80,60값이 복사됨]->11->12->13->14(hap끝)->33[140]->36->19[140복사]->20->21->37
	 */
	public static void main(String[] args) {
		//insert here - hap메소드에서 합을 구한 값을 여기서 사용하고 싶어요
		//어떡하지?
		SungJuk sum = new SungJuk();
		int kor = 80;
		int eng = 65;
		int tot = sum.hap(kor, eng);
		//위에서 계산한 결과인 tot변수를 avg메소드에서 사용하고 싶다.
		System.out.println("합:" + tot);//140
		//int total = sum.hap(80, 65); [위에 코딩 응원]
		//System.out.println("총합:" + tot);
		double avgValue = sum.avg(tot);
		System.out.println("평균:"+ avgValue);//
	}//end of main

}
