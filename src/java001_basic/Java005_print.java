package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
	
		byte bNum =2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L or l
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cDate = 'a'; // 오직 한문자 ('')
		boolean eNum = true;  // true or false
		String sDate = "java" ;  // String = ""< 안에 문자열
		
		
		/*
		 * system.out.printf("출력형식", 값1,값2,값3...)
		 * 출력기호
		 * %d : 정수 (byte,short,int,long)
		 * %f : 실수 (float, double)
		 * %b : 논리(boolean)
		 * %c : 문자(char)
		 * %s : 문자열(String)
		 * %% : %
		 * \n : 줄바꿈
		 * \t : 탭
		 */
		
		
//		System.out.printf("%d %d %d %d %f %b %c %s\n",bNum,sNum,xNum,lNum,fNum,dNum,eNum,cData,sDate);
		
		System.out.printf("%d %% %d = %d\n", 5,2, (5%2));
		System.out.print("java");
		System.out.print("program");
		System.out.println();
		System.out.println("jsp");
		System.out.println("test");
		
		
	}

}