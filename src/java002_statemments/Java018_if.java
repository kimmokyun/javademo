package java002_statemments;

/*
 * if(조건식){
 *   if(조건식){
 *   
 *   } else{
 *     if(조건식){
 *    }
 *   }
 *   
 */


public class Java018_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean mb = true; // 회원(false) or 비회원(true)
		String grade = "일반"; // 회원등급(VIP,일반)
		
		if(!mb) {
			//회원
			if(grade=="VIP") {
				System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 30);
			}else {
				System.out.printf("고객님은 %이며 %d%%적립\n", grade, 10);
			}
		}else {
			//비회원
			System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 0);
		}
		
		
		
		
	}

}
