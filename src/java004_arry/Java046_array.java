package java004_arry;
/*
 *  1 2 3 4 5
 *  6 7 8 9 10
 *  11 12 13 14 15
 *  16 17 18 19 20
 *  
 */
/* num배열에서 아래와 같이 출력이 되도록 구현
 * 1 2 * 4 5
 * * 7 8 * 10
 * * 11 * 13 14 *
 * 16 17 * 19 20
 * 
 */
public class Java046_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] num = {{1,2,3,4,5},
		{6,7,8,9,10},
		{11,12,13,14,15},
		{16,17,18,19,20}};

//for(int res=0; res<= num.length; res++) {
//	System.out.println(res);
//	
//		
for(int i=0; i<4; i++) {
	for (int j=0; j<5; j++) {
		if(num[i][j]%3==0) {
			System.out.printf("%4c",'*');
		}else
		System.out.printf("%4d", num[i][j]);
	}
	System.out.println();
}



		
		
		
		
	}

}
