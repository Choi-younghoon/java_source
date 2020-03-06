package study.sungjuk;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest {
	
	JFrame jf = new JFrame(); // => 디폴트 레이아웃이 BorderLayout[동,서,남,북,중앙]

	JButton jbtn_north = new JButton("북쪽");
	JButton jbtn_south = new JButton("남쪽");
	JButton jbtn_west = new JButton("서쪽");
	JButton jbtn_east = new JButton("동쪽");
	JButton jbtn_center = new JButton("중앙");
	
	//====================생성자========================
	public BorderLayoutTest() { 
		jf.add("North",jbtn_north); //화면에 북쪽 버튼 추가
		//jf.add("South",jbtn_south);
		jf.add("West",jbtn_west);
		jf.add("East",jbtn_east);
		jf.add("Center",jbtn_center);
		jf.setSize(500,400);
		jf.setVisible(true); //화면에 JFrame을 보여주세요
	}
	
	//====================메인==========================
	public static void main(String[] args) {
		new BorderLayoutTest();
	}

}
