package design.book;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BookApp extends JFrame implements ActionListener{

	//선언부
	static BookApp ba = null;
	//파라미터가 없는 생성자는 디폴트로 지원해주지만 있는 경우는 예측불가이므로 지원불가함.
	BookDialog bd = new BookDialog();
	
	//jp_north속지는 JFrame의 북쪽에 배치
	JPanel jp_north = new JPanel();
	
	//아래 버튼은 jp_north속지에 차례대로 배치 - 배치는 왼쪽부터
	JButton jbtn_all = new JButton("전체조회");
	JButton jbtn_sel = new JButton("상세조회");
	JButton jbtn_ins = new JButton("입력");
	JButton jbtn_upd = new JButton("수정");
	JButton jbtn_del = new JButton("삭제");
	
	JLabel jlb_time = new JLabel("현재시간", JLabel.CENTER);
	TimeClient tc = null;
	
	//화면그리기
	public void initDisplay() {
		//실제로 타임서버로 부터 시간정보를 듣기는 TimeClient에서 진행되지만
		//생성자의 파라미터를 통해서 BookApp jlb_time 원본의 주소번지를
		//넘겼으므로 TimeClient에서는 원본에 직접 써주면 화면에 보임.
		tc = new TimeClient(jlb_time);
		tc.start();
		//아래코드가 JFrame의 자원을 회수함.
		//부모자원이 회수될 때 JDialog도 같이 회수됨.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jbtn_ins.addActionListener(this);
		jbtn_sel.addActionListener(this);
		jbtn_upd.addActionListener(this);
		jbtn_del.addActionListener(this);
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		//insert here
		this.setTitle("도서관리 시스템");
		jp_north.add(jbtn_all);
		jp_north.add(jbtn_sel);
		jp_north.add(jbtn_ins);
		jp_north.add(jbtn_upd);
		jp_north.add(jbtn_del);
		this.add("North",jp_north);
		this.add("South", jlb_time);
		this.setSize(700, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		TimeServer ts = new TimeServer();
		ts.initDisplay(); //화면을 그리고 난 뒤 스레드 대기를 타도록 해야함.
		Thread th = new Thread(ts);
		th.start();//스레드의 run메소드를 호출하는 메소드
		//insert here
		ba = new BookApp();
		ba.initDisplay();
	}
//JButton에 대한 이벤트를 지원하는 인터페이스가 ActionListener임.
//클래스  뒤에 반드시 implements할것.
//ActionListener에  정의된 추상메소드를 재정의할것.	
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 감지된 클래스의 주소번지 받기
		Object obj = e.getSource();
		//입력버튼을 누른거니?
		if(jbtn_ins == obj) {
			System.out.println("입력호출 성공.");
			bd.set("입력", true, true, null, ba);
			//initDisplay를 호출한 이유는 setTitle("입력")과 setVisible(true)때문이었다.
			//그런데 그 둘을 set메소드로 이전하였다.
//			bd.initDisplay();
		}
		else if(jbtn_upd == obj) {//수정시에는 먼저 기본 정보를 조회하고 화면이동처리를 해야한다.
			System.out.println("수정호출 성공.");
			//select처리한 후 한 개 로우를 받아서 Map에 저장
			Map<String, Object> rMap = null;
			rMap = new HashMap<>();
			rMap.put("b_title", "자바의 정석");
			bd.set(jbtn_upd.getText(), true, true, rMap, ba);
		}
		else if(jbtn_sel == obj) {
			System.out.println("상세조회 호출 성공.");
			Map<String, Object> rMap = null;
			bd.set(jbtn_sel.getText(), true, false, rMap, null);
		}
		else if(jbtn_del == obj) {
			System.out.println("삭제호출 성공.");
		}
	}
	
	public void refreshData() {
		System.out.println("refreshData 호출 성공");
	}

}
