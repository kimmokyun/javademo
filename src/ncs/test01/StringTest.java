package ncs.test01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1.22,4.12,5.93,8.71,9.34";
		 double data[]= new double[5];
		 double sum = 0;

String[] st = str.split(",");
int index = 0;
for(String s : st) {
	data[index] = Double.parseDouble(s);
	sum += data[index++];
}

System.out.printf("%.3f%n",sum);
System.out.printf("%.3f",sum/st.length);
		 
		 
		 
	}

}
