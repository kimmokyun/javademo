package java004_arry;

public class Java050_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int[][] num = new int[3][];
//		num[0] = new int[2]; // 0행 2열
//		num[1] = new int[3]; // 1행 3열
//		num[2] = new int[5]; // 1행 5열

		
		int[][] num = new int[][] {{1,2},{3,4,5},{6,7,8,9,10}};
		
		
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%4d",num[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
