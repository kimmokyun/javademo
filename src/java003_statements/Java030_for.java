package java003_statements;


/* 3의 배수를 제외한 숫자만 출력
 * 1,2,4,5,7,8,10
 */
public class Java030_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i =1; i<=10; i++) {
//	//3의 배수가 아니면
//	if(i%3 !=0) {
//		System.out.println(i);
		
		if(i%3==0) {
			continue;
		}
		
		System.out.println(i);
	}
}
	}

