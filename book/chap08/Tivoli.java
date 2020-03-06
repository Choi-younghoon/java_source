package book.chap08;

public class Tivoli extends Car {
	String carColor;
	int volumn;
	//생성자는 전변을 초기화 해준다.
	Tivoli() {//*************생성자
		carColor = "남색"; // => 전변 초기화.
		volumn = 0;
	}
	@Override
	public void stop() {
		System.out.println("Override stop호출 성공");
		if(speed>0) {
			speed = speed - 2;
		}
	}
	public void volumnUp() {
		volumn += 1;
	}
	public void volumnDown() {
		volumn -= 1;
	}
}
