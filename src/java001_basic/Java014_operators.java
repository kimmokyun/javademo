package java001_basic;

public class Java014_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 조건연산자 : 식의 결과에 리턴해주는 값이 여러개 일때 사용한다.
		 * 식 ? 참 : 거짓
		 * int res = 식 ? 1 : 0;
		 * char res = 식 ? 'a' : 'A';
		 * 
		 */
		int t = 23;
		int r = 5;
		int res = t%r ==0 ? t/r : t/r +1;  // t가 23개인데 5개로 나눌시 몇바구니 나오나
		System.out.println(res);
	}

}
