package java014_api;

public class Java156_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data1 = "12";
String data2 = "0";

try {
	int x = Integer.parseInt(data1);
	int y = Integer.parseInt(data2);
	int res = x/y;
	System.out.println(res);
}catch(ArithmeticException ex) {
System.out.println(ex.toString());	
	
	
}


	}

}
