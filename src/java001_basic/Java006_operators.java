package java001_basic;

/*
 *  연산자 (operator) : 어떠한 기능을 수행하는 기호(+,-,*,/,%,>,<,=>,=<,==,!=..)
 *  피연산자 (operand) : 연산자의 작업 대상(변수, 상수, 리터널, 수식....)
 *  
 *   연상자의 종류
 *   1. 산술 연산자 (이항연산자) : +, -, *, /, %
 *   2. 비교 연산자 (이항연산자) : >,<,>=,<=,==,!=
 *   3. 논리 연산자 (이항연산자) : &&(and), ||(or), !(not)
 *   4. 조건 연산자 (삼항연산자) : 조건식 ? 참 : 거짓
 *   5. 대입 연산자 (이항연산자) : =, +=, -=, *= /= ....
 *   6. 증감 연산자 (단항연산자) : ++(1씩 증가), --(1씩 감소)
 *   
 */
public class Java006_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numX = 10;
		int numY = 5;
		int res = numX + numY;
		System.out.println(res);

		double avg = 4.5;
		System.out.println(res + avg);

		short a = 3;
		short b = 4;
		// short c = a + b; // Type mismatch: cannot convert from int to short
		// int 이하끼리 연산하면 int로 리턴한다.
		int c= a+b;
		System.out.println(c);
		/*int = short + short
		 * int = byte + byte
		 * int = char + char
		 * int = short + byte
		 * int = byte + char
		 * int = int +byte
		 */
		
		//자바에서 문자를 표한할때 유니코드를 사용한다.
		char data = '0'; // 48
		char al = 'A'; // 65
		int sum = data + al;
		System.out.println(sum);
		
		
		
		
		
		
	}

}
