package java010_abstract_interface.part06;

/*
 * 클래스명 : UserTest에 위에서 정의한 클래스, 인터페이스 상속받음
 * [출력화면]
 * 이름 : 홍길동
 * 점수 : 60점
 */
public class Java107_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserTest ut = new UserTest("홍길동", 3);
System.out.println(ut.toPaint());
	}

}
