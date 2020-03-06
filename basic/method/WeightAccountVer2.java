package basic.method;

import java.util.Scanner;

public class WeightAccountVer2 {
	double d_ew = 0.0; //지구의 몸무게 담을 변수
	double d_mw = 0.0; //달의 몸무게 담을 변수
	
	public double moon_weight(double d_ew) {
		d_mw=(d_ew*17) / 100.0;
		return d_mw;
	}
	
	public static void main(String[] args) {
		WeightAccountVer2 wa2 = new WeightAccountVer2();
		System.out.println("당신의 몸무게를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		wa2.d_ew = scan.nextDouble();
		wa2.d_mw = wa2.moon_weight(wa2.d_ew);
		System.out.println("달의 몸무게 : " + wa2.d_mw);
	}

}
