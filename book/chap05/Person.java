package book.chap05;
/*
 * 같은 이름의 생성자를 여러개 가질 수 있다.
 * 단, 파라미터의 [갯수]가 반드시 달라야 한다.
 * 단, 파라미터의 [타입]이 반드시 달라야 한다.
 * 변수의 이름이 다른건 인정 못한다. 생성자를 중복 정의 했다라고 생각한다.
 */
public class Person {
	
	//전역변수입니다. - 초기화를 할 수 있어요. 왜냐면 생성자가 대신 해주니까...
	String name; //성명
	float height; //그 사람의 키
	float weight; //그 사람의 몸무게
	
	/* 디폴트 생성자는 생략할 수 있다.
	 * 왜냐하면 jvm이 대신 만들어줄 수 있기 때문이죠.
	 * 그러나 파라미터를 갖는 생성자는 만들어줄 수 없어요.
	 * 왜냐면 그 사람 생각을 내가 알 수 없기 때문이죠.
	*/
	/*
	Person() { //생성자는 클래스 이름과 같다.
		System.out.println("Person 디폴트 생성자 호출 성공 : ");
		//name = null; //초기화
		//height = 0.0f; //초기화
		//weight = 0.0f; //초기화
	}
	*/
	Person(String name) {
		//this.name = name;
	}
	//생성자는 여러개 선언하기가 된다. - 단, 타입은 반드시 달라야한다.
	Person(float height) {
		this.height = height;
	}
	Person(float height,float weight) {
		this.height = height;
		this.weight = weight;
	}
	Person(double height) { 
		this.height = (float)height;
	}
	/* *******변수의 변화는 영향을 줄 수 없다.********
	Person(float height2) {
		this.height = height2;
	}
	*/
	Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}
