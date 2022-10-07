package java004_arry;

public class Java041_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] data1 = new int[3]; //0 기본값
long[] data2 = new long[3]; // 0L
float[] data3 = new float[3]; // 0.0f
double[] data4 = new double[3]; // 0.0
char[] data5 = new char[3]; // U코드값 0000
boolean[] data6 = new boolean[3]; // false
String[] data7 = new String[3]; // null

for(int i =0; i<data2.length; i++) {
	System.out.printf("data[%d]=%s\n",i,data7[i]);
}

System.out.println("=========================================");
char a=' ';
char b='\u0020';
char c='\u0000';
char d = 0;

System.out.println(c==d);

	}

}
