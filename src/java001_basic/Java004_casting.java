package java001_basic;

import org.w3c.dom.css.CSSStyleSheet;

/*
 * 컨트롤 + 스페이스바 : 자동완성
 * 컨트롤 + / : 한 라인 주석 설정 및 해제
 * 컨트롤 + 쉬프트 + / : 여러라인 주석 설정
 * 컨트롤 + 쉬프트 +\ : 여러라인 주석 해제
 * 컨트롤 + 쉬프트 + f : 자동정렬
 * 
 */
public class Java004_casting {

	public static void main(String[] args) {

		byte bNum =2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L or l
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cDate = 'a'; // 오직 한문자
		boolean eNum = true;  // true or false
		System.out.println(dNum);
		System.out.println(fNum);
		
		
		//형변환(casting)
		//묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변호나할때 발생
		//명시적 형변환 :  큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		long gNum=6; // 묵시적 형변환 : int => long
        System.out.println(gNum);
        
        float tNum = (float)2.5; // 명시적 형변환 : double = > float
        System.out.println(tNum);
        
        int x = 101;  //   = 앞에 0 으로시작하면 8진수
        System.out.println(x);
        
        int y = 65;
        System.out.println(y);
        
        
        //데이터 손실이 발생되는 경우
        byte data = (byte)128; 
        System.out.println(data); // -128
                     
        
        
	} // end main()

} // end class






