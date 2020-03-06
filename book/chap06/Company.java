package book.chap06;

public class Company { //p.194 ~ p.195
	private static Company instance = new Company(); //유일하게 생성한 인스턴스
	private Company() {}
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance; // 유일하게 생성한 인스턴스 반환.
	}
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}

}
