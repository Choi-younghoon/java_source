package book.chap05;

public class PersonTest {

	public static void main(String[] args) {
		//파라미터가 있는 생성자가 한개라도 있으면 자동으로 제공되지 않는다.
		//생성자가 한개도 없으면 JVM이 디폴트 생성자는 제공해주지만
		//한개라도 있을 땐 제공하지 않는다.
		//Person p = new Person(); [오류발생]
		Person p = new Person("강호동");		
		//System.out.println(p.name + ", " + p.height + ", " + p.weight); //생성자가 초기화를 해줘서 자동으로 해줘서 결과가 나옴. (Person.java #21)
		//p.name = "이순신";
		p.height = 180.f;
		p.weight = 80.5f;
		System.out.println(p.name + ", " + p.height + ", " + p.weight);
		p.setName("유재석");
		p.setHeight(178.5f);
		p.setWeight(78.3f);
		System.out.println(p.name + ", " + p.height + ", " + p.weight); 
	}

}
