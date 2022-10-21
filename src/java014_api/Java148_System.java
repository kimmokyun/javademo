package java014_api;

import java.text.SimpleDateFormat;

import javax.swing.text.SimpleAttributeSet;

public class Java148_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// currentTimeMillis() : 1970. 1.1부터 초단위로
		//누적한 값을 밀리세컨드로 리턴한다.
		//하루는 86400초이다. 1초는 1000밀리 세컨드이다.
		long curr = System.currentTimeMillis();
		System.out.println(curr);
		
		//HH : 24시간, hh: 12시간
		
		String pattern = "yyyy-mm-dd HH:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//long - > Long > Object
		//auto boxing - > up - casting
		String data = sdf.format(curr);
		System.out.println(data);
		
	} // end

} // end
