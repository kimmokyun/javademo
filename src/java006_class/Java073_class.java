package java006_class;
/*
 * song클래스의 show()메소드를 아래와 같이 출력이 되도록 show()메소드 구현
 * [실행결과]
 * 노래제목: Dansing queen
 * 가수 : ABBA
 * 앨범: Arrival
 * 작곡가 : Benny Andersson, Bjorn Ulvaeus
 * 년도 : 1997
 * 트랙: 2
 * 
 */




public class Java073_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Song sg= new Song("Dansing Queen", "ABBA", "Arrival",
		new String[] {"benny Andersson", "Bjorn Ulvaeus"}, 1977, 2);
sg.show();
	}

}
