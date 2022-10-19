package java013_api;

//sn 변수에 숫자개수를 출력하는 프로그램을 구현하시오.

public class Java146_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sn = "Korea12 paran3";
int cnt = 0;

for(int i=0; i<sn.length(); i++) {
	char data = sn.charAt(i);
	if(Character.isDigit(data))
		cnt++;;
}
System.out.println("숫자갯수:"+cnt);
	}

}
