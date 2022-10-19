package java013_api;

import static java.lang.Math.*;

public class Java137_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = new int[5]; // 1부터 10까지

for(int i=0; i<num.length; i++) {
	//난수 발생
num[i] = (int)floor(random()*10) +1;

//충복 체크
for(int j=0; j<i; j++) {
	if(num[j]==num[i]) {
		i--;
		break;
	}
}

}
for(int data : num)
	System.out.printf("%4d", data);
	}

}
