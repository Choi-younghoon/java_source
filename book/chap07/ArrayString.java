package book.chap07;

public class ArrayString {

	public static void main(String[] args) {
		String nameList[] = {"이준","동진","선기","영훈"};
		String nameList2[][] = {
				{"이준","동진","선기","영훈"}
				,{"25","26","27","28"}
		};
		String nameList3[][] = {
				{"이준","동진","선기","영훈"}
				,{"25","26","27","28"}
				,{"바둑","웨이크보드","당구","사이클"}
		};
		
		for(int i=0 ; i<nameList3[2].length ; i++) {
			System.out.print(nameList3[2][i] + " ");
		}
		
		for(String nl:nameList) {
			System.out.println(nl);
		}
		
		System.out.println("\n================================\n");
		//nameList3은 배열의 이름이고 여기에 length이면 로우의 수이다.
		for(int i=0 ; i<nameList3[2].length ; i++) {
			for(int j=0 ; j<nameList3[1].length ; j++) {
				if(i==2) { //친구들의 취미니?
					System.out.print(nameList3[i][j] + " ");
				}
			}
		}
		
	}//end of main

}
