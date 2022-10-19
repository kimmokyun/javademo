package answ_binding;

public class Engineer extends Employee{
	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getBonus() {
		return 150000;
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+getBonus();
	}
}