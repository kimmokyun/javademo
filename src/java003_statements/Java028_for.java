package java003_statements;

public class Java028_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int odd =0;
int even = 0;

for(int i=1; i<=10; i++) {
	
	// i변수의 값이 짝수이면
	if(i % 2==0) {
		even = even +i;
	}else {
		odd = odd +i;
	}
}
System.out.println(odd);
System.out.println(even);
	}

}
