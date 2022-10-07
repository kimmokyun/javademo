package java002_statements;

/*
 * switch(식){
 * case 값1 : 수행할 문장; break;
 * case 값2 : 수행할 문장; break;
 * case 값3 : 수행할 문장; break;
 * case 값4 : 수행할 문장; break;
 * default : 수행할 문장;
 * }
 * 식의 결과 타입 : byte, short, char, int, enum(jdk7),String(jdk7)
 * switch~case에서 break를 만나면 현재 수행중인 제어문을 완전히 빠져나옴
 * 
 */

public class Java021_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 100;
		switch(j / 13) {
		case 10 : 
		case 9 : System.out.println('A'); break;
		case 8 : System.out.println('b'); break;
		case 7 : System.out.println('c'); break;
		case 6: System.out.println('d'); break;
		case 5 : System.out.println('f'); break;
		case 4 : System.out.println('g');
		
		}
		
		
	}

}
