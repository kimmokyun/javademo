package java013_api;

import java.util.Scanner;

/*
 * 단입력 : 5
 * 5 * 1 = 5
 * 5 * 2 = 10
 * ...
 * 5 * 9 = 45
 * 계속하시겠습니까?(종료:n 계속:아무키) n
 * 프로그램 종료
 */




public class Java143_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

while(true) {
	System.out.print("단 입력");
	int dan = sc.nextInt();
	for(int i = 1; i<10; i++) {
		System.out.printf("%d*$%d=%2d\n" , dan,i,dan*i);
	}
	System.out.print("계속입력하겠습니까? (종료:n, 계속:아무키):");
	String chk = sc.next();
	if(chk.equals("n")) {
		System.out.println();
		break;
	}
}










	}

}
