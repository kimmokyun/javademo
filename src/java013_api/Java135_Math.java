package java013_api;
import static java.lang.Math.*;

public class Java135_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//임의값 0.0 < = x < 1.0		
double ran = random();
System.out.println(ran);



//0.00 <= x <9.99
ran = ran *10;
System.out.println(ran);

// 0~9
int num = (int)floor(ran);
System.out.println(num);

// 1~10까지
num = num +1;
System.out.println(num);
	}

}
