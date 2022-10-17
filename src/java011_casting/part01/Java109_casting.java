package java011_casting.part01;
/*
 * 객체형변환 - 참조데이터 타입
 * 1. 상속관게일때 형변환이 가능하다. (is a)
 * 2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 * -업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 * -다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
 */
public class Java109_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Parent p = new Parent();
		Child c = new Child();
		
		p=c; // 업캐스팅(up-casting)
		p.process();		
		
Child d = (Child) p; // 다운캐스팅

//객체 생성 및 업캐스팅
Parent pt = new Child();
pt.process();
//pt.call();

//다운 캐스팅
Child cn = (Child)pt; // 다운캐스팅
		cn.call();
		
		
	}

}
