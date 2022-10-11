package java005_method;

import java.sql.Date;

/*
 * [출력결과]
 * sava test
 * tset avaj
 * java test
 */


public class Java064_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = {'j','a','v','a', ' ','t','e','s','t'};
		System.out.println(arr);
		System.out.println(reverse(arr));
        System.out.println(arr);
	} // end
public static char[] reverse(char[]data) {
	char[] arr = new char[data.length];
	for(int i=0; i<data.length; i++) {
		arr[i] = data[data.length-1-i];
	}
	 
	
	//data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
	return arr;
}
} // end
