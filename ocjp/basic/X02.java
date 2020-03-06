package ocjp.basic;

public class X02 {

	public static void main(String[] args) {
		
		String s = new String("Hello"); //String 객체는 원본이 바뀌지 않음.
		modify(s);
		System.out.println(s);
	}
	public static void modify(String s) {
		 s += "world!";
	}

}
