package java004_arry;


//2차원 배열

// 3행 2열의 2차원 배열


public class Java043_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] num = new int[3][2];
System.out.printf("%4d",num[0][0]); // 0행 0열
System.out.printf("%4d\n",num[0][1]); // 0행 1열
System.out.printf("%4d",num[1][0]); // 1행 0열
System.out.printf("%4d\n",num[1][1]); // 1행 1열
System.out.printf("%4d",num[2][1]); // 2행 1열

num[0][0] = 1;
num[0][1] = 2;
num[1][0] = 3;
num[1][1] = 4;
num[2][0] = 5;
num[2][1] = 6;

// 2차원배열에서 배열.length하면 행의 개수를 리턴한다
for(int row = 0; row<num.length; row++) {
	System.out.printf("%4d",num[row][0]); // 0행 0열
	System.out.printf("%4d\n",num[row][1]); // 0행 1열
}

System.out.println("===============================================");


for(int row = 0; row<num.length; row++) {
	for(int col = 0; col < num[row].length; col++) {
		System.out.printf("%4d",num[row][col]);
	}
	System.out.println();
	
}




	}

}
