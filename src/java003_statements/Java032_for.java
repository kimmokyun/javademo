package java003_statements;

public class Java032_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 0;
		
		label:
for(int row = 1; row<=3; row++) {
	for(int col = 1; col<=4; col++) {
		System.out.printf("%4d",data);
		data++;
	 if(data%4==0) {
		 continue label;
	 }
	} // end for row
	
	System.out.println();
	
} // end for
	}

}
