package java013_api;

import java.util.StringTokenizer;

public class Java133_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구분자가 연속적으로 입력되어 잇으면 두번째 구분자 부터는 무시를 한다.
StringTokenizer st = new StringTokenizer("java,/jsp,sping",",/");
System.out.println(st.countTokens());
while (st.hasMoreTokens())
	System.out.println(st.nextToken());
	
System.out.println("================================================================");


String [] data = new String("java,/jsp/spring").split("[,/]");
System.out.println(data.length);
for(int i=0; i <data.length; i++) {
	System.out.printf("data[%d]=%s\n", i, data[i]);
}

	}

}
