package java002_statemments;

public class Jaba022_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //30 4, 6, 9, 11
		// 31 1, 3, 5, 7, 8, 10, 12
		// 28 or 29 : 2

		int year = 2012; // 년도
		int month = 2; //월
		int lastday = -1; // 마지막일
		
		if(!(month>=1 && month<=12)) {
			System.out.println("1월~12월만 가능합니다.");
			return; // main() 메소드를 빠져나옴
		}
		
		switch(month) {
		case 4 :
		case 6 :
		case 9 :
		case 11 : lastday=30; break;
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10:
		case 12 : lastday=31; break;
		default : 
			if(year%4==0 && year%100!=0 || year%400==0) {
				lastday=29; // 윤년
				
			}else {
				lastday=28; // 평년
			}
		
		}
		System.out.printf("%d년도 %d월의 마지막일은 %d입니다.\n", year, month, lastday);
	}

}
