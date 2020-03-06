package book.chap05;
/*
 * 쿼리문을 작성할 때 String을 사용하면 안되는 이유에 대해 말할 수 있다.
 * String은 원본이 절대로 바뀌지 않는다.
 * 따라서 변경하려면 반드시 새로운 변수에 그 값을 다시 담아야 한다.
 * 이렇게 되면 같은 이름의 변수가 n번 만큼 생성되므로 비효울적이다.
 * 따라서 이럴떄는 StringBuilder 를 사용하자. 
 */
public class StringTest {
//주소번지를 비교한다.
//주소번지가 가르키는 값을 비교한다.
	public static void main(String[] args) {
		String s1 = "apple"; // =>여기 s1과 #14 => s1 = ~~ 앞에있는 s1은 서로 다르다 
		String s2 = "apple";
		String s3 = new String("apple");
		String s4 = new String("apple");
		System.out.println(s1 == s2); //true , false ==> 주소번지를 비교하니까 true / s2 = s1
		//주소번지가 같니?
		System.out.println(s3 == s4); //true , false ==> 주소번지가 다르니까 false
		//그 주소번지가 가르키는 값이 같니?
		System.out.println(s3.equals(s4)); //true , false ==> 주소번지가 가르키는 값("apple")이 같으니까 true / equals  = 그안에 들어있는 값을 가르킨다.
		
	}

}