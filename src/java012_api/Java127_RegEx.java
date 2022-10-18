package java012_api;
/*
 * 정상적으로 주민번호가 입력되있으면 true을 반환하고 아니면
 * false를 변환하는 프로그램을 구현하시오
 * [출력결과]
 * 851306-2689540 승인이 되었습니다.
 * 750625-16843 다시 입력하시오.
 */


public class Java127_RegEx {

	public static void main(String[] args) {
		
		System.out.print("851306-2689540");
		dispLay(process("851306-2689540"));
		
		System.out.print("750625-16843");
		dispLay(process("750625-16843"));


	}
	
public static boolean process(String sn) {
	
	
	
	return sn.matches("\\d{6}-\\d{7}");
}
public static void dispLay(boolean res) {
	if(res) {
		System.out.println("승인이 완료되었습니다.");
	}else {
		System.out.println("다시 입력하세요.");
	}

	}

}
