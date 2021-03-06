package book.chap12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.util.DBConnectionMgr;

public class TdeptManager extends JFrame {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
	
	String cols[] 	= {"아이디","사원명","부서명"};
	String data[][] = new String[0][3];
	DefaultTableModel dtm = new DefaultTableModel(data,cols);
	JTable jtb 		= new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jtb);
	
	public TdeptManager() {
		
	}
	
	public void initDisplay() {
		this.setTitle("사원정보 조회");
		this.add("Center", jsp);
		this.setSize(500, 400);
		this.setVisible(true);
	}
	public ArrayList<TempVO> getDeptList() {
		ArrayList<TempVO> al = new ArrayList<TempVO>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT emp_id,emp_name,dept_name        ");
		sql.append("  FROM temp,tdept                       ");
		sql.append("  WHERE temp.dept_code = tdept.dept_code"); 		
	    try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			TempVO tVO = null;
			while(rs.next()) {
				tVO = new TempVO();
				tVO.setEmp_id(rs.getInt("emp_id")); 
				tVO.setEmp_name(rs.getString("emp_name"));
				tVO.setDept_name(rs.getString("dept_name"));
				al.add(tVO);
			}
		} catch (SQLException se) { //오라클에서 발생되는 에러메시지 잡기
			//자바에러는 이클리스에서 잡고 오라클 에러는 토드에서 잡는게 좋겠다.
			System.out.println(se.toString());
		} catch (Exception e) { //자바전체에서 발생되는 에러메시지 잡기
			System.out.println(e.toString());
		}
	    return al;
	}
	
	public static void main(String[] args) {
		TdeptManager tm = new TdeptManager();
		tm.initDisplay();
	}

}
