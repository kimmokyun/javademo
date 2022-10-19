package java013_api;

/*난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
 * ex) 0.5689...... = > 5.7
 */
import static java.lang.Math.*;


public class Java136_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double ran = random();
System.out.println(ran);

ran = ran *100;

long data = round(ran);
System.out.println(data);

double num = (double)data/10;
System.out.println(num);

	

	}

}
