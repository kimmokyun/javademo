package java003_statements;

public class Java025_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 누적된 값이 최초로 15이상일때 까지만 반복문을 수행하라.
		int sum = 0;
		int i;
		
		for (i=1;; i++) {
			sum = sum +i;
			System.out.printf("i=%d,sum=%d\n",i,sum);

			if(sum>=15) {
				break;
			}
		}
	}

}
