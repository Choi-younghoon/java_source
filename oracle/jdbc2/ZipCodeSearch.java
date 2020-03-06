package oracle.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.Vector;

public class ZipCodeSearch {
	//선언부
	//드라이버 클래스가 필요하다. - JDBCTest에서 꺼내 쓰자.
	//URL정보도 JDBCTest에서 꺼내 쓸 수 있다.
	//user와 pw는 생략할 수 있다. - 왜?
	Connection 		  con 	= null;
	PreparedStatement pstmt = null;
	ResultSet 		  rs 	= null;
	//오라클 서버와 연결통로 만들기를 메소드를 꺼내보세요.
	//메소드 위에 Exception을 붙이는 건 드라이블 클래스를 잘못 작성하여 에러가 아닌 
	//런타임에러 즉 ClassNotFoundException을 맞을 수 있기 때문에 선언하였다.
	public Connection getConnection() throws Exception {
		System.out.println("getConnection호출 성공");
		//오라클 회사 정보를 수집합.
		Class.forName(JDBCTest._DRIVER);
		con = DriverManager.getConnection(JDBCTest._URL, JDBCTest._USER, JDBCTest._PW);
		return con;
	}
	//main()-userInput[동이름결정]-getZipCodeList('당산동')
	public ZipCodeVO[] getZipCodeList(String userDong) throws Exception {//오라클서버에게 select문전달 - 응답받기 
		//throws Exception : 예외가 발생하면 나를 호출한 곳에서 처리를 받으세요.
		System.out.println("getZipCodeList 호출성공" + userDong);
		ZipCodeVO zcVOS[] = null;
		ZipCodeVO zcVO = null;
		String sql = "";
		sql += "SELECT address , zipcode";
		sql += " FROM zipcode_t";
		sql += " WHERE dong LIKE '%'||?||'%'"; //조회결과가 3건일 경우
		//오라클 서버에 요청을 보내기
		getConnection();
		pstmt = con.prepareStatement(sql); //prepareStatement : 인스턴스화 기능이랑 비슷하다.
		pstmt.setString(1, userDong); //?에 들어갈 동이름이 결정됨. 
		rs = pstmt.executeQuery(); //오라클 서버에게 처리를 요청함.
		Vector<ZipCodeVO> v = new Vector<>();
		while(rs.next()) {//커서 이동(1) , 커서이동(3)
			//System.out.println("while문 : " + rs.next()); //커서이동(2)
			zcVO = new ZipCodeVO();
			zcVO.setAddress(rs.getString("address"));
			zcVO.setZipcode(rs.getInt("zipcode"));
			v.add(zcVO);
		}
		zcVOS = new ZipCodeVO[v.size()];
		v.copyInto(zcVOS); //백터 자료구조에 들어있는 정보 복사하기.
		//System.out.println("while문 탈출");
		//서버에 요청하기 전에 사용자로 부터 동이름을 먼저 입력 받아야 한다.
		//zcVO.uid_no = 10; 문법에러 - private - 왜? : 웹이나 앱에서 동시사용자가 많을때 변조되면 안됨.
		printZipCode(zcVOS);//메소드 호출시에는 타입표시 안함.
		return zcVOS;
	}
	//조회된 우편번호 목록을 출력해보기
	public void printZipCode(ZipCodeVO zcVOS[]) {
		for(ZipCodeVO zVO:zcVOS) {
			System.out.println(zVO.getAddress() + "    " + zVO.getZipcode());
		}
	}
	//사용자로 부터 동을 입력 받는 메소드를 구현해 보시오.
	public String userInput() {
		//JDBCTest._USER="hr"; static만 있으니까 계정이름 변경 가능함.
		//JDBCTest._DRIVER=""; final이 있으니까 불가함.
		Scanner scan = new Scanner(System.in);
		String userDong = null;
		userDong = scan.nextLine();
		return userDong;
		//return "당산동";
	}
	//메인메소드
	/*
	 * 23(가장먼저호출 - entry pointer-main 스레드)-25(변수선언:지변)-26-27(인스턴스화)-
	 * 28-(메소드호출)-11(파라미터는 없다:리턴은 있다.)-12-13-14-15-16(입력받은값 확정)
	 * 28(리턴값으로 받음)-
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("동을 입력하세요.");
		String userDong = null;
		ZipCodeSearch zs = new ZipCodeSearch();
		userDong = zs.userInput();
		if(userDong == null) {
			System.out.println("반드시 동을 입력해야 합니다.");
			return; //main 탈출하고 끝
		}
		else {
			System.out.println("당신은 " + userDong + " 을 입력하였습니다.");
			ZipCodeVO zcVOS[] = zs.getZipCodeList(userDong);
		}
	}//end of main

}
