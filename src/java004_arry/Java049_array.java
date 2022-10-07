package java004_arry;

public class Java049_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] alpa = new char[][]   {{ 'a', 'b', 'c', 'd' }, 
										{ 'a', 'b', 'c', 'd' }, 
										{ 'a', 'b', 'c', 'd' },
										{ 'a', 'b', 'c', 'd' }, 
										};

							for(int i=0; i<alpa.length; i++) {
								for(int j=0; j<alpa.length; j++) {
									System.out.printf("%4c",alpa[i][j]);
								}
								System.out.printf("\n");
							}
										
										
										}
									
										
	}


