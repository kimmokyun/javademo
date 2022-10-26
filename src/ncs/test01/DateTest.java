package ncs.test01;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal = Calendar.getInstance();

long today_day = cal.getTimeInMillis();
int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
char[] weekdays = {'일','월','화','수','목','금','토'};

cal.set(2022,10,25);

long birth_day = cal.getTimeInMillis();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일");
String today = sdf.format(today_day);
String birthday = sdf.format(birth_day);
System.out.println("생일:"+birthday+" "+weekdays[day_of_week-1]+"요일");
System.out.println("현재 :" + today);
System.out.printf("나이 : %d세",(2022-cal.getWeekYear()-1));
	}

}
