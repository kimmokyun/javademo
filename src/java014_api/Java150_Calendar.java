package java014_api;

import java.util.Calendar;

/*
 * 
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요.
 * [출력결과]
 * 2016-2-29 월요일
 * 
 */
public class Java150_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal = Calendar.getInstance();
int year = 2016;
int month = 2;

cal.set(Calendar.YEAR, 2016);
cal.set(Calendar.MONTH, month-1);
System.out.println(cal.toString());
		
		
	}

}

