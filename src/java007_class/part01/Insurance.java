package java007_class.part01;



public class Insurance {

	String code; // 상품코드
	String name; // 이름
	String type; // 종류
	int payment; // 납입보험료
	
	public Insurance() {
		
	}

	public Insurance(String code, String name, String type, int payment) {
	
		this.code = code;
		this.name = name;
		this.type = type;
		this.payment = payment;
	}
	public String toString() {
		return String.format("%s %s %s %d\n", code, name, type, payment);
	}
	
}
