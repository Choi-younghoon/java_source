package book.chap08;

public class MallardDuckMe extends DuckMe {
	@Override
	public void quack() {
		System.out.println("MallardDuck은 꽥꽥꽥 소리를 냅니다.");
	}
	@Override
	public void fly() {
		System.out.println("MallardDuck은 날 수 있습니다.");
	}
	@Override
	public void swimming() {
		System.out.println("MallardDuck은 물에 뜰 수 있습니다.");
	}
}
