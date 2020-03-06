package study.sungjuk;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SungJukMe implements ActionListener {
	
	//====================선언부==========================	
	JFrame jf_sungjuk	  = new JFrame();
	JLabel jlb_su		  = new JLabel("인원수");
	JLabel jlb_inwon	  = new JLabel("명");
	JTextField jtf_inwon  = new JTextField(15);
	JButton jbtn_data	  = new JButton("데이터가져오기");
	JButton jbtn_account  = new JButton("처리");
	JButton jbtn_exit	  = new JButton("종료");
	JPanel jp_north		  = new JPanel();
	JPanel jp_south		  = new JPanel();
	
	
	//=====================테이블 처리 코드 추가
	String 			cols[]			= {"이름","국어","영어","수학","총점","평균","석차"};
	String 			data[][]		= null; 
	DefaultTableModel dtm_sungjuk 	= null; 
	JTable			jt_sungjuk 	  	= null; 
	JScrollPane		jsp_sungjuk		= null; 
	
	//====================생성자==========================
	SungJukMe() {
		start();
	}
	
	//===================총점을 구하는 메소드 구현
	public double total() {
		return 0.0;
	}
	
	//===================평균을 구하는 메소드 구현
	public double average() {
		return 0.0;
	}
	
	//===================석차를 구하는 메소드 구현
	public int[] ranking() {
		//return null;
		return new int[2];
	}
	
	//====================이벤트 소스와 이벤트 처리 클래스 매핑
	public void start() {
		jtf_inwon.addActionListener(this);
		jbtn_data.addActionListener(this);
		jbtn_account.addActionListener(this);
		jbtn_exit.addActionListener(this);
	}
	
	//====================화면처리부=======================
	public void initDisplay() {
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_north.add(jlb_su);
		jp_north.add(jtf_inwon);
		jp_north.add(jlb_inwon);
		
		jp_south.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jp_south.add(jbtn_data);
		jp_south.add(jbtn_account);
		jp_south.add(jbtn_exit);
		
		jf_sungjuk.add("North",jp_north);
		jf_sungjuk.add("South",jp_south);
		jf_sungjuk.add("Center",jsp_sungjuk);
		jf_sungjuk.setTitle("성적처리 프로그램 Ver1.0");
		jf_sungjuk.setSize(400,300);
		//jf_sungjuk.pack();
		jf_sungjuk.setVisible(true);
	}
	
	//===================메인 메소드=====================
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		SungJuk sj = new SungJuk();
		sj.initDisplay();
	}
	
	//@Override : 어노테이션 이라 읽음. - ActionListener가 가진 추상메소드를 그대로 가져다가 재정의해서 사용하시오.
	//void methodA();
	@Override
	public void actionPerformed(ActionEvent e) {
		//insert here
		Object obj = e.getSource();
		
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize(); // => 사용중인 컴터의 스크린 사이즈 정보 가져오기
		//현재 내가 그린 화면의 크기 가져오기(400*300에서 변화되었겠죠.)
		Dimension di2 = jf_sungjuk.getSize();
		jf_sungjuk.setLocation((int)(di.getWidth()/2-di2.getWidth()/2)
							  ,(int)(di.getHeight()/2-di2.getHeight()/2));
	}

}
