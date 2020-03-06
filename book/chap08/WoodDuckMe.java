package book.chap08;

public class WoodDuckMe extends DuckMe {
	@Override
	public void quack() {
		System.out.println("WoodDuck은 소리를 내지 않습니다.");
	}
	@Override
	public void fly() {
		System.out.println("WoodDuck은 날 수 없습니다.");
	}
	@Override
	public void swimming() {
		System.out.println("WoodDuck은 물에 뜰 수 있습니다.");
	}
}
