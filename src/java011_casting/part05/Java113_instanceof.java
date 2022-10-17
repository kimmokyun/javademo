package java011_casting.part05;

class ExamA {
	void prn() {
	}
}

class ExamB extends ExamA {
	void prn() {
	}
}

class ExamC extends ExamB {
	void prn() {
	}

}
///////////////////////////////////////////////////

public class Java113_instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ExamB bb = new ExamB();		
	System.out.println(bb instanceof ExamA);			
			
	ExamA aa = new ExamA();
	System.out.println(aa instanceof ExamB);
	
	
	ExamA ea = new ExamB();
	System.out.println(ea instanceof ExamA);
	System.out.println(ea instanceof ExamB);
	
	
	
	
	
	
	
	
	}


		
	
}
