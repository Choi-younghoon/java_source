package book.chap08;

public class RubberDuckMe extends DuckMe {
	@Override
	public void quack() {
		System.out.println("RubberDuck은 끽 소리를 냅니다.");
	}
	@Override
	public void fly() {
		System.out.println("RubberDuck은 날 수 없습니다.");
	}
	@Override
	public void swimming() {
		System.out.println("RubberDuck은 물에 뜰 수 있습니다.");
	}
}
