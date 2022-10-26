package ncs.test01;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		double sum = 0.00;		int cnt = 0;		double avg = 0.00;
		
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		avg = sum / cnt;
		System.out.println(sum);
		System.out.println(avg);

	}
}

