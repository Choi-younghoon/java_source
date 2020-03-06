package test0219;

import java.util.Calendar;

/*
   [요구사항] 
  가. 자신이 태어난 년도인 숫자를 저장 할 수 있는 변수 year를 선언하고
      자신이 태어난 년도를 대입한다.     
  나. 자신의 나이를 저장할 수 있는 변수 age를 선언하고, 
     year 변수를 사용하여 자신의 나이를 
     계산하여 대입한다(공식:현재년도-태어난 년도)
     단,현재 년도는 Calendar클래스를 사용하여 구해야 한다
     그리고 age 와 year를 출력하여라
 */
public class CalendarTest {
	int age = 0;
	int year = 0;
	public static void main(String[] args) {
		Calendar time = Calendar.getInstance();
		int year = 1996; 
		int nowyear = time.get(Calendar.YEAR);
		
		System.out.println(nowyear-year+1 +" "+ year);
		 
		
	}
}
