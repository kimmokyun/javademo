package java002_statemments;

public class Java020_if {
/*
 * [문제]
 * date 변수에 저장된 값이 대문자이면 " 대문자입니다.", 소문자이면 "소문자입니다."
 * 그외는 "기타입니다"로 출력하는 프로그램을 구현하세요.
 * 
 * 
 * [결과]
 * data = 'D' => D는 대문자입니다.
 * date = 'd' => d는 소문자입니다.
 * data = '1' => 1는 기타입니다.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char date = '1';


if(date>='A' && date<='Z') {
	System.out.printf("%c대문자입니다\n", date);
	
}else if(date>='a' && date<='z'){
	System.out.printf("%c는 소문자입니다.\n", date);
}else {
	System.out.printf("%c는 기타입니다.\n", date);
}

	}

}
