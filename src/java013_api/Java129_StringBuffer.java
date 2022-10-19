package java013_api;
/*
 * java.lang.String: immutable(불변)
 * java.lang.StringBuffer : mutable(가변) , 동기화
 * java.lang.ingBuilder : mutabla(가변), 비동기화
 * 
 * StringBuffer 특징
 * 1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
 * 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.
 */
public class Java129_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sg = new String("java test java");
		String ss = sg.replace("java", "jsp"); // java를 jsp로바꿔서 출력해라
		System.out.println("ss:" + ss);
System.out.println("sg:"+sg);
System.out.println(ss==sg);
System.out.println(sg.toString());

StringBuffer sb = new StringBuffer("spring test");
StringBuffer su = sb.replace(0,6,"reamework");
System.out.println("sb:"+sb);
System.out.println("su:" + su);
System.out.println(sb==su);
System.out.println(sb.equals(su));



	}

}
