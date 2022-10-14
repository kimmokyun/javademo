package java007_class.part01;

public class Calc {
	int left;
	int right;
	char ope; // 연산자는 +,-,/,*만 저장함

	public Calc() {

	}

	public Calc(int left, int right, char ope) {
		this.left = left;
		this.right = right;
		this.ope = ope;
	} // end
public int process() {
	switch(ope) {
	case '+' : return left + right;
	case '-' : return left - right;
	case '*' : return left * right;
	case '/' : return left / right;
	default : return 0;
	}
}
	
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%2d %2c %2d = %d\n", left, ope, right, process());
	}

} // end
