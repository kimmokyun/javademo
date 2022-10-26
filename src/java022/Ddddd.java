package java022;
import java.util.Scanner;

public class Ddddd {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		final int MAX = 1;
				
		String names[] = new String[MAX];
		String major[] = new String[MAX];
		String phone[] = new String[MAX];
		String sNumber[] = new String[MAX];
		float avg[] = new float[MAX];
		
		int select = 0;//메뉴 입력값 저장 변수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-- 학생 관리 프로그램 --");
		
		while(true) {
			System.out.println("<< 메뉴 >>");
			System.out.println("1. 정보 입력 ");// 입력 처리 메소드
			System.out.println("2. 정보 출력 ");// 출력 처리 메소드
			System.out.println("3. 종료 ");
			System.out.print("선택> ");
			select = scan.nextInt();		
			
			//먼저 처리할 메뉴 : 종료
			if(select == 3) {
				System.out.println("종료합니다.");
				break;
			}
			
			switch(select) {
			case 1://입력메뉴
				//서브 타이틀 출력 
				System.out.println("학생 등록");
				for(int i = 0; i < MAX; i++) {
					System.out.println("-------------------");
					scan.nextLine();//enter skip해줌
					System.out.print("이름 : ");
					names[i] = scan.nextLine();
					System.out.print("학과 : ");
					major[i] = scan.nextLine();
					System.out.print("연락처 : ");
					phone[i] = scan.nextLine();
					System.out.print("학번 : ");
					sNumber[i] = scan.nextLine();
					System.out.print("평균 : ");
					//avg[i] = scan.nextFloat();
					String fStr = scan.nextLine();
					avg[i] = Float.parseFloat(fStr);
				}
				break;
			case 2://출력메뉴
				System.out.println();
				for(int i = 0; i < MAX; i++) {
					System.out.println("-------------------");
					//scan.nextLine();//enter skip해줌
					System.out.print(" 이름 : " + names[i]);
					System.out.print(" 학과 : " + major[i]);
					System.out.print(" 연락처 : " + phone[i]);
					System.out.print(" 학번 : " + sNumber[i]);
					System.out.print(" 평균 : " + avg[i]);
				}
				break;
			default://잘못된 메뉴 입력
				System.out.println("잘못 누르셨습니다.");
				break;
			}
	}
}//main method
	private static int printMenu() {
		return 0;
	}
}//class