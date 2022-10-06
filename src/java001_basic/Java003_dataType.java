package java001_basic;

/*
 *  리터널(literal) : 그 자체의 값(1, 2, 3, ...., 'a','b','c',...., true,false)
 *  변수(variable) : 하나의 값을 저장하기 위한 메모리 공간
 *  자바에서 제공하는 데이터 타입
 *  1. Primitive DataType (기본 데이터 타입)
 *  문자 - char(2byte)
 *  숫자 - 정수 - byte(1byte), short(2byte), int(4byte), long(8byte)
 *      - 실수 - float(4byte), double(8byte)
 *      
 *  논리 - boolean(1byte)
 *      
 * 2. Reference DataType(참조 데이터 타입)
 *  Array, class, Interface
 * 
 * 시스템에서 인식하는 데이터 타입 크기
 * byte < char, short <int < long < float < double
 */
// syso + 컨트롤 스페이스바 = system.out.println();


public class Java003_dataType {
	public static void main(String[]args) {
    int data; //데이터타입 변수명;
    data = 3; // data변수에 3값을 할당
    // int data = 3;
    System.out.println(data); //3
    
    // data 변수에 새로운 값 할당
		data = 10;
		System.out.println(data);
		
		
		
	}
}





