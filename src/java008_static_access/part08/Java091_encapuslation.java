package java008_static_access.part08;

public class Java091_encapuslation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Time time = new Time();
time.setHour(12);
time.setMinute(10);
time.setSecond(20);
System.out.printf("%d:%d:%d\n", time.getHour(), time.getMinute(), time.getSecond());
	}

}
