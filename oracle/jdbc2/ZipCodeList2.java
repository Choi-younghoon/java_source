package oracle.jdbc2;

import java.util.Vector;

public class ZipCodeList2 {

	public static void main(String[] args) {
		Vector<ZipCodeVO> v = new Vector<ZipCodeVO>(); //인스턴스화, 아직 data 추가 안함
		ZipCodeVO zcVO = null;
		ZipCodeVO zcVOS[] = null; //배열 선언안됨, 크기가 정해지지 않음.
		int i = 0;
		while(i<3) {
			zcVO = new ZipCodeVO();//인스턴스화 3번 진행 - 주.번이 3개 만들어짐.
			System.out.println("zcVO 주.번이 바뀐다" + zcVO); //주소번지 출력
			v.add(zcVO); //3번반복
			i++;
		}
		for(int x=0; x<v.size(); x++) {
			//Vector에 0번째 들어있는 주소번지는 ZipCodeVO타입이다.
			ZipCodeVO zVO = v.get(x);
			System.out.println(zVO);
		}
		zcVOS = new ZipCodeVO[v.size()]; //VO배열 = 3 , 주소번지출력 : oracle.jdbc2.ZipCodeVO@15db9742 oracle.jdbc2.ZipCodeVO@6d06d69c oracle.jdbc2.ZipCodeVO@7852e922
		System.out.println("배열의 크기는" + zcVOS.length);//3
		//zcVOS가 가르키는 객체 배열에 들어있는 정보를 출력해 보세요.
		//insert here
		//zcVOS.lenth는 배열의 방크기(갯수) - 3개 있다.
		v.copyInto(zcVOS);
		for(int y=0; y<zcVOS.length; y++) {
			//zcVOS[y] = v.get(y);
			//zcVOS[0] = v.get(0);
			//zcVOS[1] = v.get(1);			
			//zcVOS[2] = v.get(2);			
			System.out.println(zcVOS[y]); //null, null, null
		}
		//리턴타입이 void(비어있다)이지만 값을 유지하게 할 수 있다.
		//파라미터로 넘긴 주소번지에 Vector에 저장되어 있는 주소번지를 복제해주는 메소드.
		//저 배열의 세개 방안에 ZipCodeVO가 초기화 될 수 있도록 코드를 작성해 보세요.
	}//end of main

}
