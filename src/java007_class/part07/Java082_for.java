package java007_class.part07;

public class Java082_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employees[] emp = new Employees[2];
emp[0] = new Employees("john",5000);
emp[1] = new Employees("Steven", 8000);

for(Employees data : emp) {
	data.display();
}
	}

}
