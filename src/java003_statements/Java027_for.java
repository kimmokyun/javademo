package java003_statements;

public class Java027_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i;
		
		for (i=1;; i++) {
			sum = sum +i;
			System.out.printf("i=%d,sum=%d\n",i,sum);

			if(sum>=15) {
				break;
				
			}
		}
		System.out.printf("i=%d\n",i);

	}

}