package java004_arry;

public class Java045_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] name = {"홍길동", "이영희"};
int[][] jumsu = {{90,85,40},{100,35,75}};

int sum = 0;
for(int index=0; index<name.length; index++) {
	System.out.printf("%8s",name[index]);
	
	sum=0;
	for(int col=0; col<3; col++) {
		System.out.printf("%4d",jumsu[index][col]);
		
		sum += jumsu[index][col];
	}
	System.out.printf("%4d %6.1f \n",sum,(double)sum/3);
}




System.out.printf(name[0],jumsu[1]);















	}

}
