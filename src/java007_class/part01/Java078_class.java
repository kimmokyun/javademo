package java007_class.part01;

/*
 * [출력결과]
 * 기업은행 425523-52325 100000
 * 하나은행 52253-22623 153000
 * 신한은행 16239-95235 2560000
 * 총납입액:509000
 */

public class Java078_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard[] is = new CreditCard[3];
		is[0] = new CreditCard("기업은행", "425523-52325",100000);
		is[1] = new CreditCard("하나은행", "52253-22623", 150000);
		is[2] = new CreditCard("신한은행", "16239-95235",256000);
				int sum=0;
				for(int i=0; i<is.length; i++) {
					sum +=is[i].pay;   
					System.out.println(is[i].toString());
				}
				System.out.println("총납입액:"+sum);
	}

}
