package java007_class.part07;
/*
 * 
 */



public class Java081_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {10,20,30,40,50};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("==================================");
		/*
		 * 개선된 루프=확장된 루프=개선된 for문
		 * for(int(데이터타입) element(변수) : num(배열,컬렉션) {
		 * system.out.println(element); (수행할문장);
		 * }
		 */
		for(int element : num) {
			System.out.println(element);
		}
		
		
	} //e

} //e
