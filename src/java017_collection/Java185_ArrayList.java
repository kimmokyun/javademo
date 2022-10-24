package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<String>();
aList.add(new String("Java"));
aList.add(new String("jsp"));
aList.add(new String("spring"));
prnDisplay(aList);
process(aList);
		
		
	} //end ma

	public static void prnDisplay(ArrayList<String> aList) {
		//aList 매게변수의 요소에서 'J' or 'j'가 포함되여잇는 요소만
		//출력하는 프로그램을 구현하세요.
		for(String sn:aList) {
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
		}
	} //end prn
	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("jsp"));
	}
} // end class
