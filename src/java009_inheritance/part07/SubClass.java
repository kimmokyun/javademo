package java009_inheritance.part07;

public class SubClass extends SuperClass {

	public SubClass () {
		
	}
	public SubClass(int a, int b, int c) { //2
		super(a,b,c); //3
	}
	public void sumData() {
		System.out.println("합:"+(x+y+z));
	}
}
