package book.chap08;

public class DuckSimuationMe {

	public static void main(String[] args) {
		DuckMe wood = new WoodDuckMe();
		DuckMe rubber = new RubberDuckMe();
		DuckMe mallard = new MallardDuckMe();
		
		wood.quack();
		wood.fly();
		wood.swimming();
		System.out.println("==========================================");
		
		rubber.quack();
		rubber.fly();
		rubber.swimming();
		System.out.println("==========================================");
		
		mallard.quack();
		mallard.fly();
		mallard.swimming();
	}

}
