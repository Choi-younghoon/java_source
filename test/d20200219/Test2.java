package test.d20200219;

public class Test2 {

	public static void main(String[] args) {
		int dap1 = 0, dap2 = 0;
		int i = 0;
		for(i=1; i<=1000; i++) {
			if(i%2==0 && i%5==0) {
				//제외
				continue;
			}else if(i%2 == 0 || i%5 ==0) {
				dap1 = dap1 + i;
			}
		}//end of for
		i=1; // => 초기화
		while(i<=1000) {
			if(i%2==0 && i%5==0) {
				i++;//제외
				continue;
			}else if(i%2 == 0 || i%5 ==0) {
				dap2 = dap2 + i;
			}
			i++; // => 무한루프 방지코드 - while문쓸때는 꼭 무조건 무한루프 방지 코드 신경쓰기
		}//end of while
		System.out.println(dap1);
		System.out.println(dap2);
	}//end of main

}//end of Test2
