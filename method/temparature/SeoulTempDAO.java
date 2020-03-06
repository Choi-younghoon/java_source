package method.temparature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.util.DBConnectionMgr;

public class SeoulTempDAO {
	DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
	Connection 		  con 		= null; 
	PreparedStatement pstmt 	= null;
	ResultSet 		rs 		 	= null;
	/*
	 * 서울 기상통계 정보로 부터 최근 10년 년도 가져오기.
	 */
	public String[] getYearList() {
		String years[] = null;
		//years = new String[10];
		StringBuilder sb = new StringBuilder();
		
		sb.append("SELECT															  ");
	    sb.append("	DISTINCT(TO_CHAR(TO_DATE(sdate),'YYYY')) ta_year                  ");
	    sb.append("  FROM seoultemp                                                   ");
	    sb.append("  WHERE TO_CHAR(TO_DATE(sdate),'YYYY') > TO_CHAR(sysdate,'YYYY')-11");
	    sb.append("  ORDER BY TO_CHAR(TO_DATE(sdate),'YYYY')		                  ");
	    try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			Vector<String> v = new Vector<>();
			while(rs.next()) {
				String year = rs.getString("year");
				v.add(year);
			}
			years = new String[v.size()];
			v.copyInto(years);
		} catch (Exception e) {
			//stack영역에 관리되는 에러메시지 정보를 라인번호와 이력까지 출력해줌.
			e.printStackTrace();
		}
		return years;
	}
}
